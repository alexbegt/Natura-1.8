package mods.natura.blocks;

import mantle.client.ModelVariant;
import mods.natura.Natura;
import mods.natura.blocks.material.CloudMaterial;
import mods.natura.blocks.natural.BlockClouds;
import mods.natura.items.itemblocks.ItemBlockClouds;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlocksNatura
{
	public static Material cloud = new CloudMaterial();

	public static BlockClouds clouds;

	public void preInit()
	{
		this.clouds = this.registerBlock("cloud", ItemBlockClouds.class, new BlockClouds());
	}

	private <T extends Block> T registerBlock(String name, Class<? extends ItemBlock> itemblock, T block)
	{
		block.setUnlocalizedName(name);
		GameRegistry.registerBlock(block, itemblock, name);

		return block;
	}

	public void init()
	{
		if (Natura.proxy.getModels() != null)
		{
			ModelVariant models = Natura.proxy.getModels();

			models.registerItemRenderer(this.clouds, BlockClouds.CloudVariant.values());
		}
	}

}
