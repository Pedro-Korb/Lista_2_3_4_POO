import java.util.Scanner;

public class Ex002 {

	public static void main(String[] args) {
		// Reverse float vector
		
		final int LEN = 10;
		final int START = 0;
		float vect[] = new float[LEN];
		
		Scanner input = new Scanner(System.in);
		
		for (int i = START; i < LEN; i++)
		{
			
			System.out.print(i+1 + "º Valor real: ");
			vect[i] = input.nextFloat();
		}
		
		System.out.println("\nSeus valores reais na ordem inversa são: ");
		
		for (int j = LEN-1; j >= START; j--)
		{
			
			if (j == 0)
			{
				System.out.print(vect[j]);
			}
			else
			{
				System.out.print(vect[j] + " - ");
			}
		}
		
		input.close();

	}

}
