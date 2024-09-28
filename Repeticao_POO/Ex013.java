import java.util.Scanner;

public class Ex013 {

	public static void main(String[] args) {
		// 	Factorial

		Scanner input = new Scanner(System.in);
		
		int n1 = 1;
		
		System.out.println("Número para descobrir fatorial: ");
		int fac = input.nextInt();
		
		for(int i = fac; i > 0 ; i--)
		{
			
			n1 *= i;		
			
		}
		System.out.println();
		System.out.println(fac + "! = " + n1);

		input.close();
	}

}
