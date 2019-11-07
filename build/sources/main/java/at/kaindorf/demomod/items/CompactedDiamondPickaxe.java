package at.kaindorf.demomod.items;

import at.kaindorf.demomod.AnotherDimensionMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class CompactedDiamondPickaxe extends ItemPickaxe
{
    public CompactedDiamondPickaxe(String name)
    {
        super(AnotherDimensionMod.toolMaterial);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.TOOLS);
    }
}
