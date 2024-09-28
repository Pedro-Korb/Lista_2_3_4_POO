import java.util.Scanner;

public class Ex009 {

	public static void main(String[] args) {
		// Multiplication table
		
		Scanner input = new Scanner(System.in);
		
		final int END = 10;
		final int ST = 1;
		
		int num = 0;
		
		
		do
		{
			System.out.println("Número para ver tabuada: ");
			num = input.nextInt();
			
			if (num < 1)
			{
				System.out.println("ERRO! Digite um valor INTEIRO maior que 0!");
			}
		} while (num < 1);
		
		
		System.out.println();
		System.out.println("============");
		for (int i = ST; i <= END; i++)
		{
			if (i < 10)
			{
				System.out.println(num + " x  " + i + " = " + (i*num));
			}
			else
			{
				System.out.println(num + " x " + i + " = " + (i*num));
			}
			
		}
		System.out.println("===========");
		
		input.close();

	}

}
