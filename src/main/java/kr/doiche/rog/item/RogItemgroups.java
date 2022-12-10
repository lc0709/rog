package kr.doiche.rog.item;

import kr.doiche.rog.RogMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class RogItemgroups {
    public static final ItemGroup ROG = FabricItemGroupBuilder.build(
            new Identifier(RogMod.MOD_ID, "ore"),
            () -> new ItemStack(RogItems.ORE)
    );
}
