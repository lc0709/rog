package kr.doiche.rog.block;

import kr.doiche.rog.RogMod;
import kr.doiche.rog.item.RogItemgroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class RogBlocks {
    public static final Block ROG_BLOCK = registerBlock(
            "rog_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f).luminance(2).requiresTool()),
            RogItemgroups.ROG
    );

    public static final Block ROG_ORE_BLOCK = registerBlock(
            "rog_ore_block",
            new OreBlock(
                    FabricBlockSettings.of(Material.STONE).strength(4f).luminance(2).requiresTool(),
                    UniformIntProvider.create(3, 7)
            ),
            RogItemgroups.ROG
    );

    public static final Block DEEPSLATE_ROG_ORE_BLOCK = registerBlock(
            "deepslate_rog_ore_block",
            new OreBlock(
                    FabricBlockSettings.of(Material.STONE).strength(4f).luminance(2).requiresTool(),
                    UniformIntProvider.create(3, 7)
            ),
            RogItemgroups.ROG
    );

    private static Block registerBlock(String name, Block block, ItemGroup tab){
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(RogMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab){
        return Registry.register(
                Registry.ITEM,
                new Identifier(RogMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab))
        );
    }

    public static void registerBlocks(){
        RogMod.LOGGER.debug("Registering " + RogMod.MOD_ID + " Blocks...");
    }
}
