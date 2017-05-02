package pw.paradaux.simapi;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;

public class gamemodeHandler {
	public static void setGM(int gm, Player player) {
		if(gm==0) {
			player.setGameMode(GameMode.SURVIVAL);
			prefix.it("Your Gameode has Been Updated To Survival.", player);
		}
		if(gm==1) {
			player.setGameMode(GameMode.CREATIVE);
			prefix.it("Your Gamemode has Been Updated to Creative.", player);
		}
		if(gm==2) {
			player.setGameMode(GameMode.ADVENTURE);
			prefix.it("Your Gamemode has Been Updated to Adventure.", player);
		}
		if(gm==3) {
			player.setGameMode(GameMode.SPECTATOR);
			prefix.it("Your Gamemode has Been Updated to Spectator.", player);
		}
	} 
}
