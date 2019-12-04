package de.rubenmaurer.burntogravel;

import org.bukkit.plugin.java.JavaPlugin;

public final class BurnToGravel extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new BlockBurnedListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
