package kr.doiche.rog.item;

import kr.doiche.rog.RogMod;
import kr.doiche.rog.item.item.EightBallItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class RogItems{
    private static final FabricItemSettings settings = new FabricItemSettings().group(RogItemgroups.ROG);
    public static final Item ROG_ITEM = new Item(settings.rarity(Rarity.EPIC));
    public static final Item ROG_ORE = new Item(settings.rarity(Rarity.EPIC));
    public static final Item EIGHT_BALL_ITEM = new EightBallItem(settings.maxCount(1));

    static {
        registerItem("rog_item", ROG_ITEM);
        registerItem("rog_ore", ROG_ORE);
        registerItem("eight_ball_item", EIGHT_BALL_ITEM);
    }

    private static void registerItem(String name, Item item){
        Registry.register(Registry.ITEM, new Identifier(RogMod.MOD_ID, name), item);
    }

    public static void registerItems(){
        RogMod.LOGGER.debug("Registering " + RogMod.MOD_ID + " Items...");

    }
}
