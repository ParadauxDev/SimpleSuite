package main.java.pw.paradaux.simcommands;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import main.java.pw.paradaux.simapi.ChatHandler;
import main.java.pw.paradaux.simsuite.SimpleSuite;

public class ReplyCommand extends CommandBase {
    public ReplyCommand() {
        super("reply", "simple.reply", true, "/r <message>");
    }

    @Override
    public CommandResult run(CommandSender sender, String[] args, String label) {
        if(ChatHandler.getLastMessagedPlayer((Player) sender) == null)
        {
            sender.sendMessage(SimpleSuite.getMessage("nobodyToReplyTo"));
        }
        else
        {
            Player p = ChatHandler.getLastMessagedPlayer((Player) sender);
            if(p != null && p.isOnline())
            {
                StringBuilder sb = new StringBuilder();
                for(int i = 0; i < args.length; i++)
                {
                    sb.append(args[i] + " ");
                }
                String message = sb.toString().trim();

                p.sendMessage(SimpleSuite.getMessage("message").replace("{sender}", sender.getName()).replace("{recipient}", p.getName()).replace("{message}", message));
                sender.sendMessage(SimpleSuite.getMessage("message").replace("{sender}", sender.getName()).replace("{recipient}", p.getName()).replace("{message}", message));
            }
            else
            {
                return CommandResult.INVALID_ARGS;
            }
        }
        return CommandResult.SUCCESS;
    }
}
