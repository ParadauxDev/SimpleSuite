package pw.paradaux.simcommands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import pw.paradaux.simsuite.SimpleSuite;

public abstract class CommandBase implements CommandExecutor {
    private String command;
    private String permission;
    private boolean mustBePlayer;
    private String usage;

    public CommandBase(String command, String permission, boolean mustBePlayer, String usage)
    {
        this.command = command;
        this.permission = permission;
        this.mustBePlayer = mustBePlayer;
        this.usage = usage;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        CommandResult result = CommandResult.SUCCESS;

        if(command.getName().equalsIgnoreCase(this.command))
        {
            if(commandSender.hasPermission(this.permission))
            {
                if(this.mustBePlayer && !(commandSender instanceof Player))
                {
                    result = CommandResult.NOT_PLAYER_ERR;
                }
                else
                {
                    result = run(commandSender, strings, s);
                }
            }
            else
            {
                result = CommandResult.NO_PERM;
            }
        }

        switch(result)
        {
            case NO_PERM:
                commandSender.sendMessage(SimpleSuite.getMessage("noPerm"));
                break;
            case NOT_PLAYER_ERR:
                commandSender.sendMessage(SimpleSuite.getMessage("notPlayer"));
                break;
            case INVALID_ARGS:
                commandSender.sendMessage(SimpleSuite.getMessage("invalidArgs").replace("{usage}", usage));
                break;
        }

        return false;
    }

    public abstract CommandResult run(CommandSender sender, String[] args, String label);

    public enum CommandResult
    {
        SUCCESS,
        NO_PERM,
        NULL_ERR,
        SQL_ERR,
        INVALID_ARGS,
        NOT_PLAYER_ERR;
    }
}
