import java.util.Scanner;

public class Ex027 {

	public static void main(String[] args) {
		// Market Cash System

		Scanner input = new Scanner(System.in);

		final int UNDEFINED_ARRAY_SIZE = 500;


		double price = 0;
		double sum = 0;
		double value = 0;

		int ans = 1;
		int cont = 0;

		double vect[] = new double[UNDEFINED_ARRAY_SIZE];

		while (ans == 1)
		{

			do
			{
				System.out.print("Produto " + (cont+1) + ": ");
				price = input.nextDouble();

				if (price <= 0)
				{
					System.err.println("ERRO! Valor inválido!\n");
				}
			} while(price <= 0);

			vect[cont] = price;
			sum += price;

			do
			{
				System.out.print("Deseja informar mais um produto [1] Continuar [0] Encerrar: ");
				ans = input.nextInt();

				if (ans < 0 || ans > 1) {
					System.err.println("ERRO! Resposta inválida\n");
				}
			} while (ans < 0 || ans > 1);

			cont++;
			System.out.println();
		}
		
		System.out.println("\nLOJAS TABAJARA");
		for (int i = 0; i < cont; i++)
		{
			System.out.println(i + 1 + "° Produto = R$ " + vect[i]);
		}
		
		System.out.println("TOTAL = R$ " + sum + "\n");
		
		do
		{
			System.out.print("Valor em dinheiro fornecido pelo cliente: ");
			value = input.nextDouble();
			if (value < sum || value > (sum + 200))
			{
				System.err.println("ERRO! Valor informe outro valor!");
				System.out.println();
			}
		} while (value < sum || value > (sum + 200));
		
		System.out.println("\nTROCO = R$" + (value - sum));
		

		input.close();
	}

}
