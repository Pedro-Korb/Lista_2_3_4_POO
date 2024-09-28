import java.util.Scanner;

public class Ex026 {

	public static void main(String[] args) {
		// PÃO-DE-ONTEM price table

		Scanner input = new Scanner(System.in);
		
		double price = 0;
		do
		{
			System.out.println("Preço do produto: ");
			price = input.nextDouble();
			
			if (price < 0)
			{
				System.err.println("\nERRO! Valor inválido");
			}
			
		} while (price < 0);
		
		
		for (int i = 1; i <= 50; i++)
		{
			if (i < 10)
			{
				System.out.println(i + "  - R$ " + (i * price));
			}
			else
			{
				System.out.println(i + " - R$ " + (i * price));
			}

		}
		
		System.out.println(" ");
		
		input.close();
	}
}