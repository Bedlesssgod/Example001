package com.bedless.example001.events;

import com.bedless.example001.utils.ExampleRepo;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class ExampleEventHandler implements Listener {



    @EventHandler
    public void onPlayerJoinEvent(PlayerJoinEvent event){
        Bukkit.getConsoleSender().sendMessage(ExampleRepo.PREFIX + "DEBUG Player Join Event Called");
        if(!event.getPlayer().hasPlayedBefore()){
            for(Player player : Bukkit.getOnlinePlayers()){
                player.sendMessage(ChatColor.AQUA + "Welcome " + event.getPlayer().getName() + " he is the %playercount%!");
            }
            event.getPlayer().sendTitle(ChatColor.DARK_AQUA + "Willkomen auf", ChatColor.DARK_AQUA + "%server_name%", 10, 80, 10);
        }
    }

}
