package com.yessaboy18.deltarunemc.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.world.World;

public class BleedingEffect extends StatusEffect {

    public BleedingEffect() {
        super(StatusEffectCategory.HARMFUL, 0x8B0000); // dark red
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return duration % 20 == 0;
    }

    @Override
    public boolean applyUpdateEffect(LivingEntity entity, int amplifier) {
        World world = entity.getWorld();
        if (world.isClient()) return false;

        entity.damage(
                world.getDamageSources().generic(),
                2.0F
        );

        entity.addStatusEffect(new StatusEffectInstance(
                StatusEffects.SLOWNESS,
                60,
                0,
                true,
                false
        ));

        entity.addStatusEffect(new StatusEffectInstance(
                StatusEffects.WEAKNESS,
                60,
                0,
                true,
                false
        ));
        return true;
    }
}
