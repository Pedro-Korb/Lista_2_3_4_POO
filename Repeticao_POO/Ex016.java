import java.util.Scanner;

public class Ex016 {

	public static void main(String[] args) {
		// Greater and lower value

		Scanner input = new Scanner(System.in);

		int greater = 0;
		int number_greater = 0;
		int lower = 0;
		int number_lower = 0;
		int sum = 0;
		int cont = 1;
		int ans = 1;
		
		while (ans == 1)
		{
			System.out.print(cont + "° valor: ");
			int n1 = input.nextInt();
			
			do
			{
				System.out.print("Digitar outro valor? [1] SIM [0] NÃO: ");
				ans = input.nextInt();
				
				if (ans != 0 && ans != 1)
				{
					System.out.println();
					System.out.println("ERRO! Digite uma resposta válida!");
				}
			} while (ans != 0 && ans != 1);
			
			System.out.println("");
			
			if (cont == 1)
			{
				greater = n1;
				lower = n1;
				number_greater = cont;
				number_lower = cont;
			}
			
			if (n1 > greater)
			{
				greater = n1;
				number_greater = cont;
			}
			else if (n1 < lower)
			{
				lower = n1;
				number_lower = cont;
			}
			
			sum += n1;
			cont ++;
		} 
		
		System.out.println("");
		System.out.println("Números digitados: " + (cont - 1));
		System.out.println("MAIOR valor: " + greater);
		System.out.println("Posição do MAIOR valor: " + number_greater + "°");
		System.out.println("MENOR valor: " + lower);
		System.out.println("Posição do MENOR valor: " + number_lower + "°");
		System.out.println("Soma dos valores: " + sum);
		input.close();
	}

}
