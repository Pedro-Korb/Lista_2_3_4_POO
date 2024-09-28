import java.util.Scanner;

public class Ex002 {

    public static void main(String[] args) {
        // Price Analysis for Supermarkets
    	
        Scanner input = new Scanner(System.in);
        
        int numProducts = 5;
        String[] supermarkets = {"Supermercado A", "Supermercado B", "Supermercado C", "Supermercado D", "Supermercado E"};
        double[][] prices = new double[numProducts][supermarkets.length];
        

        for (int i = 0; i < numProducts; i++) 
        {
            System.out.println("Produto " + (i + 1) + ":");
            for (int j = 0; j < supermarkets.length; j++) 
            {
                System.out.print("Digite o preço em " + supermarkets[j] + ": ");
                prices[i][j] = input.nextDouble();
            }
        }

        double[] sumPrices = new double[supermarkets.length];
        double[] averagePrices = new double[numProducts];

        for (int i = 0; i < numProducts; i++) 
        {
            double sum = 0;
            for (int j = 0; j < supermarkets.length; j++) 
            {
                sum += prices[i][j];
                sumPrices[j] += prices[i][j];
            }
            averagePrices[i] = sum / supermarkets.length;
        }

        System.out.println("\nPreços em cada supermercado:");
        for (int j = 0; j < supermarkets.length; j++) 
        {
            System.out.print(supermarkets[j] + ": ");
            for (int i = 0; i < numProducts; i++) 
            {
                System.out.print(prices[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nMédia de preço por produto:");
        for (int i = 0; i < numProducts; i++) 
        {
            System.out.printf("Produto %d: %.2f%n", i + 1, averagePrices[i]);
        }

        System.out.println("\nSoma de preços por supermercado:");
        for (int j = 0; j < supermarkets.length; j++) 
        {
            System.out.printf("%s: %.2f%n", supermarkets[j], sumPrices[j]);
        }

        double minSum = Double.MAX_VALUE;
        double maxSum = Double.MIN_VALUE;
        String cheapestSupermarket = "";
        String expensiveSupermarket = "";

        for (int j = 0; j < supermarkets.length; j++) 
        {
            if (sumPrices[j] < minSum) 
            {
                minSum = sumPrices[j];
                cheapestSupermarket = supermarkets[j];
            }
            if (sumPrices[j] > maxSum) 
            {
                maxSum = sumPrices[j];
                expensiveSupermarket = supermarkets[j];
            }
        }

        System.out.printf("Total no supermercado mais barato (%s): %.2f%n", cheapestSupermarket, minSum);
        System.out.printf("Total no supermercado mais caro (%s): %.2f%n", expensiveSupermarket, maxSum);

        input.close();
    }
}
