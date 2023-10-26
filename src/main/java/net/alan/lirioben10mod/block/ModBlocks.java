package net.alan.lirioben10mod.block;

import net.alan.lirioben10mod.LiriosBen10Mod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block OMNI_BLOCK = registerBlock("omni_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(LiriosBen10Mod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
            return Registry .register(Registries.ITEM, new Identifier(LiriosBen10Mod.MOD_ID, name),
                    new BlockItem(block, new FabricItemSettings()));
    }


    public static void registerModBlocks() {
        LiriosBen10Mod.LOGGER.info("Registering ModBlocks for " + LiriosBen10Mod.MOD_ID);
    }
}
