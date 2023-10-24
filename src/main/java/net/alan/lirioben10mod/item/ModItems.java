package net.alan.lirioben10mod.item;

import net.alan.lirioben10mod.LiriosBen10Mod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item OMNITRIXCORE = registerItem("omnitrixcore", new Item(new FabricItemSettings()));
    public static final Item OMNITRIX = registerItem("omnitrix", new Item(new FabricItemSettings()));

    private static void addItemToIngredientTabItemGroup(FabricItemGroupEntries entries) {
    entries.add(OMNITRIXCORE);
    entries.add(OMNITRIX);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(LiriosBen10Mod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        LiriosBen10Mod.LOGGER.info("Registering Mod Items for " + LiriosBen10Mod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemToIngredientTabItemGroup);
    }
}
