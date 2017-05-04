package pw.paradaux.simcommands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import pw.paradaux.simapi.gamemodeHandler;
import pw.paradaux.simapi.languageControl;
import pw.paradaux.simapi.prefix;

public class gamemodeCMD implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			languageControl.playersOnly(sender);
			return false;
		} else if (sender.hasPermission("simple.gamemode")) {
			Player p = (Player) sender;
			if (cmd.getName().equalsIgnoreCase("gmc") || cmd.getName().equalsIgnoreCase("creative") && args == null) {
				gamemodeHandler.setGM(1, p);
				p.sendMessage("Called #1");
				p.sendMessage(args);
			} else if (cmd.getName().equalsIgnoreCase("gmc")
					|| cmd.getName().equalsIgnoreCase("creative") && args != null) {
				p.sendMessage("Called #2");
				Player p2 = Bukkit.getPlayerExact(args[0]);
				if (p2 == null) {
					languageControl.gamemodeUpdateFailed(sender);
				} else {
					p2.sendMessage("Called #2");
					gamemodeHandler.setGM(1, p2);
				}
			}
			if (cmd.getName().equalsIgnoreCase("gms") || cmd.getName().equalsIgnoreCase("survival")) {
				gamemodeHandler.setGM(0, p);
			} else {

			}
			if (cmd.getName().equalsIgnoreCase("gma") || cmd.getName().equalsIgnoreCase("adventure")) {
				gamemodeHandler.setGM(2, p);
			} else {

			}
			if (cmd.getName().equalsIgnoreCase("gmsp") || cmd.getName().equalsIgnoreCase("spectator")) {
				gamemodeHandler.setGM(3, p);
			} else {

			}
			if (cmd.getName().equalsIgnoreCase("gm") || cmd.getName().equalsIgnoreCase("gamemode")) {
				if (args.length > 0) {
					if (args[0].equalsIgnoreCase("c") || args[0].equalsIgnoreCase("creative")
							|| args[0].equalsIgnoreCase("1")) {
						gamemodeHandler.setGM(1, p);
					}
					if (args[0].equalsIgnoreCase("s") || args[0].equalsIgnoreCase("survival")
							|| args[0].equalsIgnoreCase("0")) {
						gamemodeHandler.setGM(0, p);
					}
					if (args[0].equalsIgnoreCase("a") || args[0].equalsIgnoreCase("adventure")
							|| args[0].equalsIgnoreCase("2")) {
						gamemodeHandler.setGM(2, p);
					}
					if (args[0].equalsIgnoreCase("sp") || args[0].equalsIgnoreCase("spectator")
							|| args[0].equalsIgnoreCase("3")) {
						gamemodeHandler.setGM(3, p);
					} else {
						prefix.it("Invalid Gamemode / No Specified Gamemode.", p);
					}

				}
			}
			return false;
		}
		return false;
	}
}