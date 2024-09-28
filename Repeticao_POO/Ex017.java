import java.util.Scanner;

public class Ex017 {

	public static void main(String[] args) {
		// Prime number checker
		
		
		Scanner input = new Scanner(System.in);

		int n1 = 0;
		int cont = 0;

		System.out.println("Verificador de número primo");

		do
		{
			System.out.print("Digite um valor: ");
			n1 = input.nextInt();

			if (n1 < 1)
			{
				System.out.println();
				System.out.println("ERRO! Digite um valor válido");
			}

		} while (n1 < 1);


		for(int i = 1; i <= n1; i++)
		{
			if (n1 % i == 0)
			{
				cont ++;
			}
		}

		System.out.println();

		if (cont == 2)
		{
			System.out.println("O valor " + n1 + " é PRIMO.");
		}
		else
		{
			System.out.println("O valor " + n1 + " NÃO É PRIMO.");
		}

		cont = 0;

		input.close();
	}

}
