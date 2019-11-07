package at.kaindorf.demomod.items;

import at.kaindorf.demomod.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemTool;

public class CompactedPickaxe extends ItemPickaxe
{
    public CompactedPickaxe(String name)
    {
        super(ToolMaterial.DIAMOND);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.TOOLS); }
}
