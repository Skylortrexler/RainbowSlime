package crimsonfluff.crimsonslimes.entities;

import crimsonfluff.crimsonslimes.init.blocksInit;
import crimsonfluff.crimsonslimes.init.itemsInit;
import net.minecraft.core.particles.ItemParticleOption;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.*;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Slime;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import org.jetbrains.annotations.NotNull;

public class CrimsonSlimeEntity extends Slime {
    public static final EntityDataAccessor<Integer> DATA_COLOUR = SynchedEntityData.defineId(CrimsonSlimeEntity.class, EntityDataSerializers.INT);

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(DATA_COLOUR, random.nextInt(17));
    }

    public CrimsonSlimeEntity(EntityType<? extends Slime> entityIn, Level levelIn) {
        super(entityIn, levelIn);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes().
            add(Attributes.MAX_HEALTH, 4.0D).
            add(Attributes.ATTACK_DAMAGE, 4.0D).
            add(Attributes.MOVEMENT_SPEED, 0.25D);
    }

    public void setSize(int s) { super.setSize(s, true); }

    @Override
    protected @NotNull ParticleOptions getParticleType() {
        Block mimic;
        switch (this.entityData.get(DATA_COLOUR)) {
            default -> mimic = blocksInit.SLIME_WHITE_BLOCK.get();
            case 1 -> mimic = blocksInit.SLIME_ORANGE_BLOCK.get();
            case 2 -> mimic = blocksInit.SLIME_MAGENTA_BLOCK.get();
            case 3 -> mimic = blocksInit.SLIME_LIGHT_BLUE_BLOCK.get();
            case 4 -> mimic = blocksInit.SLIME_YELLOW_BLOCK.get();
            case 5 -> mimic = blocksInit.SLIME_LIME_BLOCK.get();
            case 6 -> mimic = blocksInit.SLIME_PINK_BLOCK.get();
            case 7 -> mimic = blocksInit.SLIME_GRAY_BLOCK.get();
            case 8 -> mimic = blocksInit.SLIME_LIGHT_GRAY_BLOCK.get();
            case 9 -> mimic = blocksInit.SLIME_CYAN_BLOCK.get();
            case 10 -> mimic = blocksInit.SLIME_PURPLE_BLOCK.get();
            case 11 -> mimic = blocksInit.SLIME_BLUE_BLOCK.get();
            case 12 -> mimic = blocksInit.SLIME_BROWN_BLOCK.get();
            case 13 -> mimic = blocksInit.SLIME_GREEN_BLOCK.get();
            case 14 -> mimic = blocksInit.SLIME_RED_BLOCK.get();
            case 15 -> mimic = blocksInit.SLIME_BLACK_BLOCK.get();
            case 16 -> mimic = blocksInit.SLIME_MISSING_BLOCK.get();
        }

        return new ItemParticleOption(ParticleTypes.ITEM, new ItemStack(mimic));
    }

    @Override
    public void remove(@NotNull Entity.RemovalReason p_149847_) {
        int i = this.getSize();
        if (!this.level.isClientSide && i > 1 && this.isDeadOrDying() && !this.isRemoved()) {
            Component component = this.getCustomName();
            boolean flag = this.isNoAi();

            float f = (float)i / 4.0F;
            int j = i / 2;
            int k = 2 + this.random.nextInt(3);

            for(int l = 0; l < k; ++l) {
                float f1 = ((float)(l % 2) - 0.5F) * f;
                float f2 = ((float)(l / 2) - 0.5F) * f;
                CrimsonSlimeEntity slime = (CrimsonSlimeEntity) this.getType().create(this.level);

                if (slime != null) {
                    if (this.isPersistenceRequired()) slime.setPersistenceRequired();
                    slime.setCustomName(component);
                    slime.setNoAi(flag);
                    slime.setInvulnerable(this.isInvulnerable());

                    slime.setSize(j);
                    slime.moveTo(this.getX() + (double)f1, this.getY() + 0.5D, this.getZ() + (double)f2, this.random.nextFloat() * 360.0F, 0.0F);
                    slime.setColour(this.getEntityData().get(DATA_COLOUR));

                    this.level.addFreshEntity(slime);
                }
            }
        }

        //super.remove(p_149847_);
        // so super.slime.remove() is not called
        this.setRemoved(p_149847_);
        if (p_149847_ == Entity.RemovalReason.KILLED) this.gameEvent(GameEvent.ENTITY_KILLED);
        this.invalidateCaps();
    }

    @Override
    public void addAdditionalSaveData(@NotNull CompoundTag tag) {
        super.addAdditionalSaveData(tag);
        tag.putInt("Colour", this.entityData.get(DATA_COLOUR));
    }

    @Override
    public void readAdditionalSaveData(@NotNull CompoundTag tag) {
        super.readAdditionalSaveData(tag);

        if (tag.contains("Colour"))
            this.entityData.set(DATA_COLOUR, tag.getInt("Colour"));
    }

    public void setColour(int colour) {
        this.entityData.set(DATA_COLOUR, colour);
    }

    // let vanilla sort out a valid loot list
    // and replace minecraft:slime_ball with coloured slime ball
    @Override
    protected void dropFromLootTable(@NotNull DamageSource p_21389_, boolean p_21390_) {
        ResourceLocation resourcelocation = this.getLootTable();
        LootTable loottable = this.level.getServer().getLootTables().get(resourcelocation);
        LootContext.Builder lootcontext$builder = this.createLootContext(p_21390_, p_21389_);
        LootContext ctx = lootcontext$builder.create(LootContextParamSets.ENTITY);

        Item itm;
        ItemStack itemStack;

        for (ItemStack item : loottable.getRandomItems(ctx)) {
            if (item.getItem() == Items.SLIME_BALL) {
                switch (this.getEntityData().get(DATA_COLOUR)) {
                    default -> itm = itemsInit.SLIME_BALL_WHITE.get();
                    case 1 -> itm = itemsInit.SLIME_BALL_ORANGE.get();
                    case 2 -> itm = itemsInit.SLIME_BALL_MAGENTA.get();
                    case 3 -> itm = itemsInit.SLIME_BALL_LIGHT_BLUE.get();
                    case 4 -> itm = itemsInit.SLIME_BALL_YELLOW.get();
                    case 5 -> itm = itemsInit.SLIME_BALL_LIME.get();
                    case 6 -> itm = itemsInit.SLIME_BALL_PINK.get();
                    case 7 -> itm = itemsInit.SLIME_BALL_GRAY.get();
                    case 8 -> itm = itemsInit.SLIME_BALL_LIGHT_GRAY.get();
                    case 9 -> itm = itemsInit.SLIME_BALL_CYAN.get();
                    case 10 -> itm = itemsInit.SLIME_BALL_PURPLE.get();
                    case 11 -> itm = itemsInit.SLIME_BALL_BLUE.get();
                    case 12 -> itm = itemsInit.SLIME_BALL_BROWN.get();
                    case 13 -> itm = itemsInit.SLIME_BALL_GREEN.get();
                    case 14 -> itm = itemsInit.SLIME_BALL_RED.get();
                    case 15 -> itm = itemsInit.SLIME_BALL_BLACK.get();
                    case 16 -> itm = itemsInit.SLIME_BALL_MISSING.get();
                }

                itemStack = new ItemStack(itm, item.getCount());
                itemStack.setTag(item.getTag());
                this.spawnAtLocation(itemStack);

            } else
                this.spawnAtLocation(item);
        }
    }

    @Override
    public Component getName() {
        Component component = getCustomName();
        if (component != null)
            return removeAction(component);

        else
            return new TextComponent(getTypeName().getString() + " (" + new TranslatableComponent("colour.crimsonslimes." + this.entityData.get(DATA_COLOUR)).getString() + ")");
    }

    private static Component removeAction(Component p_20141_) {
        MutableComponent mutablecomponent = p_20141_.plainCopy().setStyle(p_20141_.getStyle().withClickEvent((ClickEvent)null));

        for(Component component : p_20141_.getSiblings()) {
            mutablecomponent.append(removeAction(component));
        }

        return mutablecomponent;
    }
}
