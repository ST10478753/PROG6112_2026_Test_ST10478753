// Subclass extending the abstract Consoles class
public class ConsoleSales extends Consoles {

    // Constructor matching the abstract class constructor
    public ConsoleSales(String consoleType, String storeName, int totalSales) {
        super(consoleType, storeName, totalSales);
    }

    // Overriding the printReport method to display the formatted output
    @Override
    public void printReport() {
        System.out.println();
        System.out.println("CONSOLE SALES REPORT");
        System.out.println("**********************");
        System.out.println("CONSOLE TYPE: " + getConsoleType());
        System.out.println("STORE: " + getStore());
        System.out.println("TOTAL SALES: " + getTotalSales());
    }
}