package pw.paradaux.simcommands;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import pw.paradaux.simapi.ChatHandler;
import pw.paradaux.simsuite.SimpleSuite;

public class MessageCommand extends CommandBase {
    public MessageCommand() {
        super("msg", "simple.message", true, "/msg <player> <message>");
    }

    @Override
    public CommandResult run(CommandSender sender, String[] args, String label) {
        if(args.length > 1)
        {
            Player p = Bukkit.getPlayer(args[0]);
            if(p != null && p.isOnline())
            {
                StringBuilder sb = new StringBuilder();
                for(int i = 1; i < args.length; i++)
                {
                    sb.append(args[i] + " ");
                }
                String message = sb.toString().trim();

                ChatHandler.setLastMessagedPlayer((Player) sender, p);

                p.sendMessage(SimpleSuite.getMessage("message").replace("{sender}", sender.getName()).replace("{recipient}", p.getName()).replace("{message}", message));
                sender.sendMessage(SimpleSuite.getMessage("message").replace("{sender}", sender.getName()).replace("{recipient}", p.getName()).replace("{message}", message));
            }
            else
            {
                return CommandResult.INVALID_ARGS;
            }
        }
        else
        {
            return CommandResult.INVALID_ARGS;
        }
        return CommandResult.SUCCESS;
    }
}
