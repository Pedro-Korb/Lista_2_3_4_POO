import java.util.Scanner;

public class Ex029 {

	public static void main(String[] args) {
		// Adjustable multiplication table

		Scanner input = new Scanner(System.in);

		int end = 0;

		System.out.print("Tabuada para consulta: ");
		int n1 = input.nextInt();

		System.out.print("Início: ");
		int st = input.nextInt();


		do
		{
			System.out.print("Fim: ");
			end = input.nextInt();
			
			if (end <= st)
			{
				System.err.println("ERRO! Valor final menor ou igual ao inicial");
				System.out.println();
			}
		} while (end <= st);
		
		System.out.println("\n=============");
		for (int i = st; i <= end; i++)
		{
			System.out.println(n1 + " x " + i + " = " + (n1*i));
		}
		System.out.println("=============");

		input.close();
	}

}
