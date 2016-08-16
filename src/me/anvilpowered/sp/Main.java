package me.anvilpowered.sp;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;



public class Main
  extends JavaPlugin
{
  public static String prefijo = ChatColor.DARK_GRAY + "[" + ChatColor.GRAY + "StaffPowered" + ChatColor.DARK_GRAY + "] " ;
  
  public void onEnable()
  {
	Bukkit.getPluginManager().registerEvents(new Emoticons(), this);
    Bukkit.getPluginManager().registerEvents(new Sp(), this);
    getCommand("Cp").setExecutor(new Cp(this));
    getCommand("globalcp").setExecutor(new Cp(this));
    getCommand("isp").setExecutor(new iSp(this));
  }
}
