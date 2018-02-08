package Anvil;

import org.bukkit.ChatColor;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;

import Principal.Main;

public class RenameFixAnvil implements Listener {

	@EventHandler
	public void cliqueBigorna(InventoryClickEvent e) {
		HumanEntity p = e.getWhoClicked();
		if ((e.getInventory().getType() == InventoryType.ANVIL) && (e.getSlotType() == InventoryType.SlotType.RESULT)) {
			if (Main.getPlugin().getConfig().getBoolean("BigornaFix") == true) {
				e.setCancelled(true);
				e.setCurrentItem(null);
				p.sendMessage(ChatColor.translateAlternateColorCodes('&',
						Main.getPlugin().getConfig().getString("BigornaFixMensagem")));
			} else {

			}
		}
	}
}