import java.util.Scanner;

public class Ex001 {

	public static void main(String[] args) {
		// Display integer vector
		
		int vect[] = new int[5];
		
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++)
		{
			
			System.out.print(i+1 + "º Valor: ");
			vect[i] = input.nextInt();
		}
		
		System.out.println("\nSeus valores são: ");
		
		for (int i = 0; i < 5; i++)
		{
			
			System.out.print(vect[i] + " ");
		}
		
		input.close();

	}

}
