package minecraft.skylorbeck.website.rainbowslime.entity;

import minecraft.skylorbeck.website.rainbowslime.init.initBlocks;
import minecraft.skylorbeck.website.rainbowslime.init.initItems;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.SlimeEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.context.LootContextTypes;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.particle.ItemStackParticleEffect;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.text.*;
import net.minecraft.util.Identifier;
import net.minecraft.world.*;
import net.minecraft.world.event.GameEvent;
import org.jetbrains.annotations.Nullable;

public class RainbowSlimeEntity extends SlimeEntity {
    public static final TrackedData<Integer> iCOLOUR = DataTracker.registerData(RainbowSlimeEntity.class, TrackedDataHandlerRegistry.INTEGER);
//    public Identifier texture = null;

    public RainbowSlimeEntity(EntityType<? extends SlimeEntity> entityIn, World levelIn) {
        super(entityIn, levelIn);
    }

    @Override
    protected void initDataTracker() {
        super.initDataTracker();
        this.dataTracker.startTracking(iCOLOUR, world.random.nextInt(17));      // inc 'missing'
//        setTexture();
    }

    @Override
    protected void dropLoot(DamageSource source, boolean causedByPlayer) {
        Identifier identifier = this.getLootTable();
        LootTable lootTable = this.world.getServer().getLootManager().getTable(identifier);
        net.minecraft.loot.context.LootContext.Builder builder = this.getLootContextBuilder(causedByPlayer, source);

        Item mimic;
        ItemStack itemStack;

        for (ItemStack lootStack : lootTable.generateLoot(builder.build(LootContextTypes.ENTITY))) {
            if (lootStack.getItem() == Items.SLIME_BALL) {
                switch (this.dataTracker.get(iCOLOUR)) {
                    default -> mimic = initItems.SLIME_BALL_WHITE;
                    case 1 -> mimic = initItems.SLIME_BALL_ORANGE;
                    case 2 -> mimic = initItems.SLIME_BALL_MAGENTA;
                    case 3 -> mimic = initItems.SLIME_BALL_LIGHT_BLUE;
                    case 4 -> mimic = initItems.SLIME_BALL_YELLOW;
                    case 5 -> mimic = initItems.SLIME_BALL_LIME;
                    case 6 -> mimic = initItems.SLIME_BALL_PINK;
                    case 7 -> mimic = initItems.SLIME_BALL_GRAY;
                    case 8 -> mimic = initItems.SLIME_BALL_LIGHT_GRAY;
                    case 9 -> mimic = initItems.SLIME_BALL_CYAN;
                    case 10 -> mimic = initItems.SLIME_BALL_PURPLE;
                    case 11 -> mimic = initItems.SLIME_BALL_BLUE;
                    case 12 -> mimic = initItems.SLIME_BALL_BROWN;
                    case 13 -> mimic = initItems.SLIME_BALL_GREEN;
                    case 14 -> mimic = initItems.SLIME_BALL_RED;
                    case 15 -> mimic = initItems.SLIME_BALL_BLACK;
                    case 16 -> mimic = initItems.SLIME_BALL_MISSING;
                }

                itemStack = new ItemStack(mimic, lootStack.getCount());
                itemStack.setNbt(lootStack.getNbt());
                this.dropStack(itemStack);

            } else
                this.dropStack(lootStack);
        };
    }

    public void writeCustomDataToNbt(NbtCompound nbt) {
        super.writeCustomDataToNbt(nbt);
        nbt.putInt("Colour", this.dataTracker.get(iCOLOUR));
    }

    public void readCustomDataFromNbt(NbtCompound nbt) {
        super.readCustomDataFromNbt(nbt);

        if (nbt.contains("Colour")) {
            this.dataTracker.set(iCOLOUR, nbt.getInt("Colour"));
//            setTexture();
        }
    }

//    public void setTexture() {
//        int d = this.dataTracker.get(iCOLOUR);
//        if (d == 16)
//            this.texture = new Identifier(CrimsonSlimes.MOD_ID, "textures/entity/missing.png");
//        else
//            this.texture = new Identifier(CrimsonSlimes.MOD_ID, "textures/entity/" + DyeColor.byId(d).getName() + ".png");
//    }

    @Override
    public Text getName() {
        Text text = this.getCustomName();
        if (text != null)
            return removeClickEvents(text);

        else
            return new LiteralText(getDefaultName().getString() + " (" + new TranslatableText("colour." + this.getDataTracker().get(iCOLOUR)).getString() + ")");
    }

