package me.anvilpowered.sp;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;

import org.bukkit.ChatColor;



@SuppressWarnings("deprecation")
public class Emoticons
  implements Listener
{
  @EventHandler
  public void onChat(PlayerChatEvent e)
  {
    Player p = e.getPlayer();
    if ((p.hasPermission("emo.use")) && 
      (e.getMessage().startsWith(":smile:"))) {
      for (Player o : Bukkit.getOnlinePlayers())
      {
        if (o.hasPermission("emo.use")) {
          o.sendMessage(Main.prefijo + ChatColor.GOLD + p.getDisplayName() + ChatColor.GRAY  + " ☺" + e.getMessage().replaceAll(":smile:", "☺s"));
        }
        e.setCancelled(true);
      }
    }
  }
}
