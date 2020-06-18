package me.gilan.customblockbreak.Commands;

import me.gilan.customblockbreak.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class ResetBlockCommand extends JavaPlugin {


    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equals("sbresetblocks")){
            if(sender instanceof Player){
                Player player = (Player) sender;
                if(sender.isOp()){
                    //command here
                }
            }else{
                System.out.println("Player Command Only...");
            }
        }






        return false;
    }
}
