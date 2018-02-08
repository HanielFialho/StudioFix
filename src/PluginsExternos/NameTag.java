package PluginsExternos;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class NameTag implements Listener {

	@EventHandler
	public void Interagir(PlayerInteractEvent event) {
		if (event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
			if (event.getClickedBlock().getType() == Material.NAME_TAG) {
				event.setCancelled(true);
			}
		}
	}

}
