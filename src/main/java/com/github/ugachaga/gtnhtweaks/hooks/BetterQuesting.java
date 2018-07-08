package com.github.ugachaga.gtnhtweaks.hooks;

import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;

import com.github.gloomyfolken.hooklib.asm.Hook;
import com.github.gloomyfolken.hooklib.asm.ReturnCondition;

public class BetterQuesting
{
    // Better Questing: disable update notification
    @Hook(returnCondition = ReturnCondition.ALWAYS)
    public static void onPlayerLogin(betterquesting.client.UpdateNotification n, PlayerLoggedInEvent e) {}

    // Better Questing - Standard Expansion: disable update notification
    @Hook(returnCondition = ReturnCondition.ALWAYS)
    public static void onPlayerLogin(bq_standard.client.gui.UpdateNotification n, PlayerLoggedInEvent e) {}

    // Better Questing - RF Expansion: disable update notification
    @Hook(returnCondition = ReturnCondition.ALWAYS)
    public static void onPlayerLogin(bq_rf.client.gui.UpdateNotification n, PlayerLoggedInEvent e) {}
}
