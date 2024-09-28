import java.util.Scanner;

public class Ex031 {

	public static void main(String[] args) {
		// Student height control

		Scanner input = new Scanner(System.in);

		int code_greater_height = 0;
		int code_lower_height = 0;

		double greater_height = 0;
		double lower_height = 0;
		double height = 0;

		for (int i = 1; i <= 10; i++)
		{
			System.out.print("Número: ");
			int num = input.nextInt();

			do
			{
				System.out.print("Altura: ");
				height = input.nextDouble();
				
				if (height <= 0|| height > 3)
				{
					System.err.println("ERRO! Digite uma altura válida");
					System.out.println();
				}
				
				
			} while (height <= 0|| height > 3);



			if (i == 1)
			{
				code_greater_height = num;
				code_lower_height = num;

				greater_height = height;
				lower_height = height;
			}
			else if (height > greater_height)
			{
				greater_height = height;
				code_greater_height = num;
			}
			else if (height < lower_height)
			{
				lower_height = height;
				code_lower_height = num;
			}
			
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Maior altura: " + greater_height + "m - COD: " + code_greater_height);
		System.out.println("Menor altura: " + lower_height + "m - COD: " + code_lower_height);

		input.close();
	}

}
