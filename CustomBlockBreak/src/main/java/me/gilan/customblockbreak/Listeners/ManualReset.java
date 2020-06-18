package me.gilan.customblockbreak.Listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import static org.bukkit.event.block.Action.RIGHT_CLICK_BLOCK;

public class ManualReset implements Listener {
        
    /*
    NOTE - FILE IS NOT IN USE
    */
        
        public boolean isStick = false;

        ItemStack stick = new ItemStack(Material.STICK);

        @EventHandler
        public void LookingAtBlock(PlayerInteractEvent e){

            Player player = e.getPlayer();

            if(e.getAction().equals(RIGHT_CLICK_BLOCK)) {
                if (e.getClickedBlock().getType().equals(Material.BEDROCK)) {
                    if(player.isOp()) {
                        if(player.getInventory().getItemInMainHand().equals(stick)) {
                            e.getClickedBlock().setType(Material.STONE);
                        }
                    }
                }
            }
        }

}
