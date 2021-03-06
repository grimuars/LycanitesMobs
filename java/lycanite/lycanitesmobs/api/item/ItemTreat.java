package lycanite.lycanitesmobs.api.item;

import lycanite.lycanitesmobs.api.info.GroupInfo;


public class ItemTreat extends ItemBase {
	
	// ==================================================
	//                   Constructor
	// ==================================================
    public ItemTreat(String setItemName, GroupInfo group) {
        super();
		this.itemName = setItemName;
		this.group = group;
        this.setMaxStackSize(1);
        this.textureName = this.itemName.toLowerCase();
        this.setUnlocalizedName(this.itemName);
        this.setup();
    }
}
