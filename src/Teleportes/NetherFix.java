package Teleportes;

import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPortalEnterEvent;
import org.bukkit.event.entity.EntityPortalExitEvent;

public class NetherFix implements Listener {

	@EventHandler
	public void Portal(EntityPortalEnterEvent e) {
		Entity entity = e.getEntity();
		if (entity.isDead()) {
			entity.remove();
		}
	}

	@EventHandler
	public void PortalE(EntityPortalExitEvent e) {
		Entity entity = e.getEntity();
		if (entity.isDead()) {
			entity.remove();
		}
	}
}
