package net.alan.lirioben10mod.item;

import net.alan.lirioben10mod.LiriosBen10Mod;
import net.alan.lirioben10mod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup BEN10_GROUP = Registry.register(Registries.ITEM_GROUP,
        new Identifier(LiriosBen10Mod.MOD_ID, "ben10"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ben10"))
                    .icon(() -> new ItemStack(ModItems.OMNITRIXCORE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.OMNITRIXCORE);
                        entries.add(ModItems.OMNITRIX);

                        entries.add(ModBlocks.OMNI_BLOCK);

                    }).build());

    public static void registerItemGroups() {
        LiriosBen10Mod.LOGGER.info("Registering Item Groups for " + LiriosBen10Mod.MOD_ID);
    }
}
