package Teleportes;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryMoveItemEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class SeiLauq implements Listener {
	@SuppressWarnings("null")
	@EventHandler
	public void onLoad(InventoryOpenEvent e) {
		try {
			for (ItemStack stack : e.getInventory().getContents()) {
				if (((stack != null) || (stack.getType() != Material.AIR))
						&& (stack.getAmount() > stack.getMaxStackSize())) {
					stack.setAmount(stack.getMaxStackSize());
				}
			}
		} catch (NullPointerException localNullPointerException1) {
		}
	}

	@EventHandler
	public void onDrag(InventoryClickEvent e) {
		if ((e.getCurrentItem() != null) && (e.getCurrentItem().getAmount() > e.getCurrentItem().getMaxStackSize())) {
			e.getCurrentItem().setAmount(e.getCurrentItem().getMaxStackSize());
		}
	}

	@EventHandler
	public void onMove(InventoryMoveItemEvent e) {
		if (e.getItem().getAmount() > e.getItem().getMaxStackSize()) {
			e.getItem().setAmount(e.getItem().getMaxStackSize());
		}
	}

	@EventHandler
	public void onInteract(PlayerInteractEvent e) {
		if ((e.getItem() != null) && (e.getItem().getAmount() > e.getItem().getMaxStackSize())) {
			e.getItem().setAmount(e.getItem().getMaxStackSize());
		}
	}
}
