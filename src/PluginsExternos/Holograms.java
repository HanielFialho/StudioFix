package PluginsExternos;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class Holograms implements Listener {

	@EventHandler
	public void Holograma(PlayerCommandPreprocessEvent e) {
		if (e.getMessage().startsWith("/hd") || e.getMessage().startsWith("/hologram")
				|| e.getMessage().startsWith("/holograms") || e.getMessage().startsWith("/holographicdisplays:hd")
				|| e.getMessage().startsWith("/holographicdisplays:hologram")
				|| e.getMessage().startsWith("/holographicdisplays:holograms")
				|| e.getMessage().startsWith("/holographicdisplays:holo") || e.getMessage().startsWith("/holo")) {
			e.setMessage(e.getMessage().replace(".", " "));

		}
	}
}
