package Teleportes;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class PlayerDeathFix implements Listener {

	@EventHandler
	public void morrer(PlayerDeathEvent e) {
		e.setDeathMessage(null);
		e.setDroppedExp(0);
	}

}
