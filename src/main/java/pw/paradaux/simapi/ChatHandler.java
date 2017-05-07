package pw.paradaux.simapi;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatHandler implements Listener {
	private static boolean chatMuted = false;

	@EventHandler
	public void onChat(AsyncPlayerChatEvent event) {
		if (isChatMuted()) {
			event.setCancelled(true);
		}
	}

    public static void setChatMuted(boolean value) {
        chatMuted = value;
    }
    public static boolean isChatMuted() {
        return chatMuted;
    }
}
