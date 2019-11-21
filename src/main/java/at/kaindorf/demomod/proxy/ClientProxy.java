package at.kaindorf.demomod.proxy;

import at.kaindorf.demomod.AnotherDimensionMod;
import at.kaindorf.demomod.init.ModItems;
import at.kaindorf.demomod.items.BinarySwordItem;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
        GameRegistry.addShapedRecipe(new ResourceLocation("binarysword"), null,
                new ItemStack(CommonProxy.KEY_GRAY),
                "X",
                "Y",
                "Z",
                'X', CommonProxy.ZERO_BLOCK,
                'Y', CommonProxy.ONE_BLOCK,
                'Z', Items.STICK);
    }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event){
    }
}
