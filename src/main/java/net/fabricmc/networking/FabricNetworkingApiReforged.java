package net.fabricmc.networking;

import net.fabricmc.networking.impl.networking.NetworkingImpl;
import net.fabricmc.networking.impl.networking.client.ClientNetworkingImpl;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.loading.FMLLoader;

@Mod("fabric_networking_api_reforged")
public class FabricNetworkingApiReforged {
    public FabricNetworkingApiReforged() {
        if (FMLLoader.getDist().isClient()) ClientNetworkingImpl.clientInit();
        NetworkingImpl.init();
    }
}
