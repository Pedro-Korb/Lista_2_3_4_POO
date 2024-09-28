import java.util.Scanner;

public class Ex013 {

	public static void main(String[] args) {
		// Intercalate Two Arrays

		final int TAMANHO = 10;

		int vet1[] = new int[TAMANHO];
		int vet2[] = new int[TAMANHO];
		int vet3[] = new int[TAMANHO * 2];

		Scanner input = new Scanner(System.in);

		System.out.println("Digite os 10 elementos do primeiro vetor:");
		for (int i = 0; i < TAMANHO; i++) 
		{
			System.out.print("Elemento " + (i + 1) + ": ");
			vet1[i] = input.nextInt();
		}


		System.out.println("\nDigite os 10 elementos do segundo vetor:");
		for (int i = 0; i < TAMANHO; i++) 
		{
			System.out.print("Elemento " + (i + 1) + ": ");
			vet2[i] = input.nextInt();
		}


		int index = 0;
		
		for (int i = 0; i < TAMANHO; i++) 
		{
			vet3[index++] = vet1[i];
			vet3[index++] = vet2[i];
		}

		System.out.println("\nVetor intercalado:");
		for (int i = 0; i < vet3.length; i++) 
		{
			System.out.print(vet3[i] + " ");
		}

		input.close();

	}

}
