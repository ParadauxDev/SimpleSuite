package pw.paradaux.simapi;

import org.bukkit.entity.Player;

public class languageControl {
	public static void gamemodeCreative(Object sender) {
		prefix.it("Your gamemode has been updated to Creative mode.", sender);
	}
	public static void gamemodeSurvival(Object sender) {
		prefix.it("Your gamemode has been updated to Survival mode.", sender);
	}
	public static void gamemodeSpectator(Object sender) {
		prefix.it("Your gamemode has been updated to Specator mode.", sender);
	}
	public static void gamemodeAdventure(Object sender) {
		prefix.it("Your gamemode has been updated to Adventure mode.", sender);
	}
	public static void clearChat(Object sender) {
		prefix.bIt(((Player) sender).getDisplayName() + " has cleared chat!");
	}
	public static void playersOnly(Object sender) {
		prefix.it("Players Only, Silly!", sender);
	}
	public static void simpleMenu(Object sender) {
		Object p = sender;
		prefix.headIt("SimpleSuite", p);
		prefix.seperate("/simple gamemode", "Get help changing your gamemode.", p);
		prefix.seperate("/simple reload", "Reload SimpleSuite", p);
		prefix.seperate("/simple info", "Get Information", p);
		prefix.seperate("/simple fun", "Fun Commands", p);
		prefix.seperate("/simplemod", "Moderator Commands", p);
		prefix.seperate("/simpleadmin", "Administrator Commands", p);
		prefix.headIt("SimpleSuite", p);}
	public static void chatMuteOn(Object sender) {
		prefix.it("Chat has been muted", sender);
	}
	public static void chatMuteOff(Object sender) {
		prefix.it("Chat has been unmuted", sender);
	}
	public static void gamemodeUpdateFailed(Object sender) {
		prefix.it("Invalid user.", sender);
	}
}