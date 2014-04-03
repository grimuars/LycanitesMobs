package lycanite.lycanitesmobs.demonmobs;

import lycanite.lycanitesmobs.Config;

public class SubConfig extends Config {
	
	// ==================================================
	//               Load Config Settings
	// ==================================================
	@Override
	public void loadSettings() {
		super.loadSettings();
		
		// ========== Feature Control ==========
		loadSetting(this.featureStrings, "Feature Control", "BiomeTypes", "Group Biome Types", "NETHER");
		loadSetting(this.featureStrings, "Feature Control", "Dimensions", "Group Dimensions", "-1");
		
		// ========== Special Feature Control ==========
		loadSetting(this.featureBools, "Feature Control", "Hellfire", "Enable Hellfire", true);
		loadSetting(this.featureBools, "Feature Control", "PinkiesOnPeaceful", "Pinkies Peaceful Spawning", true);
		loadSetting(this.featureBools, "Feature Control", "DespawnPinkiesNaturally", "Pinkies Natural Despawning", true);
		
		// ========== Mob Control ==========
		loadMobSettings("Belph", 100, 10, 3, 4, "NETHER");
		loadMobSettings("Behemoth", 20, 5, 1, 1, "NETHER");
		loadMobSettings("Pinky", 60, 5, 1, 3, "NETHER");
		loadMobSettings("Trite", 120, 40, 5, 10, "NETHER");
		loadMobSettings("Asmodi", 20, 1, 1, 1, "NETHER");
		loadMobSettings("NetherSoul", 60, 10, 4, 8, "NETHER");
		loadMobSettings("Cacodemon", 40, 2, 1, 1, "NETHER");
		
		// ========== Block IDs ==========
		loadSetting(blockIDs, "Block IDs", "Hellfire", "Hellfire Block ID", 3856);
		
		// ========== Item IDs ==========
		loadSetting(itemIDs, "Item IDs", "DemonEgg", "Demon Spawn Egg ID", 24060);
		loadSetting(itemIDs, "Item IDs", "DoomfireCharge", "Doomfire Charge ID", 24061);
		loadSetting(itemIDs, "Item IDs", "HellfireCharge", "Hellfire Charge ID", 24062);
		loadSetting(itemIDs, "Item IDs", "DevilstarCharge", "Devilstar Charge ID", 24063);
		loadSetting(itemIDs, "Item IDs", "DemonicLightningCharge", "Demonic Lightning Charge ID", 24064);
		loadSetting(itemIDs, "Item IDs", "PinkyMeatRaw", "Raw Pinky Meat ID", 24065);
		loadSetting(itemIDs, "Item IDs", "PinkyMeatCooked", "Cooked Pinky Meat ID", 24066);
		loadSetting(itemIDs, "Item IDs", "DoomfireScepter", "Doomfire Scepter ID", 24067);
		loadSetting(itemIDs, "Item IDs", "HellfireScepter", "Hellfire Scepter ID", 24068);
		loadSetting(itemIDs, "Item IDs", "DevilstarScepter", "Devilstar Scepter ID", 24069);
		loadSetting(itemIDs, "Item IDs", "DemonicLightningScepter", "Demonic Lightning Scepter ID", 24070);
		loadSetting(itemIDs, "Item IDs", "DevilLasagna", "Devil Lasagna ID", 24071);
	}
}