package at.kaindorf.demomod.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.world.World;

public class HexaCow extends EntityCow {


    public HexaCow(World worldin) {
        super(worldin);
    }

    @Override
    public EntityCow createChild(EntityAgeable ageable) {
        return new HexaCow(world);
    }
}
