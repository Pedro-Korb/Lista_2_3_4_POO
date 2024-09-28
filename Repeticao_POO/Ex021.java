import java.util.Scanner;

public class Ex021 {

	public static void main(String[] args) {
		// Age average
		
		Scanner input = new Scanner(System.in);
		
		int ans = 1;
		int cont = 0;
		int n1 = 0;
		int sum = 0;
		double med = 0;
		
		while (ans == 1)
		{
			do
			{
				System.out.print((cont + 1) + "º Idade: ");
				n1 = input.nextInt();
				
				if (n1 < 0 || n1 > 130)
				{
					System.out.println();
					System.out.println("ERRO! Digite uma idade válida");
				}
				
				do
				{
					System.out.print("Deseja digitar outra idade? [1] SIM [0] NÃO: ");
					ans = input.nextInt();
					if (ans < 0 || ans > 1)
					{
						System.out.println();
						System.out.println("ERRO! Digite uma resposta válida!");
					}
				} while (ans < 0 || ans > 1);
				
			} while (n1 < 0 || n1 > 130);
			
			System.out.println();
			
			cont++;
			sum += n1;
		}
		med = (sum / cont);
		System.out.println("Média das " + cont + " idades informadas: " + (int)med + " anos.");
		if (med < 25)
		{
			System.out.println("Turma JOVEM");
		}
		else if (med > 25 || med <= 60)
		{
			System.out.println("Turma ADULTA");
		}
		else
		{
			System.out.println("Turma IDOSA");
		}
		input.close();

	}

}
