import java.util.Scanner;

public class Ex004_B {

	public static void main(String[] args) {
		// Growth rate v2.0

		Scanner input = new Scanner(System.in);

		int cont = 0;
		
		double pop_a = 0;
		double pop_b = 0;
		
		float rate_a = 0;
		float rate_b = 0;
		
		do
		{
			System.out.print("População A: ");
			pop_a = input.nextDouble();

			if (pop_a <= 0)
			{
				System.out.println();
				System.out.println("ERRO! Digite um valor válido!");
			}

		} while (pop_a <= 0);

		do
		{
			System.out.print("População B: ");
			pop_b = input.nextDouble();

			if (pop_b <= pop_a)
			{
				System.out.println();
				System.out.println("ERRO! Digite um valor válido!");
			}

		} while (pop_b <= pop_a);


		do
		{
			System.out.print("Taxa de crescimento da população A (em porcentagem): ");
			rate_a = input.nextFloat();

			if (rate_a <= 0)
			{
				System.out.println();
				System.out.println("ERRO! Digite um valor válido");
			}
		} while (rate_a <= 0);
		
		do
		{
			System.out.print("Taxa de crescimento da população B (em porcentagem): ");
			rate_b = input.nextFloat();

			if (rate_b >= rate_a)
			{
				System.out.println();
				System.out.println("ERRO! Porcentagem de crescimento maior ou igual à porcental da população 'A'!");
			}
		} while (rate_b >= rate_a);


		System.out.println();
		System.out.println("Poulação A: " + pop_a + " habitantes");
		System.out.println("Poulação B: "+ pop_b + " habitantes");
		System.out.println("Taxa de crescimento da população A: " + rate_a + "%");
		System.out.println("Taxa de crescimento da população B: " + rate_b + "%");

		rate_a = (1 + rate_a / 100);
		rate_b = (1 + rate_b / 100);
		
		while (pop_a < pop_b)
		{
			pop_a = pop_a * rate_a;
			pop_b = pop_b * rate_b;
			cont += 1;
		}

		System.out.println();
		System.out.println("Foram necessários " + cont + " anos para a população 'A' atingir a população 'B'");
		System.out.println("População 'A' após " + cont + " anos: " + (int)pop_a);
		System.out.println("Popolação 'B' após " + cont + " anos: " + (int)pop_b);

		input.close();
	}

}
