import java.util.Scanner;

public class Ex010 {

	public static void main(String[] args) {
		// Number squared
		
		Scanner input = new Scanner(System.in);
		
		int sum = 1;
		int n2 = 0;
		System.out.println("Base: ");
		int n1 = input.nextInt();
		
		
		do
		{
			System.out.println("Expoente: ");
			n2 = input.nextInt();
			if (n2 < 0)
			{
				System.out.println("ERRO! Expoente menor que 0. Tente novamente!");
			}
			
		} while (n2 < 0);
		
		
		
		for (int i = 1; i < n2; i++)
		{
			if (i == 1)
			{
				sum = n1 * n1;
			}
			else
			{
				sum = sum * n1;
			}
		}
		
		if (n2 == 1)
		{
			System.out.println(n1 + " ^ " + n2 + " = " + n1);
		}
		else
		{
			System.out.println(n1 + " ^ " + n2 + " = " + sum);
		}
		
		input.close();

	}

}
