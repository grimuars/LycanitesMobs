package lycanite.lycanitesmobs.api.info;


import java.util.HashMap;
import java.util.Map;

import net.minecraft.util.StatCollector;

public class Subspecies {
    // ========== Subspecies Global ==========
    /** The weight used by the default subspecies. **/
    public static int baseSpeciesWeight = 400;
    /** Common weights used by most subspecies. **/
    public static Map<String, Integer> commonWeights = new HashMap<String, Integer>() {{
    	put("common", 100);
    	put("uncommon", 20);
    	put("rare", 5);
    	put("legendary", 1);
    }};

    // ========== Subspecies General ==========
    /** The Mob Info of the mob this Subspecies belongs to. Set by MobInfo when this is added to it. **/
    public MobInfo mobInfo;

    /** The index of this subspecies in MobInfo. Set by MobInfo when added. Should never be 0 as that is used by the default and will result in this subspecies being ignored. **/
    public int index;

    /** The name of this subspecies. **/
    public String name;

    /** The weight of this subspecies, used when randomly determining the subspecies of a mob. A base species uses the static baseSpeciesWeight value. **/
    public int weight;


    // ==================================================
    //                     Constructor
    // ==================================================
    public Subspecies(String setName, int setWeight) {
        this.name = setName.toLowerCase();
        this.weight = setWeight;
    }
    
    public Subspecies(String setName, String commonWeight) {
        this.name = setName.toLowerCase();
        this.weight = commonWeights.get(commonWeight);
    }


    // ==================================================
    //                     Get Title
    // ==================================================
    public String getTitle() {
        return StatCollector.translateToLocal("subspecies." + this.name + ".name");
    }
}
