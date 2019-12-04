package de.rubenmaurer.burntogravel;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBurnEvent;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class BlockBurnedListener implements Listener {

    @EventHandler
    public void onBlockBurn(BlockBurnEvent e) {
        List<Material> mats = Arrays.asList(Material.ACACIA_LEAVES, Material.BIRCH_LEAVES, Material.DARK_OAK_LEAVES,
                Material.JUNGLE_LEAVES, Material.OAK_LEAVES, Material.SPRUCE_LEAVES);

        if (new Random().nextBoolean() && !mats.contains(e.getBlock().getType())) {
            e.getBlock().setType(Material.GRAVEL);
            e.setCancelled(true);
        }
    }
}
