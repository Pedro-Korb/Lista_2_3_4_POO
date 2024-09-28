import java.util.Scanner;

public class Ex001 {

	public static void main(String[] args) {
		// Grade checker
		
		Scanner input = new Scanner(System.in);
		
		float number = 0;
		
		do
		{
			System.out.println("Digite uma nota entre 0 e 10: ");
			number = input.nextFloat();
			
			if (number < 0 || number > 10)
			{
				System.out.println("ERRO! Nota inválida!");
				System.out.println();
			}
			
		} while (number < 0 || number > 10);
		
		System.out.println("OK!");
		
		input.close();
	}

}
