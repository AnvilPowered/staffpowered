package me.anvilpowered.sp;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class iSp implements CommandExecutor {
	  public iSp(Main main) {
	
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		 if (cmd.getName().equalsIgnoreCase("isp")) {
	    	
	        Player p = (Player)sender;	     
	        
	        p.sendMessage(" ");
	        p.sendMessage(" ");
	        p.sendMessage(" ");
	        p.sendMessage(" ");
	        p.sendMessage(" ");
	        p.sendMessage(" ");
	        p.sendMessage(" ");
	        p.sendMessage(" ");
	        p.sendMessage(" ");
	        p.sendMessage(" ");
	        p.sendMessage(" ");
	        p.sendMessage(" ");
	        p.sendMessage(" ");
	        p.sendMessage(" ");
	        p.sendMessage(" ");
	        p.sendMessage(" ");
	        p.sendMessage(" ");
	        p.sendMessage(" ");
	        p.sendMessage(" ");
	        p.sendMessage(" ");
	        p.sendMessage(" ");
	        p.sendMessage(" ");
	        p.sendMessage(" ");
	        p.sendMessage(" ");
	        p.sendMessage(" ");
	        p.sendMessage(" ");
	        p.sendMessage(" ");
	        p.sendMessage(" ");
	        p.sendMessage(" ");
	        p.sendMessage(" ");
	        p.sendMessage(" ");
	        p.sendMessage(" ");
	        p.sendMessage(" ");
	        p.sendMessage(" ");
	        p.sendMessage(" ");
	        p.sendMessage(Main.prefijo + ChatColor.GOLD + "Comandos:");	     
	        p.sendMessage(" ");
	        p.sendMessage(ChatColor.GREEN + "/cp:" + ChatColor.GRAY + " Limpia tu chat.");
	        p.sendMessage(ChatColor.GREEN + "/gcp:" + ChatColor.GRAY + " Limpia el chat global.");
	        p.sendMessage(ChatColor.GREEN + "@sp [Mas el texto]:" + ChatColor.GRAY + " Chat privado para el staff.");
	        p.sendMessage(" ");
	        p.sendMessage(ChatColor.GREEN + "Creador" + ChatColor.GRAY + ChatColor.BOLD + " AnvilPowered");
	     
	      }
	    
	    return true;
	  }
	}
