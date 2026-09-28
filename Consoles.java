// Abstract class implementing the IConsoles interface
public abstract class Consoles implements IConsoles {
    // Protected variables so the subclass can access them
    protected String consoleType;
    protected String storeName;
    protected int totalSales;

    // Constructor accepting the required parameters
    public Consoles(String consoleType, String storeName, int totalSales) {
        this.consoleType = consoleType;
        this.storeName = storeName;
        this.totalSales = totalSales;
    }

    // Implementing the interface methods to return the values
    @Override
    public String getConsoleType() {
        return consoleType;
    }

    @Override
    public String getStore() {
        return storeName;
    }

    @Override
    public int getTotalSales() {
        return totalSales;
    }

    // Abstract method that must be implemented by the subclass
    public abstract void printReport();
}