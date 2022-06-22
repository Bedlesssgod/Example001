package com.bedless.example001.utils;

import org.bukkit.ChatColor;

public class ExampleRepo {
    private static ExampleRepo instance;
    private ExampleRepo() {}

    public static final String PREFIX = ChatColor.translateAlternateColorCodes('&', "&8[&3&lEXAMPLE&8]" + ChatColor.RESET + " ");

    public static synchronized ExampleRepo getInstance() {
        if(instance == null) {
            instance = new ExampleRepo();
        }

        return instance;
    }
}
