package com.github.workshop.workshop;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class Events implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Bukkit.broadcastMessage("Player join the game!");
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
            Bukkit.broadcastMessage("Player left the game!");
    }
}
