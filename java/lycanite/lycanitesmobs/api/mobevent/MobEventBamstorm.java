package lycanite.lycanitesmobs.api.mobevent;

import lycanite.lycanitesmobs.api.info.GroupInfo;
import net.minecraft.entity.EntityLiving;
import net.minecraft.world.World;

public class MobEventBamstorm extends MobEventBase {


    // ==================================================
    //                     Constructor
    // ==================================================
	public MobEventBamstorm(String name, GroupInfo group) {
		super(name, group);
	}


    // ==================================================
    //                       Start
    // ==================================================
    public void onStart(World world) {
        super.onStart(world);
		world.getWorldInfo().setRaining(true);
		world.getWorldInfo().setThundering(true);
    }


    // ==================================================
    //                      Finish
    // ==================================================
    public void onFinish() {
        super.onFinish();
    }
	
	
    // ==================================================
    //                   Spawn Effects
    // ==================================================
    @Override
	public void onSpawn(EntityLiving entity) {
		super.onSpawn(entity);
	}
}
