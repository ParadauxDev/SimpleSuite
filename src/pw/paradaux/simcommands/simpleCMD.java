package pw.paradaux.simcommands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;
import pw.paradaux.simapi.prefix;

public class simpleCMD implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		if (!(sender instanceof Player)) {
			sender.sendMessage(ChatColor.GOLD + "[SimpleSuite]" + ChatColor.RESET + "Players Only, Silly!");
			return false;
		} if (cmd.getName().equalsIgnoreCase("simple")){
			if (args.length > 0) {
				if(args[0].equalsIgnoreCase("help")) {
					prefix.headIt("SimpleSuite", p);
					prefix.seperate("/simple gamemode", "Get help changing your gamemode.", p);
					prefix.seperate("/simple reload", "Reload SimpleSuite", p);
					prefix.seperate("/simple info", "Get Information", p);
					prefix.seperate("/simple fun", "Fun Commands", p);
					prefix.seperate("/simplemod", "Moderator Commands", p);
					prefix.seperate("/simpleadmin", "Administrator Commands", p);
					prefix.headIt("SimpleSuite", p);}
			} else {
				prefix.headIt("SimpleSuite", p);
				prefix.seperate("/simple gamemode", "Get help changing your gamemode.", p);
				prefix.seperate("/simple reload", "Reload SimpleSuite", p);
				prefix.seperate("/simple info", "Get Information", p);
				prefix.seperate("/simple fun", "Fun Commands", p);
				prefix.seperate("/simplemod", "Moderator Commands", p);
				prefix.seperate("/simpleadmin", "Administrator Commands", p);
				prefix.headIt("SimpleSuite", p);
			}
			}
		return false;
	}
}
