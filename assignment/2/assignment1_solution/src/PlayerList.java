import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * <h1>W19 - COMP 1502 - Assignment 1 PlayerList Class</h1> Holds a list of
 * Player and allows for Players to be added, found by jersey number, and for
 * shots, goals, pp goals to be recorded. Also available are options to print
 * out a roster table, stats table and load/save a PlayerList from/to a file.
 * Player's are stored in an internal ArrayList of Player.
 * 
 * @author Tyson Kendon, Jonathan Hudson
 * @version 1.0
 *
 */
public class PlayerList {

	/**
	 * The Players in the list
	 */
	private ArrayList<Player> players;

	/**
	 * Construct a new empty PlayerList
	 */
	public PlayerList() {
		players = new ArrayList<>();
	}

	/**
	 * Construct a PlayerList by loading Player data from the File
	 * 
	 * @param file The File to load player data from
	 * @throws FileNotFoundException If the file is not found
	 */
	public PlayerList(File file) throws FileNotFoundException {
		this();
		loadPlayerList(file);
	}

	/**
	 * The list of player stored
	 * 
	 * @return The ArrayList of Players stored
	 */
	public ArrayList<Player> getPlayers() {
		return players;
	}

	/**
	 * Get a player with a given String jersey number
	 * 
	 * @param number String jersey number to search for
	 * @return The player found with jersey number, if no player found then null
	 */
	public Player getPlayerByNumber(String number) {
		for (Player p : players) {
			if (p.getNumber().equals(number)) {
				return p;
			}
		}
		return null;
	}

	/**
	 * Add a player to the PlayerList
	 * 
	 * @param p The Player to add
	 */
	public void addPlayer(Player p) {
		players.add(p);
	}

	/**
	 * Record a shot for a player
	 * 
	 * @param number String jersey number of player who had the shot
	 */
	public void recordShot(String number) {
		getPlayerByNumber(number).recordShot();
	}

	/**
	 * Record a goal for a given scorer
	 * 
	 * @param scorer String jersey number of player who scored (should not be null)
	 */
	public void recordGoal(String scorer) {
		getPlayerByNumber(scorer).recordGoal();
	}

	/**
	 * Record a goal for a given scorer and optional player a1 assisting the goal
	 * 
	 * @param scorer String jersey number of player who scored (should not be null)
	 * @param a1     String jersey number of player who assisted the goal (null if
	 *               no player)
	 */
	public void recordGoal(String scorer, String a1) {
		getPlayerByNumber(scorer).recordGoal();
		getPlayerByNumber(a1).recordAssist();
	}

	/**
	 * Record a goal for a given scorer and optional players a1/a2 assisting the
	 * goal
	 * 
	 * @param scorer String jersey number of player who scored (should not be null)
	 * @param a1     String jersey number of player who assisted the goal (null if
	 *               no player)
	 * @param a2     String jersey number of player who assisted the goal (null if
	 *               no player)
	 */
	public void recordGoal(String scorer, String a1, String a2) {
		getPlayerByNumber(scorer).recordGoal();
		getPlayerByNumber(a1).recordAssist();
		getPlayerByNumber(a2).recordAssist();
	}

	/**
	 * Record a PP goal for a given scorer
	 * 
	 * @param scorer String jersey number of player who scored (should not be null)
	 */
	public void recordPowerPlayGoal(String scorer) {
		getPlayerByNumber(scorer).recordPowerPlayGoal();
	}

	/**
	 * Record a PP goal for a given scorer and optional player a1 assisting the PP
	 * goal
	 * 
	 * @param scorer String jersey number of player who scored (should not be null)
	 * @param a1     String jersey number of player who assisted the goal (null if
	 *               no player)
	 */
	public void recordPowerPlayGoal(String scorer, String a1) {
		getPlayerByNumber(scorer).recordPowerPlayGoal();
		getPlayerByNumber(a1).recordPowerPlayAssist();
	}

	/**
	 * Record a PP goal for a given scorer and optional players a1/a2 assisting the
	 * PP goal
	 * 
	 * @param scorer String jersey number of player who scored (should not be null)
	 * @param a1     String jersey number of player who assisted the goal (null if
	 *               no player)
	 * @param a2     String jersey number of player who assisted the goal (null if
	 *               no player)
	 */
	public void recordPowerPlayGoal(String scorer, String a1, String a2) {
		getPlayerByNumber(scorer).recordPowerPlayGoal();
		getPlayerByNumber(a1).recordPowerPlayAssist();
		getPlayerByNumber(a2).recordPowerPlayAssist();
	}

	/**
	 * Write out to the console the players' roster info formatted as a table
	 */
	public void listAllPlayersRoster() {
		System.out.println(Player.getFormattedRosterHeader());
		for (Player p : players) {
			System.out.println(p.getFormattedRoster());
		}
	}

	/**
	 * Write out to the console the players' stats formatted as a table
	 */
	public void listAllPlayersStats() {
		System.out.println(Player.getFormattedStatsHeader());
		for (Player p : players) {
			System.out.println(p.getFormattedStats());
		}
	}

	/**
	 * Write the player data out to the given File
	 * 
	 * @param file The File to open and write player data to
	 * @throws FileNotFoundException If file doesn't exist to write to
	 */
	public boolean recordToFile(File file) throws FileNotFoundException {
		PrintWriter writer = new PrintWriter(file);
		for (Player p : players) {
			writer.println(p.getFileFormatString());
		}
		writer.close();
		return true;
	}

	/**
	 * Internal method to load a player from a file (used by constructor that takes
	 * in File)
	 * 
	 * @param file The file to open and read player data out of
	 * @throws FileNotFoundException If file doesn't exist
	 */
	private void loadPlayerList(File file) throws FileNotFoundException {
		Scanner scanner = new Scanner(file);
		while (scanner.hasNextLine()) {
			Player p = new Player(scanner.nextLine());
			players.add(p);
		}
		scanner.close();
	}

}
