package com.yessaboy18.deltarunemc.combat;

import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.ActionResult;

public class CombatEvents {

    public static void register() {
        AttackEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> {

            if (world.isClient()) return ActionResult.PASS;
            if (!(entity instanceof LivingEntity target)) return ActionResult.PASS;

            OnHitEffects.apply(player.getStackInHand(hand), target);

            return ActionResult.PASS;
        });
    }
}
