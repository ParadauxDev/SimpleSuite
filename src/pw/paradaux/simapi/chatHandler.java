package pw.paradaux.simapi;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class chatHandler implements Listener {
	public static boolean chatMuted = false;
	public static void clearChat(int amount, Player player) {
		while (amount > 0) {
			player.sendMessage("");
			amount = amount - 1;
		}
	}
	public void onChat(AsyncPlayerChatEvent event) {
		// if chat is muted don't let the player talk
		if (chatHandler.getChatStatus() == true) {
			event.setCancelled(true);
		}
	}
    public static void setChatMuted(boolean value) {
        chatMuted = value;
    }
    public static boolean getChatStatus() {
        return chatMuted;
    }
}
