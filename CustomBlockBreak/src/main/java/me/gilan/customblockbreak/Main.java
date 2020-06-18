package me.gilan.customblockbreak;

import me.gilan.customblockbreak.Listeners.BlockBreakListener;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin{

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new BlockBreakListener(), this);
    }
}
