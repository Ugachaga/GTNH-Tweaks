package com.github.ugachaga.gtnhtweaks;

import cpw.mods.fml.common.Mod;

import com.github.gloomyfolken.hooklib.minecraft.HookLoader;
import com.github.gloomyfolken.hooklib.minecraft.PrimaryClassTransformer;

@Mod(modid = TweaksMod.MODID, name = TweaksMod.NAME, version = TweaksMod.VERSION)
public class TweaksMod extends HookLoader
{
    public static final String MODID = "gtnhtweaks";
    public static final String NAME = "GTNH Tweaks";
    public static final String VERSION = "@VERSION@";

    @Override
    public String[] getASMTransformerClass()
    {
        return new String[]{PrimaryClassTransformer.class.getName()};
    }

    @Override
    protected void registerHooks()
    {
        registerHookContainer("com.github.ugachaga.gtnhtweaks.hooks.BetterQuesting");
        registerHookContainer("com.github.ugachaga.gtnhtweaks.hooks.Ztones");
    }
}
