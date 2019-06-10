package p455w0rd.@@MODID@@.proxy;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

/**
 * @author p455w0rd
 *
 */
public class ClientProxy extends CommonProxy {

	@Override
	public PlayerEntity getPlayer() {
		return Minecraft.getInstance().field_71439_g;
	}

	@Override
	public World getWorld() {
		return Minecraft.getInstance().field_71441_e;
	}

}
