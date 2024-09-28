import java.util.Scanner;

public class Ex007 {

	public static void main(String[] args) {
		// Sum and multiply array

		final int LEN = 5;
		final int ST = 0;
		
		int vect[] = new int[LEN];
		
		int sum = 0, mult = 1;
		
		Scanner input = new Scanner(System.in);
		
		for (int i = ST; i < LEN; i++)
		{
			System.out.print((i+1) + "° valor: ");
			vect[i] = input.nextInt();
			sum += vect[i];
			mult *= vect[i];
		}
		
		System.out.println();
		System.out.print("Valores digitado: ");
		for (int j = ST; j < LEN; j++)
		{
			System.out.print(vect[j] + " ");
		}
		System.out.println();
		System.out.print("Soma dos valores: " + sum + "\nMultplicação dos valores: " + mult);
		
		input.close();

	}

}
