package mcjty.modtut;

import mcjty.modtut.items.*;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {

    @GameRegistry.ObjectHolder("modtut:firstitem")
    public static FirstItem firstItem;

    @GameRegistry.ObjectHolder("modtut:simpletextureditem")
    public static SimpleTexturedItem simpleTexturedItem;

    @GameRegistry.ObjectHolder("modtut:multimodelitem")
    public static MultiModelItem multiModelItem;

    @GameRegistry.ObjectHolder("modtut:glowingironingot")
    public static GlowingIronIngot glowingIronIngot;

    @GameRegistry.ObjectHolder("modtut:mushitem")
    public static MushItem mushItem;

    @GameRegistry.ObjectHolder("modtut:glueitem")
    public static GlueItem glueItem;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        simpleTexturedItem.initModel();
        multiModelItem.initModel();
        glowingIronIngot.initModel();
        mushItem.initModel();
        glueItem.initModel();
    }

}
