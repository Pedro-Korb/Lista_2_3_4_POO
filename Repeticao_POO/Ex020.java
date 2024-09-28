import java.util.Scanner;

public class Ex020 {

	public static void main(String[] args) {
		// Grade average 
		
		Scanner input = new Scanner(System.in);
		
		int ans = 1;
		int cont = 0;
		float n1 = 0;
		double sum = 0;
		double med = 0;
		
		while (ans == 1)
		{
			do
			{
				System.out.print((cont + 1) + "º nota: ");
				n1 = input.nextFloat();
				
				if (n1 < 0 || n1 > 10)
				{
					System.out.println();
					System.out.println("ERRO! Digite uma nota válida");
				}
				
				do
				{
					System.out.print("Deseja digitar outra nota? [1] SIM [0] NÃO: ");
					ans = input.nextInt();
					if (ans < 0 || ans > 1)
					{
						System.out.println();
						System.out.println("ERRO! Digite uma resposta válida!");
					}
				} while (ans < 0 || ans > 1);
				
			} while (n1 < 0 || n1 > 10);
			
			System.out.println();
			
			cont++;
			sum += n1;
		}
		med = (sum / cont);
		System.out.println("Média das " + cont + " notas informadas: " + med);
		
		
		
		input.close();

	}

}
