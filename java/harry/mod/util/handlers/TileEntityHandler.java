package harry.mod.util.handlers;

import harry.mod.objects.blocks.machines.electricalSinterer.TileEntityElectricalSinteringFurnace;
import harry.mod.objects.blocks.machines.generator.TileGenerator;
import harry.mod.objects.blocks.machines.miner.te.TileEntityMiner;
import harry.mod.objects.blocks.machines.sinterer.TileEntitySinteringFurnace;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler {
	public static void registerTileEntities() {
		GameRegistry.registerTileEntity(TileEntitySinteringFurnace.class, "sintering_furnace");
		GameRegistry.registerTileEntity(TileEntityElectricalSinteringFurnace.class, "electrical_sintering_furnace");
		GameRegistry.registerTileEntity(TileGenerator.class, "generator");
		GameRegistry.registerTileEntity(TileEntityMiner.class, "miner");
	}
}
