package pw.paradaux.simapi;

import org.bukkit.entity.Player;

public class chatHandler {
	public static void clearChat(int amount, Player player) {
		while(amount > 0) {
			player.sendMessage("");
			amount = amount - 1;
		}
	}
}
