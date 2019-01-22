
//Import only one Java file
import java.io.File;
import java.io.FileNotFoundException;
//Import directory of java files
import java.util.*;

//Everything must be in a class in Java
public class Main {

	// First method run for java program is always main
	public static void main(String[] args) throws FileNotFoundException {
		// Final makes it so no-one else can change this variable later
		// We declared a storage list of item types only
		final ArrayList<Item> items = new ArrayList<>();
		// File is given a directory path and name
		File file = new File("items.txt");
		// We get input from file
		Scanner scanner = new Scanner(file);
		// Loop while input
		while (scanner.hasNext()) {
			// Scan name
			String name = scanner.next();
			// Scan value
			double value = scanner.nextDouble();
			// If name isn'y empty and value is positive
			if (!name.isEmpty() && value > 0) {
				// Create and then track item in list
				Item item = new Item(name, value);
				items.add(item);
			}
		}
		// Print items using internal static method
		printItems(items);
		// Print total using internal static method
		System.out.println("Total: " + getTotal(items));
	}

	private static double getTotal(ArrayList<Item> items) {
		double total = 0;
		// Loop through indices of list
		for (int index = 0; index < items.size(); index++) {
			total += items.get(index).getValue();
		}
		return total;
	}

	// Javadoc comment
	/**
	 * Print items in ArrayList of items
	 *
	 * @param items ArrayList of Items
	 */
	private static void printItems(ArrayList<Item> items) {
		// Iterate through list of items
		for (Item item : items) {
			System.out.println(item.toString());
		}
	}

}
