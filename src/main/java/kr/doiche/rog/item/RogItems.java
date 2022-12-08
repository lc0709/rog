package kr.doiche.rog.item;

import kr.doiche.rog.RogMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RogItems{
    public static final Item RAW_ORE_ITEM = registerItem("raw_ore_item",
            new Item(new FabricItemSettings().group(RogItemgroups.ROG))
    );
    public static final Item ORE = registerItem("ore",
            new Item(new FabricItemSettings().group(RogItemgroups.ROG))
    );

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(RogMod.MOD_ID, name), item);
    }
    public static void registerItems(){
        RogMod.LOGGER.debug("Registering " + RogMod.MOD_ID + " Items...");
    }
}
