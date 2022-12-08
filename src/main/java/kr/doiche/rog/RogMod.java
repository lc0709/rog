package kr.doiche.rog;

import kr.doiche.rog.item.RogItems;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RogMod implements ModInitializer {
	public static final String MOD_ID = "rog";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static Item ROG_ITEM;

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		RogItems.registerItems();
	}
}
