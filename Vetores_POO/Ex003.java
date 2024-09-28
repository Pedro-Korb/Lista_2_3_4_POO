import java.util.Scanner;

public class Ex003 {

	public static void main(String[] args) {
		// Grades and average
		
		final int LEN = 4;
		final int ST = 0;
		
		int sum = 0;
		
		float vect[] = new float[LEN];
		
		
		Scanner input = new Scanner(System.in);
		
		for (int i = ST; i < LEN; i++)
		{
			do
			{
				System.out.print(i+1 + "º Nota: ");
				vect[i] = input.nextFloat();
				
				if (vect[i] < 0 || vect[i] > 10)
				{
					System.err.println("ERRO! Nota inválida");
					System.out.println();
				}
			} while (vect[i] < 0 || vect[i] > 10);
			
			
			sum += vect[i];
		}
		
		System.out.println("\nSua média é igual a: " +  sum/(float)LEN);
		
		input.close();
	}

}
