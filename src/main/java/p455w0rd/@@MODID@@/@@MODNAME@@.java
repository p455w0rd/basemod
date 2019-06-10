package p455w0rd.@@MODID@@;

import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import p455w0rd.@@MODID@@.init.ModGlobals;
import p455w0rd.@@MODID@@.proxy.*;

@Mod(ModGlobals.MODID)
public class @@MODNAME@@ {

	private static @@MODNAME@@ instance;
	private static IProxy proxy = DistExecutor.runForDist(() -> () -> new ClientProxy(), () -> () -> new CommonProxy());

	public @@MODNAME@@() {
		if (instance == null) {
			instance = this;
		}
		//ModLoadingContext.get().registerConfig(Type.COMMON, ModConfig.CONFIG_SPEC);
	}

	public static @@MODNAME@@ getInstance() {
		return instance;
	}

	public static IProxy getProxy() {
		return proxy;
	}

}