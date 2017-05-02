package pw.paradaux.simapi;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;

public class gamemodeHandler {
	public static void setGM(int gm, Player player) {
		if(gm==0) {
			player.setGameMode(GameMode.SURVIVAL);
			languageControl.gamemodeSurvival(player);
		}
		if(gm==1) {
			player.setGameMode(GameMode.CREATIVE);
			languageControl.gamemodeCreative(player);
		}
		if(gm==2) {
			player.setGameMode(GameMode.ADVENTURE);
			languageControl.gamemodeAdventure(player);
		}
		if(gm==3) {
			player.setGameMode(GameMode.SPECTATOR);
			languageControl.gamemodeSpectator(player);
		}
	} 
}
