package me.gilan.customblockbreak.Listeners;

import me.gilan.customblockbreak.Main;
import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.World;
import org.bukkit.event.block.BlockEvent;
import org.bukkit.inventory.ItemStack;

public class BlockBreakListener implements Listener {

    Player player;
    private Main plugin;

    ItemStack stone = new ItemStack(Material.COBBLESTONE, 1);
    ItemStack ironOre = new ItemStack(Material.IRON_ORE, 1);
    ItemStack coal = new ItemStack(Material.COAL, 1);
    ItemStack goldOre = new ItemStack(Material.GOLD_ORE, 1);
    ItemStack lapis = new ItemStack(Material.INK_SACK, 1, (short) 4);
    ItemStack emerald = new ItemStack(Material.EMERALD, 1);
    ItemStack diamond = new ItemStack(Material.DIAMOND, 1);

    @EventHandler
    public void onBlockBreak(BlockBreakEvent e) {
        Block b = e.getBlock();
        Player p = e.getPlayer();

        if (p.getGameMode().equals(GameMode.SURVIVAL)) { //Checks if GM = Survival
            //CobbleStone to Bedrock
            if (b.getType().equals(Material.COBBLESTONE)) {
                b.setType(Material.BEDROCK);
                p.getInventory().addItem(stone);
                e.setCancelled(true);
            }
            //Stone to CobbleStone
            if (b.getType().equals(Material.STONE)) {
                b.setType(Material.COBBLESTONE);
                p.getInventory().addItem(stone);
                e.setCancelled(true);
            }

            if(b.getType().equals(Material.IRON_ORE)) {
                b.setType(Material.STONE);
                p.getInventory().addItem(ironOre);
                e.setCancelled(true);
            }

            if(b.getType().equals(Material.COAL_ORE)) {
                b.setType(Material.STONE);
                p.getInventory().addItem(coal);
                e.setCancelled(true);
            }

            if(b.getType().equals(Material.GOLD_ORE)) {
                b.setType(Material.STONE);
                p.getInventory().addItem(goldOre);
                e.setCancelled(true);
            }

            if(b.getType().equals(Material.LAPIS_ORE)) {
                b.setType(Material.STONE);
                p.getInventory().addItem(lapis);
                e.setCancelled(true);
            }

            if(b.getType().equals(Material.EMERALD_ORE)) {
                b.setType(Material.STONE);
                p.getInventory().addItem(emerald);
                e.setCancelled(true);
            }

            if(b.getType().equals(Material.DIAMOND_ORE)) {
                b.setType(Material.STONE);
                p.getInventory().addItem(diamond);
                e.setCancelled(true);
            }
        }
    }

}