    private static Text removeClickEvents(Text textComponent) {
        MutableText mutableText = textComponent.copy().setStyle(textComponent.getStyle().withClickEvent((ClickEvent)null));

        for (Text text : textComponent.getSiblings()) {
            mutableText.append(removeClickEvents(text));
        }

        return mutableText;
    }

    public static DefaultAttributeContainer.Builder createSlimeAttributes() {
        return MobEntity.createMobAttributes()
            .add(EntityAttributes.GENERIC_MAX_HEALTH, 4.0D)
            .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 4.0D)
            .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.25D);
    }

    public void setSize(int s) { super.setSize(s, true); }

    @Override
    protected ParticleEffect getParticles() {
        Block mimic;
        switch (this.dataTracker.get(iCOLOUR)) {
            default -> mimic = initBlocks.SLIME_WHITE_BLOCK;
            case 1 -> mimic = initBlocks.SLIME_ORANGE_BLOCK;
            case 2 -> mimic = initBlocks.SLIME_MAGENTA_BLOCK;
            case 3 -> mimic = initBlocks.SLIME_LIGHT_BLUE_BLOCK;
            case 4 -> mimic = initBlocks.SLIME_YELLOW_BLOCK;
            case 5 -> mimic = initBlocks.SLIME_LIME_BLOCK;
            case 6 -> mimic = initBlocks.SLIME_PINK_BLOCK;
            case 7 -> mimic = initBlocks.SLIME_GRAY_BLOCK;
            case 8 -> mimic = initBlocks.SLIME_LIGHT_GRAY_BLOCK;
            case 9 -> mimic = initBlocks.SLIME_CYAN_BLOCK;
            case 10 -> mimic = initBlocks.SLIME_PURPLE_BLOCK;
            case 11 -> mimic = initBlocks.SLIME_BLUE_BLOCK;
            case 12 -> mimic = initBlocks.SLIME_BROWN_BLOCK;
            case 13 -> mimic = initBlocks.SLIME_GREEN_BLOCK;
            case 14 -> mimic = initBlocks.SLIME_RED_BLOCK;
            case 15 -> mimic = initBlocks.SLIME_BLACK_BLOCK;
            case 16 -> mimic = initBlocks.SLIME_MISSING_BLOCK;
        }

        return new ItemStackParticleEffect(ParticleTypes.ITEM, new ItemStack(mimic));
    }

    public void setColour(int colour) { this.dataTracker.set(iCOLOUR, colour); }

    public void remove(RemovalReason reason) {
        int i = this.getSize();
        if (!this.world.isClient && i > 1 && this.isDead()) {
            Text text = this.getCustomName();
            boolean bl = this.isAiDisabled();
            float f = (float)i / 4.0F;
            int j = i / 2;
            int k = 2 + this.random.nextInt(3);

            for(int l = 0; l < k; ++l) {
                float g = ((float)(l % 2) - 0.5F) * f;
                float h = ((float)(l / 2) - 0.5F) * f;

                RainbowSlimeEntity slimeEntity = (RainbowSlimeEntity)this.getType().create(this.world);
                if (slimeEntity != null) {
                    if (this.isPersistent()) slimeEntity.setPersistent();

                    slimeEntity.setCustomName(text);
                    slimeEntity.setAiDisabled(bl);
                    slimeEntity.setInvulnerable(this.isInvulnerable());
                    slimeEntity.setSize(j, true);
                    slimeEntity.refreshPositionAndAngles(this.getX() + (double) g, this.getY() + 0.5D, this.getZ() + (double) h, this.random.nextFloat() * 360.0F, 0.0F);
                    slimeEntity.setColour(this.dataTracker.get(iCOLOUR));

                    this.world.spawnEntity(slimeEntity);
                }
            }
        }

        this.setRemoved(reason);
        if (reason == Entity.RemovalReason.KILLED) this.emitGameEvent(GameEvent.ENTITY_KILLED);

//        super.remove(reason);
    }

    // Can't use the biome removal technique, because, who knows?
    @Nullable
    @Override
    public EntityData initialize(ServerWorldAccess world, LocalDifficulty difficulty, SpawnReason spawnReason, @Nullable EntityData entityData, @Nullable NbtCompound entityNbt) {
        if (spawnReason == SpawnReason.NATURAL) {
            this.dataTracker.set(iCOLOUR, world.getRandom().nextInt(17));
//            setTexture();
        }

        return super.initialize(world, difficulty, spawnReason, entityData, entityNbt);
    }
}
