package at.kaindorf.demomod;

import at.kaindorf.demomod.blocks.OneBlock;
import at.kaindorf.demomod.items.BinarySwordItem;
import at.kaindorf.demomod.items.HexaSwordItem;
import at.kaindorf.demomod.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSword;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;


@Mod(modid = AnotherDimensionMod.MODID, name = AnotherDimensionMod.NAME, version = AnotherDimensionMod.VERSION)
public class AnotherDimensionMod
{
    public static final String MODID = "demomod";
    public static final String NAME = "My First Mod";
    public static final String VERSION = "0.8";

    @Mod.Instance
    public static AnotherDimensionMod instance;
    public static Item.ToolMaterial toolMaterial;
    public static Item hexasword, binarysword;

    @SidedProxy(clientSide = "at.kaindorf.demomod.proxy.ClientProxy",
                serverSide = "at.kaindorf.demomod.proxy.ServerProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
       proxy.preInit(event);
       //-----------------------------
       //SWORDS:
        toolMaterial = EnumHelper.addToolMaterial("Hexa Sword", 4, 10000, 20.0F,
                5.0F, 15);
       hexasword = new HexaSwordItem("hexasword");

        toolMaterial = EnumHelper.addToolMaterial("Binary Sword", 2, 8500, 15.0F,
                3.5F, 15);
        binarysword = new BinarySwordItem("binarysword");

    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }

}
