package de.rubenmaurer.burntogravel;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockFadeEvent;

import java.util.Random;

public class BlockFadeListener implements Listener {

    @EventHandler
    public void onBlockFade(BlockFadeEvent e) {
        if (e.getBlock().getType().equals(Material.FIRE)) {
            Location loc = e.getBlock().getLocation();

            Block b = loc.getWorld().getBlockAt(loc.getBlockX(), loc.getBlockY() - 1, loc.getBlockZ());
            int rand = new Random().nextInt(100) + 1;

            if (rand <= 70) {
                b.setType(Material.DEAD_BRAIN_CORAL_BLOCK);
            }
        }
    }
}
