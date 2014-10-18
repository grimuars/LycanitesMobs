package lycanite.lycanitesmobs.shadowmobs;

import lycanite.lycanitesmobs.AssetManager;
import lycanite.lycanitesmobs.shadowmobs.model.ModelGrue;
import lycanite.lycanitesmobs.shadowmobs.model.ModelPhantom;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientSubProxy extends CommonSubProxy {
	
	// ========== Render ID ==========
	public static int RENDER_ID = RenderingRegistry.getNextAvailableRenderId();
	
	
	// ========== Register Models ==========
	@Override
    public void registerModels() {
		AssetManager.addModel("grue", new ModelGrue());
		AssetManager.addModel("phantom", new ModelPhantom());
	}
}