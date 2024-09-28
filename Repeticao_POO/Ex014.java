import java.util.Scanner;

public class Ex014 {

	public static void main(String[] args) {
		// Terms of the series

		Scanner input = new Scanner(System.in);

		int value = 1;
		double sum = 0;

		System.out.println("S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m.");
		System.out.print("Números de termos do exemploa acima deseja imprimir na tela: ");
		int qt = input.nextInt();
		
		
		System.out.println();
		for (int i = 1; i <= qt; i++)
		{
			if (i < qt)
			{
				System.out.print(i + "/" + value + " + ");
			}
			else
			{
				System.out.print(i + "/" + value);
			}
			
			sum += ((double)i / (double)value);
			value+=2;
		}
		
		System.out.println();
		System.out.println("Soma: " + sum);
		
		input.close();
	}

}
