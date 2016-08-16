package me.anvilpowered.sp;


import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;

import org.bukkit.ChatColor;



@SuppressWarnings("deprecation")
public class Sp
  implements Listener
{
  @EventHandler
  public void onChat(PlayerChatEvent e)
  {
    Player p = e.getPlayer();
    if ((p.hasPermission("sp.use")) && 
      (e.getMessage().startsWith("@sp"))) {
      for (Player o : Bukkit.getOnlinePlayers())
      {
        if (o.hasPermission("sp.use")) {
          o.sendMessage(Main.prefijo + ChatColor.GOLD + p.getDisplayName() + ChatColor.GRAY  + ":" + e.getMessage().replaceAll("@sp", ""));
        }
        e.setCancelled(true);
      }
    }
  }
}
