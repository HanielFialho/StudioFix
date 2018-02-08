package Anvil;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;

import Principal.Main;

public class AnvilStacksFix implements Listener {

	@EventHandler
	public void onInventoryClick(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		if (e.getInventory().getType() != InventoryType.ANVIL) {
			return;
		}
		if ((e.getCurrentItem() != null) && (e.getCurrentItem().getAmount() > 1)) {
			if (Main.getPlugin().getConfig().getBoolean("StacksNaBigornaOFF") == true) {
				p.sendMessage(ChatColor.translateAlternateColorCodes('&',
						Main.getPlugin().getConfig().getString("FixStacksNaBigorna")));
				e.setCancelled(true);
			} else {
			}
		}
	}
}
