import java.util.Scanner;

public class Ex004 {

    public static void main(String[] args) {
        // Long Jump Competition Program
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o número de atletas: ");
        int n = input.nextInt();

        String[] athleteNames = new String[n];
        double[][] jumps = new double[n][5];
        double[] averages = new double[n];

        
        for (int i = 0; i < n; i++) {
            input.nextLine();
            System.out.print("Digite o nome do atleta " + (i + 1) + ": ");
            athleteNames[i] = input.nextLine();

            System.out.println("Digite os 5 saltos de " + athleteNames[i] + ":");
            for (int j = 0; j < 5; j++) {
                System.out.print("Salto " + (j + 1) + ": ");
                jumps[i][j] = input.nextDouble();
            }

            averages[i] = calculateAverage(jumps[i]);
            System.out.printf("Média de %s: %.2f%n", athleteNames[i], averages[i]);
        }

        // Resultados finais
        System.out.println("\nResultados finais:");
        double maxAverage = Double.MIN_VALUE;
        double minAverage = Double.MAX_VALUE;
        String champion = "";
        String lastPlace = "";

        for (int i = 0; i < n; i++) {
            System.out.printf("Atleta: %s, Saltos: ", athleteNames[i]);
            for (double jump : jumps[i]) {
                System.out.print(jump + " ");
            }
            System.out.printf("Média: %.2f%n", averages[i]);

            if (averages[i] > maxAverage) {
                maxAverage = averages[i];
                champion = athleteNames[i];
            }
            if (averages[i] < minAverage) {
                minAverage = averages[i];
                lastPlace = athleteNames[i];
            }
        }

        System.out.printf("Campeão: %s com média: %.2f%n", champion, maxAverage);
        System.out.printf("Último lugar: %s com média: %.2f%n", lastPlace, minAverage);

        input.close();
    }

    private static double calculateAverage(double[] jumps) {
        double minJump = Double.MAX_VALUE;
        double sum = 0;

        for (double jump : jumps) {
            sum += jump;
            if (jump < minJump) {
                minJump = jump;
            }
        }

        // Retornar a média descartando o pior salto
        return (sum - minJump) / (jumps.length - 1);
    }
}
