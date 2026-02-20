
import java.util.Scanner;

/**
 *  Grocery Management System using parallel Arrays.
 * This class handles inventory display and restocking
 */

public class GrocerySystem {
    private GrocerySystem(){}
    /**
     * The main method initializes the inventory and calls the printInventory method to display it.
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int [] itemStocks = new int[10];

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Grocery Menu =====");
            System.out.println("1. View Inventory");
            System.out.println("2. Restock Item");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {

                printInventory(itemNames, itemPrices, itemStocks);

            } else if (choice == 2) {

                System.out.print("Enter item name to restock: ");
                String target = scanner.nextLine();

                System.out.print("Enter amount to add: ");
                int amount = scanner.nextInt();

                restockItem(itemNames, itemStocks, target, amount);

            } else if (choice == 3) {

                System.out.println("Exiting program...");
                break;

            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }

    /**
     * Prints the inventory of the grocery store by iterating through the parallel arrays.
     * @param names The array of item names
     * @param prices The array of item prices
     * @param stocks The array of item stocks levels
     */
    public static void printInventory(String[] names, double[] prices, int[] stocks) {
        for (int i =0; i < names.length; i++) {
            if(names[i] != null) {
                System.out.println("Item: " + names[i] + " | Price: $" + prices[i] + " | Stock: " + stocks[i]);
            }
        }
    }

     /*
      * Restocks a target item
      * @param names The array of item names
      * @param stocks The array of item stocks
      * @param target The name of the target item
      * @param amount The amount to add to the stock
      */
     public static void restockItem(String[] names, int[] stocks, String target, int amount){
		for (int i = 0; i < names.length; i++) {
			if (names[i] == target){
				stocks[i] = amount;
				return
			}
		}
		System.out.printLn("Item not found.");
     }
}
