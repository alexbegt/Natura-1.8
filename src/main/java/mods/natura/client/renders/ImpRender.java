package mods.natura.client.renders;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class ImpRender extends RenderLiving
{

	public ImpRender(RenderManager renderManagerIn, ModelBase par1ModelBase, float par2)
	{
		super(renderManagerIn, par1ModelBase, par2);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity par1Entity)
	{
		return texture;
	}

	static final ResourceLocation texture = new ResourceLocation("natura", "textures/mob/imp.png");

}
