public class Question1 {
    public static void main(String[] args) {
        // Single-dimensional arrays for the city names and console types
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        String[] consoles = {"PS5", "XBOX", "SWITCH"};
        
        // Two-dimensional array holding the sales data for each city
        // Rows represent cities, columns represent consoles
        int[][] sales = {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200}
        };
        
        // Array to store the calculated total for each city
        int[] cityTotals = new int[3];

        // Print the report header
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("-------------------------------------------------------------");
        System.out.printf("%-20s %-10s %-10s %-10s\n", "", consoles[0], consoles[1], consoles[2]);

        // Loop through each city and its corresponding sales row
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-20s ", cities[i]);
            
            // Loop through the columns for the current city
            for (int j = 0; j < sales[i].length; j++) {
                System.out.printf("%-10d ", sales[i][j]);
                
                // Add the current sale to the running total for this city
                cityTotals[i] += sales[i][j];
            }
            System.out.println();
        }

        // Print the section for the calculated city totals
        System.out.println("-------------------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("-------------------------------------------------------------");
        
        // Variables to track the highest sales and which city it belongs to
        int maxSales = 0;
        String topCity = "";

        // Loop through the calculated totals to print them and find the highest
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-20s %-10d\n", cities[i], cityTotals[i]);
            
            // Check if the current city's total is higher than the current max
            if (cityTotals[i] > maxSales) {
                maxSales = cityTotals[i];
                topCity = cities[i];
            }
        }

        // Print the final result for the city with the most sales
        System.out.println();
        System.out.println("CITY WITH THE MOST SALES: " + topCity);
        System.out.println("-------------------------------------------------------------");
    }
}