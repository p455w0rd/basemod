package p455w0rd.@@MODID@@.proxy;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

/**
 * @author p455w0rd
 *
 */
public interface IProxy {

	default World getWorld() {
		return null;
	}

	default PlayerEntity getPlayer() {
		return null;
	}

}
