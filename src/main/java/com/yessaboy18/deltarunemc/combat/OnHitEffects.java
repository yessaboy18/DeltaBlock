package com.yessaboy18.deltarunemc.combat;

import com.yessaboy18.deltarunemc.effect.ModEffects;
import com.yessaboy18.deltarunemc.util.ModTags;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.item.Item;

import java.util.Map;

public class OnHitEffects {

    public static final Map<TagKey<Item>, StatusEffectInstance> EFFECTS_BY_TAG =
            Map.of(
                    ModTags.Items.BLEEDING_HIT,
                    new StatusEffectInstance(
                            ModEffects.BLEEDING,
                            100,
                            0
                    )
            );

    public static void apply(ItemStack stack, LivingEntity target) {
        EFFECTS_BY_TAG.forEach((tag, effect) -> {
            if (stack.isIn(tag)) {
                target.addStatusEffect(new StatusEffectInstance(effect));
            }
        });
    }
}
