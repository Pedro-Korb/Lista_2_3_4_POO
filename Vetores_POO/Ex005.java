import java.util.Scanner;

public class Ex005 {

	public static void main(String[] args) {
		// Even and odd vector
		
		final int LEN = 20;
		
		int vec[] = new int[LEN];

		int count_odd = 0;
		int count_even = 0;
		
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < LEN; i++)
		{
			System.out.print((i+1) + "° Valor: ");
			vec[i] = input.nextInt();
			
			if (vec[i] % 2 == 0)
			{
				count_even ++;
			}
			else if (vec[i] % 2 != 0)
			{
				count_odd ++;
			}
		}
		
		int odd[] = new int[count_odd];
		int even[] = new int[count_even];
		
		count_odd = 0;
		count_even = 0;
		
		for (int i = 0; i < LEN; i++)
		{
			if (vec[i] % 2 == 0)
			{
				even[count_even] = vec[i];
				count_even++;
			}
			else if (vec[i] % 2 != 0)
			{
				odd[count_odd] = vec[i];
				count_odd ++;
			}
		}
		
		System.out.println("\n");
		System.out.println("Números digitados: ");
		for (int a = 0; a < LEN; a++)
		{
			System.out.print(vec[a] + " ");
		}
		
		System.out.println("\n");
		System.out.println("Números ímpares:");
		for (int j = 0; j < count_odd; j++)
		{
			System.out.print(odd[j] + " ");
		}
		
		System.out.println("\n");
		System.out.println("Números Pares: ");
		for (int k = 0; k < count_even; k++)
		{
			System.out.print(even[k] + " ");
		}
		

		input.close();
	}

}
