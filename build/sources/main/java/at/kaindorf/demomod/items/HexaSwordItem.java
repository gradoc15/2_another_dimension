package at.kaindorf.demomod.items;

import at.kaindorf.demomod.AnotherDimensionMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class HexaSwordItem extends ItemSword {

    public HexaSwordItem(String name) {
        super(AnotherDimensionMod.toolMaterial);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.COMBAT);
    }

}
