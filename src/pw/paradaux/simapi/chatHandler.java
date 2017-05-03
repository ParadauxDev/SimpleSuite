package pw.paradaux.simapi;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class chatHandler implements Listener {
	public static boolean chatMuted = false;
	public static void clearChat(int amount, Player player) {
		while (amount > 0) {
			player.sendMessage("");
		}
	}
	@EventHandler
	public void onChat(AsyncPlayerChatEvent event) {
		if (chatHandler.getChatStatus() == true) {
			event.setCancelled(true);
			//System.out.println("[Simple Debug] event.setCancelled(true); called");
		}
		else {
			event.setCancelled(false);
			//System.out.println("[Simple Debug] event.setCancelled(false); called");
		}
	}
    public static void setChatMuted(boolean value) {
    	//System.out.println("[Simple Debug] setChatMuted() successfully called");
    	chatMuted = value;
    }
    public static boolean getChatStatus() {
    	//System.out.println("[Simple Debug] getChatStatus() successfully called");
        return chatMuted;
    }
}
