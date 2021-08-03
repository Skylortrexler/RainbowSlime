package crimsonfluff.crimsonslimes.entities;

import crimsonfluff.crimsonslimes.init.blocksInit;
import net.minecraft.core.particles.ItemParticleOption;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Slime;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;

public class CrimsonSlimeEntity extends Slime {
    private final int iSLIME_COLOUR;

    public CrimsonSlimeEntity(EntityType<? extends Slime> entityIn, Level levelIn, int SLIME_COLOUR) {
        super(entityIn, levelIn);
        this.iSLIME_COLOUR = SLIME_COLOUR;
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes().
            add(Attributes.MAX_HEALTH, 4.0D).
            add(Attributes.ATTACK_DAMAGE, 4.0D).
            add(Attributes.MOVEMENT_SPEED, 0.25D);
    }

    public void setSize(int s) { this.setSize(s, true); }

    @Override
    protected ParticleOptions getParticleType() {
        Block mimic;
        switch (iSLIME_COLOUR) {
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
            case 10 -> mimic = blocksInit.SLIME_BLUE_BLOCK.get();
            case 11 -> mimic = blocksInit.SLIME_BROWN_BLOCK.get();
            case 12 -> mimic = blocksInit.SLIME_GREEN_BLOCK.get();
            case 13 -> mimic = blocksInit.SLIME_RED_BLOCK.get();
            case 14 -> mimic = blocksInit.SLIME_BLACK_BLOCK.get();
            case 15 -> mimic = blocksInit.SLIME_PURPLE_BLOCK.get();
            case 16 -> mimic = blocksInit.SLIME_MISSING_BLOCK.get();
        }

        return new ItemParticleOption(ParticleTypes.ITEM, new ItemStack(mimic));
    }

    @Override
    public void die(DamageSource damageSource) {
        super.die(damageSource);

        int i = this.getSize();
        if (!this.level.isClientSide && i > 1 && this.isDeadOrDying() && !this.isRemoved()) {
            Component component = this.getCustomName();

            float f = (float)i / 4.0F;
            int j = i / 2;
            int k = 2 + this.random.nextInt(3);

            for(int l = 0; l < k; ++l) {
                float f1 = ((float) (l % 2) - 0.5F) * f;
                float f2 = ((float) (l / 2) - 0.5F) * f;

                CrimsonSlimeEntity slime = (CrimsonSlimeEntity) this.getType().create(this.level);
                if (slime != null) {
                    if (this.isPersistenceRequired()) slime.setPersistenceRequired();

                    slime.setCustomName(component);
                    slime.setNoAi(this.isNoAi());
                    slime.setInvulnerable(this.isInvulnerable());
                    slime.setSize(j, true);
                    slime.moveTo(this.getX() + (double) f1, this.getY() + 0.5D, this.getZ() + (double) f2, this.random.nextFloat() * 360.0F, 0.0F);
                    this.level.addFreshEntity(slime);
                }
            }
        }
    }
}
