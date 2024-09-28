import java.util.Scanner;

public class Ex028 {

	public static void main(String[] args) {
		// Temperature control

		Scanner input = new Scanner(System.in);

		double temp = 0;
		double sum = 0;
		double greater = 0;
		double lower = 0;

		int count = 0;
		int ans = 1;

		while (ans == 1)
		{
			do
			{
				System.out.print(count+1 + "° Temperatura (°C): ");
				temp = input.nextInt();

				if (temp < -90 || temp > 58)
				{
					System.err.println("ERRO! Temperatura inválida!");
					System.out.println();
				}
			} while (temp < -90 || temp > 58);

			if (count == 0)
			{
				greater = temp;
				lower = temp;
			}
			else if (temp > greater)
			{
				greater = temp;
			}
			else if (temp < lower)
			{
				lower = temp;
			}

			do
			{
				System.out.print("[1] Continuar [0] Fechar: ");
				ans = input.nextInt();

				if (ans < 0 || ans > 1)
				{
					System.err.println("ERRO! Resposta inválida.");
					System.out.println();
				}
			} while (ans < 0 || ans > 1);

			count++;
			sum += temp;
			System.out.println();

		}
		
		System.out.println("=================================");
		System.out.println("Temperatura informadas: " + count);
		System.out.println("Maior temperatura:      " + greater + "°C");
		System.out.println("Menor temperatura:      " + lower + "°C");
		System.out.println("Média da temperatura:   " + (sum/count) + "°C");
		System.out.println("=================================");

		input.close();
	}

}
