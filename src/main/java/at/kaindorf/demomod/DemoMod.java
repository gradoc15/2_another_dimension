package at.kaindorf.demomod;

import at.kaindorf.demomod.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = DemoMod.MODID, name = DemoMod.NAME, version = DemoMod.VERSION)
public class DemoMod
{
    public static final String MODID = "demomod";
    public static final String NAME = "My mod";
    public static final String VERSION = "0.8";

    private static Logger logger;

    @Mod.Instance
    public static DemoMod instance;

    @SidedProxy(clientSide = "at.kaindorf.demomod.proxy.ClientProxy",
                serverSide = "at.kaindorf.demomod.proxy.ServerProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
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
