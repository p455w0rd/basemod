package p455w0rd.@@MODID@@.init;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

/**
 * @author p455w0rd
 *
 */
@OnlyIn(Dist.CLIENT)
@EventBusSubscriber(modid = ModGlobals.MODID, value = Dist.CLIENT)
public class ModEventsClient {

	@SubscribeEvent
	public static void onModelRegistryReady(ModelRegistryEvent event) {
		/*
		ItemModelMesher mesher = Minecraft.getInstance().getItemRenderer().getItemModelMesher();
		*/
	}

}
