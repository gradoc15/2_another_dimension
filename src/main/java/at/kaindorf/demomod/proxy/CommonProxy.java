package at.kaindorf.demomod.proxy;

import at.kaindorf.demomod.AnotherDimensionMod;
import at.kaindorf.demomod.blocks.OneBlock;
import at.kaindorf.demomod.blocks.ZeroBlock;
import at.kaindorf.demomod.items.HexaSwordItem;
import at.kaindorf.demomod.items.KeyItem;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = AnotherDimensionMod.MODID)
public class CommonProxy {

    public static Item KEY_GRAY = new KeyItem("graykey");
    public static Block ONE_BLOCK = new OneBlock("oneblock");
    public static Block ZERO_BLOCK = new ZeroBlock("zeroblock");

    public void preInit(FMLPreInitializationEvent e){}
    public void init(FMLInitializationEvent e){}
    public void postInit(FMLPostInitializationEvent e){}

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        event.getRegistry().registerAll(ONE_BLOCK);
        event.getRegistry().registerAll(ZERO_BLOCK);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event){

        event.getRegistry().registerAll(KEY_GRAY);
        event.getRegistry().registerAll(AnotherDimensionMod.hexasword);
        event.getRegistry().registerAll(AnotherDimensionMod.binarysword);

    }

    @SubscribeEvent
    public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new ItemBlock(ONE_BLOCK).setRegistryName(ONE_BLOCK.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ZERO_BLOCK).setRegistryName(ZERO_BLOCK.getRegistryName()));
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event) {

        registerRender(KEY_GRAY);
        registerRender(AnotherDimensionMod.hexasword);
        registerRender(AnotherDimensionMod.binarysword);
        registerRender(Item.getItemFromBlock(ONE_BLOCK));
        registerRender(Item.getItemFromBlock(ZERO_BLOCK));
    }

    public static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0,
                new ModelResourceLocation(item.getRegistryName(), "inventory"));

    }
}
