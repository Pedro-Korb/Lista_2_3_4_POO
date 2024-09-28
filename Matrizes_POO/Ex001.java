import java.util.Scanner;

public class Ex001 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int size = 0;

        while (true) 
        {
            System.out.print("Digite um número ímpar entre 3 e 11: ");
            size = input.nextInt();
            if (size >= 3 && size <= 11 && size % 2 != 0) 
            {
                break;
            } else 
            	
            {
                System.out.println("ERRO! Resposta inválida.");
            }
        }

        int matrix[][] = new int[size][size];


        for (int i = 0; i < size; i++) 
        {
            for (int j = 0; j < size; j++) 
            {
                System.out.print("Digite o valor para a posição (" + i + "," + j + "): ");
                matrix[i][j] = input.nextInt();
            }
        }


        int sum = 0, countEven = 0, countOdd = 0;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int sumMainDiagonal = 0, sumSecondaryDiagonal = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int value = matrix[i][j];
                sum += value;
                if (value > max) max = value;
                if (value < min) min = value;
                if (value % 2 == 0) countEven++;
                else countOdd++;


                if (i == j) sumMainDiagonal += value;
                if (i + j == size - 1) sumSecondaryDiagonal += value;
            }
        }

        double average = (double) sum / (size * size);
        System.out.println();
        System.out.println("Soma dos elementos: " + sum);
        System.out.printf("Média dos elementos: %.2f%n", average);
        System.out.println("Maior valor: " + max);
        System.out.println("Menor valor: " + min);
        System.out.println("Contador de pares: " + countEven);
        System.out.println("Contador de ímpares: " + countOdd);
        System.out.println("Soma da diagonal principal: " + sumMainDiagonal);
        System.out.println("Soma da diagonal secundária: " + sumSecondaryDiagonal);

        System.out.println("Matriz:");
        for (int i = 0; i < size; i++) 
        {
            for (int j = 0; j < size; j++) 
            {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("");
        }
        input.close();
    }
    
}