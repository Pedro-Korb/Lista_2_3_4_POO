import java.util.Scanner;

public class Ex038 {

	public static void main(String[] args) {
		// Sorted reverse
		
		int num;
		int num_seq;

		
		Scanner input = new Scanner(System.in);
		
		do
		{
			System.out.print("Quantos números inteiros terá sua sequência de números? ");
			num_seq = input.nextInt();
			
			
			if (num_seq <= 0)
			{
				System.err.println("ERRO! Digite um resposta válida.");
			}
		} while (num_seq < 0);
		
		int vect[] = new int[num_seq];
		
		for (int i = 0 ; i < num_seq; i++)
		{
			do
			{
				System.out.print((i+1) + "º valor: ");
				num = input.nextInt();
				
				if (num < 0)
				{
					System.err.println("ERRO! Digite uma resposta válida.");
					System.out.println();
				}
				
			} while (num < 0);
			
			vect[i] = num;
		}
		
		System.out.println();
		
		System.out.println("Sua sequencia de valores é igual a: ");
		for (int i = 0 ; i < num_seq; i++)
		{
			System.out.print(vect[i] + " ");
		}
		
		System.out.println("\n");
		
		System.out.println("Sua sequencia de valores AO CONTRÁRIO fica: ");
		for (int i = (num_seq-1) ; i >= 0; i--)
		{
			System.out.print(vect[i] + " ");
		}
		
		input.close();
	}
	
}
