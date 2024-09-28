import java.util.Scanner;

public class Ex015 {

	public static void main(String[] args) {
		// Bar chart of values

		final int LEN = 10;
		int values[] = new int[LEN];
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < LEN; i++) 
		{
			int valor;

			do {
				System.out.print("Digite um valor entre 0 e 20 (inclusivo) para a posição " + (i + 1) + ": ");
				valor = input.nextInt();

				if (valor < 0 || valor > 20) 
				{
					System.err.println("Valor inválido! Tente novamente.");
				}
			} while (valor < 0 || valor > 20);

			values[i] = valor;
		}

		System.out.println("\nGráfico de Valores:");
		for (int i = 0; i < LEN; i++) 
		{
			if (values[i] < 10)
			{
				System.out.print(values[i] + ":  ");
			}
			else
			{
				System.out.print(values[i] + ": ");
			}

			for (int j = 0; j < values[i]; j++) 
			{
				System.out.print("#");
			}
			System.out.println();
		}

		input.close();
	}

}
