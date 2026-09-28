import java.util.Scanner;

public class RunApplication {
    public static void main(String[] args) {
        // Scanner to read user input from the console
        Scanner input = new Scanner(System.in);
        
        // Display the menu for console selection
        System.out.println("Select the console type");
        System.out.println("1) PS5");
        System.out.println("2) XBOX");
        System.out.println("3) SWITCH");
        System.out.println();
        
        int choice = input.nextInt();
        input.nextLine(); // Consume the leftover newline character
        
        // Determine the console string based on the user's menu choice
        String selectedConsole = "";
        if (choice == 1) {
            selectedConsole = "PS5";
        } else if (choice == 2) {
            selectedConsole = "XBOX";
        } else if (choice == 3) {
            selectedConsole = "SWITCH";
        }

        // Prompt the user for the store name and sales amount
        System.out.print("Enter the store: ");
        String storeName = input.nextLine();
        
        System.out.print("Enter the total sales of " + selectedConsole + " consoles for " + storeName + ": ");
        int totalSales = input.nextInt();

        // Create a ConsoleSales object and call its printReport method
        ConsoleSales cs = new ConsoleSales(selectedConsole, storeName, totalSales);
        cs.printReport();
        
        // Close the scanner
        input.close();
    }
}