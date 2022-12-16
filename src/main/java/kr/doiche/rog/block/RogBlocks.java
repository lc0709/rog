package kr.doiche.rog.block;

import kr.doiche.rog.RogMod;
import kr.doiche.rog.block.block.JumpBlock;
import kr.doiche.rog.item.RogItemgroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class RogBlocks {

    private static final FabricBlockSettings metal = FabricBlockSettings.of(Material.METAL);
    private static final FabricBlockSettings stone = FabricBlockSettings.of(Material.STONE);

    public static final Block ROG_BLOCK = new Block(metal.strength(4f).requiresTool());
    public static final Block ROG_ORE_BLOCK = new OreBlock(stone.strength(4f).requiresTool(), UniformIntProvider.create(3, 7));
    public static final Block DEEPSLATE_ROG_ORE_BLOCK = new OreBlock(stone.strength(4f).requiresTool(), UniformIntProvider.create(3, 7));
    public static final Block JUMP_BLOCK = new JumpBlock(metal.strength(2f).requiresTool());
    static {
        registerBlock("rog_block", ROG_BLOCK, RogItemgroups.ROG);
        registerBlock("rog_ore_block", ROG_ORE_BLOCK, RogItemgroups.ROG);
        registerBlock("deepslate_rog_ore_block", DEEPSLATE_ROG_ORE_BLOCK, RogItemgroups.ROG);
        registerBlock("jump_block", JUMP_BLOCK, RogItemgroups.ROG);
    }

    private static void registerBlock(String name, Block block, ItemGroup tab){
        registerBlockItem(name, block, tab);
        Registry.register(Registry.BLOCK, new Identifier(RogMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block, ItemGroup tab){
        BlockItem blockItem = new BlockItem(block, new FabricItemSettings().group(tab));
        Registry.register(Registry.ITEM, new Identifier(RogMod.MOD_ID, name), blockItem);
    }

    public static void registerBlocks(){
        RogMod.LOGGER.debug("Registering " + RogMod.MOD_ID + " Blocks...");
    }
}
