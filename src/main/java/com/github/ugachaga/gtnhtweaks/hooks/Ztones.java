package com.github.ugachaga.gtnhtweaks.hooks;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.github.gloomyfolken.hooklib.asm.Hook;
import com.github.gloomyfolken.hooklib.asm.ReturnCondition;

public class Ztones
{
    // Ofanix able to place blocks replacing liquids
    @Hook(returnCondition = ReturnCondition.ALWAYS)
    public static boolean onItemUse(com.riciJak.Ztones.item.tool.ItemOfanix ofanix, ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ)
    {
        switch (side)
        {
            case 0:
                --y;
                break;
            case 1:
                ++y;
                break;
            case 2:
                --z;
                break;
            case 3:
                ++z;
                break;
            case 4:
                --x;
                break;
            case 5:
                ++x;
                break;
            default:
        }

        if (!player.canPlayerEdit(x, y, z, side, stack))
            return false;

        if (world.isAirBlock(x, y, z) || world.getBlock(x, y, z).isReplaceable(world, x, y, z)) // added isReplaceable check
        {
            world.spawnParticle("portal", player.posX, player.posY, player.posZ, 0.0D, 0.0D, 0.0D);
            world.playSoundEffect((double) x + 0.5D, (double) y + 0.5D, (double) z + 0.5D, "mob.endermen.portal", 1.0F, Item.itemRand.nextFloat() * 0.4F + 0.8F);
            world.setBlock(x, y, z, Blocks.cobblestone);
            return true;
        }
        return false;
    }

}
