package mcjty.modtut.items;

import mcjty.modtut.ModTut;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class GlowingIronIngot extends Item {

    public GlowingIronIngot() {
        setRegistryName("glowingironingot");
        setUnlocalizedName(ModTut.MODID + ".glowingironingot");
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
