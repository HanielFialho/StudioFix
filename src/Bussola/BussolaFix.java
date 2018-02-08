package Bussola;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import Principal.Main;

public class BussolaFix implements Listener {

	@EventHandler
	public void BussolaTeleporte(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		if ((e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK
				|| e.getAction() == Action.LEFT_CLICK_AIR || e.getAction() == Action.LEFT_CLICK_BLOCK)
				&& p.getItemInHand().getType() == Material.COMPASS) {
			if (Main.getPlugin().getConfig().getBoolean("Bussola.Fix.Teleporte") == true) {
				p.sendMessage(ChatColor.translateAlternateColorCodes('&',
						Main.getPlugin().getConfig().getString("BussolaFixTeleporteMensagem")));
				e.setCancelled(true);
			} else {
			}

		}
	}
}
