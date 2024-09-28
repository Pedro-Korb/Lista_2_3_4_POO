import java.util.Scanner;

public class Ex030 {

	public static void main(String[] args) {
		// Gym weight and height control

		Scanner input = new Scanner(System.in);

		int code = 1;
		int count = 0;
		int code_height_greater = 0;
		int code_weight_greater = 0;
		int code_height_lower = 0;
		int code_weight_lower = 0;

		double height = 0;
		double weight = 0;
		double greater_weight = 0;
		double greater_height = 0;
		double lower_weight = 0;
		double lower_height = 0;
		double sum_weight = 0;
		double sum_height = 0;

		while (code != 0)
		{
			System.out.print("Código: ");
			code = input.nextInt();

			if (code != 0)
			{
				count ++;
				do
				{
					System.out.print("Altura: ");
					height = input.nextDouble();

					if (height <= 0 || height > 3)
					{
						System.err.println("ERRO! Altura inválida");
						System.out.println();
					}

				} while (height <= 0 || height > 3 );

				do
				{
					System.out.print("Peso: ");
					weight = input.nextDouble();

					if (weight <= 20 || weight > 300)
					{
						System.err.println("ERRO! Peso inválida");
						System.out.println();
					}

				} while (weight <= 20 || weight > 300 );

				if (count == 1)
				{
					lower_height = height;
					lower_weight = weight;
					greater_weight = weight;
					greater_height = height;

					code_height_lower = code;
					code_height_greater = code;
					code_weight_lower = code;
					code_weight_greater = code;
				}

				if (weight > greater_weight)
				{
					greater_weight = weight;
					code_weight_greater = code;
				}
				if (weight < lower_weight)
				{
					lower_weight = weight;
					code_weight_lower = code;
				}

				if (height > greater_height)
				{
					greater_height = height;
					code_height_greater = code;
				}
				if (height < lower_height)
				{
					lower_height = height;
					code_height_lower = code;
				}

				sum_weight += weight;
				sum_height += height;
			}
			System.out.println();
		}

		System.out.println("");
		System.out.println("Maior peso: " + greater_weight + "Kg - " + code_weight_greater);
		System.out.println("Menor peso: " + lower_weight + "Kg - " + code_weight_lower);
		System.out.println("Maior altura: " + greater_height + "m - " + code_height_greater);
		System.out.println("Menor altura: " + lower_height + "m - " + code_height_lower);
		System.out.println("Média das alturas: " + (sum_height/count) + "m");
		System.out.println("Média dos pesos: " + (sum_weight/count) + "Kg");
		input.close();
	}

}
