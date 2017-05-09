package main.java.pw.paradaux.simapi;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import java.util.HashMap;

public class ChatHandler implements Listener {
	private static HashMap<Player, Player> lastMessagedPlayer = new HashMap<>();
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

    public static Player getLastMessagedPlayer(Player p)
    {
        return lastMessagedPlayer.get(p);
    }

    public static void setLastMessagedPlayer(Player p, Player p1)
    {
        if(lastMessagedPlayer.containsKey(p))
        {
            lastMessagedPlayer.remove(p);
            lastMessagedPlayer.put(p, p1);
        }
        else
        {
            lastMessagedPlayer.put(p, p1);
        }
    }
}
