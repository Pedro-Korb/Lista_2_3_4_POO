import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Ex005 {

    public static void main(String[] args) {
        // Lottery Ticket Generation Program
    	
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Quantas cartelas deseja preencher? ");
        int numTickets = input.nextInt();

        int tickets[][] = new int[numTickets][6];


        for (int i = 0; i < numTickets; i++) {
            tickets[i] = generateUniqueNumbers(random);
        }


        int[] drawnNumbers = generateUniqueNumbers(random);
        System.out.print("Números sorteados: ");
        System.out.println(Arrays.toString(drawnNumbers));

        System.out.println("\nResultados das cartelas:");
        for (int i = 0; i < numTickets; i++) {
            int matches = countMatches(tickets[i], drawnNumbers);
            Arrays.sort(tickets[i]);
            System.out.print("Cartela " + (i + 1) + ": " + Arrays.toString(tickets[i]) + " - Total de acertos: " + matches);
            System.out.println();
        }

        input.close();
    }

    private static int[] generateUniqueNumbers(Random random) {
        int[] numbers = new int[6];
        boolean[] selected = new boolean[61];
        int count = 0;

        while (count < 6) {
            int number = random.nextInt(60) + 1;
            if (!selected[number]) {
                selected[number] = true;
                numbers[count++] = number;
            }
        }

        return numbers;
    }

    private static int countMatches(int[] ticket, int[] drawnNumbers) {
        int count = 0;
        for (int number : ticket) {
            for (int drawn : drawnNumbers) {
                if (number == drawn) {
                    count++;
                }
            }
        }
        return count;
    }
}
