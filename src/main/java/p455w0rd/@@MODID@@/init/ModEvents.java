package p455w0rd.@@MODID@@.init;

import static net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus.MOD;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * @author p455w0rd
 *
 */
@EventBusSubscriber(bus = MOD, modid = ModGlobals.MODID)
public class ModEvents {

	@SubscribeEvent
	public static void onBlockRegistryReady(RegistryEvent.Register<Block> event) {
	}

	@SubscribeEvent
	public static void onItemRegistryReady(RegistryEvent.Register<Item> event) {
	}

	@SubscribeEvent
	public static void onTileRegistryReady(RegistryEvent.Register<TileEntityType<?>> event) {
	}

}
