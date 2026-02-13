package com.yessaboy18.deltarunemc.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.world.World;

public class BleedingEffect extends StatusEffect {

    public BleedingEffect() {
        super(StatusEffectCategory.HARMFUL, 0x8B0000);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

    @Override
    public boolean applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (!entity.getWorld().isClient()) {
            if (entity.age % 20 == 0) {
                entity.damage(
                        entity.getWorld().getDamageSources().generic(),
                        2.0F
                );
            }
        }
        return true;
    }
}
