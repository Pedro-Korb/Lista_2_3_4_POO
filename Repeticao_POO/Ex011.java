import java.util.Scanner;

public class Ex011 {

	public static void main(String[] args) {
		// Grade checker

		Scanner input = new Scanner(System.in);

		int sum_odd = 0;
		int sum_even = 0;
		
		for (int i = 0; i < 10; i++)
		{
			System.out.println((i+1) + "° valor: ");
			int n1= input.nextInt();
			
			if (n1 % 2 == 0)
			{
				sum_even += 1;
			}
			else
			{
				sum_odd += 1;
			}
		}

		System.out.println(sum_even + " números digitados são PARES");
		System.out.println(sum_odd + " números digitados são ÍMPARES");

		input.close();
	}

}
