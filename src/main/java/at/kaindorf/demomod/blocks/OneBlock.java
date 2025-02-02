package at.kaindorf.demomod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class OneBlock extends Block {

    public OneBlock(String name) {
        super(Material.ROCK);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

        //Configurate block:
        setHardness(2.0f);
        setResistance(4.0f);
        setSoundType(SoundType.STONE);
    }
}
