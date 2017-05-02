package pw.paradaux.simcommands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;
import pw.paradaux.simapi.gamemodeHandler;

public class gamemodeCMD implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage(ChatColor.GOLD + "[SimpleSuite]" + ChatColor.RESET + "Players Only, Silly!");
			return false;
		} else if (sender.hasPermission("simple.gamemode")) {
			Player p = (Player) sender;
			if (cmd.getName().equalsIgnoreCase("gmc") || cmd.getName().equalsIgnoreCase("creative")) {
				gamemodeHandler.setGM(1, p);
			} else if (cmd.getName().equalsIgnoreCase("gms") || cmd.getName().equalsIgnoreCase("survival")) {
				gamemodeHandler.setGM(0, p);
			} else if (cmd.getName().equalsIgnoreCase("gma") || cmd.getName().equalsIgnoreCase("adventure")) {
				gamemodeHandler.setGM(2, p);
			} else if (cmd.getName().equalsIgnoreCase("gmsp") || cmd.getName().equalsIgnoreCase("spectator")) {
				gamemodeHandler.setGM(3, p);
			} else if (cmd.getName().equalsIgnoreCase("gm") || cmd.getName().equalsIgnoreCase("gamemode")) {
				if (args.length > 0) {
					if(args[0].equalsIgnoreCase("c") || args[0].equalsIgnoreCase("creative") || args[0].equalsIgnoreCase("1")) {
						gamemodeHandler.setGM(1, p);
					}	
					if(args[0].equalsIgnoreCase("s") || args[0].equalsIgnoreCase("survival") || args[0].equalsIgnoreCase("0")) {
						gamemodeHandler.setGM(0, p);
					}
					if(args[0].equalsIgnoreCase("a") || args[0].equalsIgnoreCase("adventure") || args[0].equalsIgnoreCase("2")) {
						gamemodeHandler.setGM(2, p);
					}
					if(args[0].equalsIgnoreCase("sp") || args[0].equalsIgnoreCase("spectator") || args[0].equalsIgnoreCase("3")) {
						gamemodeHandler.setGM(3, p);
					}
				}
			}
			return false;
		}
		return false;
	}
}