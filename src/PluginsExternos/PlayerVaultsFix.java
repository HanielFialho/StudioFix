package PluginsExternos;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import Principal.Main;

public class PlayerVaultsFix implements Listener {

	public String color(String s) {
		return ChatColor.translateAlternateColorCodes('&', s);
	}

	@EventHandler
	public void VaultComando(PlayerCommandPreprocessEvent e) {
		ArrayList<String> cmds = new ArrayList<String>();
		cmds.add("/pv");
		cmds.add("/playervaults");
		cmds.add("/chest");
		cmds.add("/vault");
		cmds.add("/bau");

		for (String s : cmds) {
			if (e.getMessage().indexOf(s) != -1) {
				Location loc = e.getPlayer().getLocation();
				if (loc.getBlock().getType() == Material.WATER_LILY) {
					if (Main.getPlugin().getConfig().getBoolean("Fix.Player.Vaults") == true) {
						e.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&',
								Main.getPlugin().getConfig().getString("PlayerVaultFix")));
						e.setCancelled(true);
						e.getPlayer().closeInventory();
					} else {

					}
				}
			}
		}
	}

	@EventHandler
	public void VaultComandoDois(PlayerCommandPreprocessEvent e) {
		if (e.getMessage().indexOf(":") != -1) {
			if (e.getPlayer().isOp()) {
				return;
			}
			if (Main.getPlugin().getConfig().getBoolean("Fix.Player.Vaults") == true) {
				e.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&',
						Main.getPlugin().getConfig().getString("PlayerVaultFix")));
				e.setCancelled(true);
				e.getPlayer().closeInventory();
			} else {

			}
		}
	}
}