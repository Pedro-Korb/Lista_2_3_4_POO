import java.util.Scanner;

public class Ex035 {

	public static void main(String[] args) {
		// Restaurant menu

		Scanner input = new Scanner(System.in);

		int ans = 1;
		int code = 0;
		int qt = 0;
		double sum = 0;

		System.out.println("Especificação      Código    Preço\r\n"
				+ "Cachorro Quente    100 R$    1,20\r\n"
				+ "Bauru Simples      101 R$    1,30\r\n"
				+ "Bauru com ovo      102 R$    1,50\r\n"
				+ "Hambúrguer         103 R$    1,20\r\n"
				+ "Cheeseburguer      104 R$    1,30\r\n"
				+ "Refrigerante       105 R$    1,00");
		System.out.println();

		while (ans != 0)
		{
			do
			{
				System.out.print("Código do pedido: ");
				code = input.nextInt();

				if (code < 100 || code > 105)
				{
					System.err.println("ERRO! Código inexistente\n");
				}

			} while (code < 100 || code > 105);

			do
			{
				System.out.print("Quantidade: ");
				qt = input.nextInt();

				if (qt < 0)
				{
					System.err.println("ERRO! Digite outro valor\n");
				}

			} while (qt < 0);

			do
			{
				System.out.print("Digitar outro valor? [1] Sim [0] Não ");
				ans = input.nextInt();

				if (ans < 0 || ans > 1)
				{
					System.err.println("ERRO! Digite outro valor\n");
				}

			} while (ans < 0 || ans > 1);

			if (code == 100)
			{
				sum += 1.2 * qt;
			}

			else if (code == 101)
			{
				sum += 1.3 * qt;
			}

			else if (code == 102)
			{
				sum += 1.5 * qt;
			}

			else if (code == 103)
			{
				sum += 1.2 * qt;
			}

			else if (code == 104)
			{
				sum += 1.3 * qt;
			}

			else if (code == 105)
			{
				sum += 1 * qt;
			}
			System.out.println();
		}

		System.out.println("Total do pedido: R$ " + sum);

		input.close();
	}

}
