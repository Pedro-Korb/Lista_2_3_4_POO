import java.util.Scanner;

public class Ex024 {

	public static void main(String[] args) {
		// Investment in CD's

		Scanner input = new Scanner(System.in);

		double value = 0;
		double value_unity = 0;
		double unity = 0;

		do
		{
			System.out.println("Valor tota investido em CD'S: ");
			value = input.nextDouble();

			if (value <= 0)
			{
				System.out.println();
				System.out.println("ERRO! Valor inválido!");
			}
		} while (value <= 0);

		do
		{
			System.out.println("Valor médio de cada CD: ");
			value_unity = input.nextDouble();
			if (value_unity <= 0 || value_unity > value)
			{
				System.out.println();
				System.out.println("ERRO! Valor inválido!");
			}
		} while (value_unity <= 0 || value_unity > value);

		unity = value / value_unity; 
		System.out.println("Estimativa do total de CD'S: " + (int)unity);
		input.close();
	}

}
