package com.bedless.example001;

import co.aikar.commands.PaperCommandManager;
import com.bedless.example001.commands.ExampleCommand;
import com.bedless.example001.utils.ExampleRepo;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;
import java.util.logging.Logger;

public final class Example001 extends JavaPlugin {
    private static Example001 INSTANCE;
    ConsoleCommandSender console = Bukkit.getConsoleSender();

    @Override
    public void onEnable() {
        console.sendMessage(ExampleRepo.PREFIX + ChatColor.GREEN + "Has been Enabled!");
        registerCommands();
        registerEvents();
    }

    @Override
    public void onDisable() {

    }

    public void registerCommands(){
        PaperCommandManager pcm = new PaperCommandManager(this);
        pcm.registerCommand(new ExampleCommand());
        console.sendMessage(ExampleRepo.PREFIX + ChatColor.AQUA + "Registering Commands");
    }

    public void registerEvents(){
        console.sendMessage(ExampleRepo.PREFIX + ChatColor.AQUA + "Registering Events");
    }


    public static Example001 getInstance(){return INSTANCE;}
}
