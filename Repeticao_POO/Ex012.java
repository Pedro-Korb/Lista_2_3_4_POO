import java.util.Scanner;

public class Ex012 {

	public static void main(String[] args) {
		// Fibonacci

		Scanner input = new Scanner(System.in);

		int n1 = 0;
		int n2 = 0;
		int n3 = 1;
		
		System.out.println("Termos para FIBONACCI: ");
		int numbers = input.nextInt();
		
		if (numbers > 1)
		{
			System.out.print("1 ");
		}
		
		for (int i = 1; i < numbers; i++)
		{
			n1 = n2 + n3;
			n2 = n3;
			n3 = n1;
			
			System.out.print(n1 + " ");
		}

		input.close();
	}
}