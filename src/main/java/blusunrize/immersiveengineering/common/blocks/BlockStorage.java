package blusunrize.immersiveengineering.common.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockStorage extends BlockIEBase
{
	public BlockStorage(String... subNames)
	{
		super("storage",Material.iron,2,ItemBlockIEBase.class, subNames);
	}

	@Override
	public void registerBlockIcons(IIconRegister iconRegister)
	{
		for(int i=0;i<subNames.length;i++)
			if(subNames[i].startsWith("Coil"))
			{
				icons[i][0] = iconRegister.registerIcon("immersiveengineering:"+name+"_"+subNames[i]+"_top");
				icons[i][1] = iconRegister.registerIcon("immersiveengineering:"+name+"_"+subNames[i]+"_side");
			}
			else
			{
				icons[i][0] = iconRegister.registerIcon("immersiveengineering:"+name+"_"+subNames[i]);
				icons[i][1] = iconRegister.registerIcon("immersiveengineering:"+name+"_"+subNames[i]);
			}
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_)
	{
		return null;
	}
	@Override
	public boolean allowHammerHarvest(int metadata)
	{
		return false;
	}
}