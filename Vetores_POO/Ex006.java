import java.util.Scanner;

public class Ex006 {

	public static void main(String[] args) {
		// Students grade average
		
		final int ST = 0;
		final int LEN = 10;
		final int GRADES = 4;
		
		double aver[] = new double[LEN];
		String name[] = new String[LEN];
		
		double sum = 0;
		double n = 0;
		
		Scanner input = new Scanner(System.in);
		
		for (int i = ST; i < LEN; i++)
		{
			System.out.print((i+1) + "° Nome: ");
			name[i] = input.nextLine();
			
			for (int j = ST; j < GRADES; j++)
			{
				do
				{
					System.out.print((j+1) + "° Nota do " + (i+1) + "° aluno: ");
					n = input.nextDouble();
					
					if (n < 0 || n > 10)
					{
						System.err.println("ERRO! Nota inválida");
						System.out.println();
					} 
				} while (n < 0 || n > 10);
				
				sum += n;
			}
			
			aver[i] = (sum/4);
			sum = 0;
			input.nextLine();
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Alunos com média maior ou igual a 7:");
		for (int a = ST; a < LEN; a++)
		{
			if (aver[a] >= 7)
			{
				System.out.print(name[a] + ": " + aver[a] + "\n");
			}
			
		}

		
		input.close();
		
		/*6. Faça um Programa que peça as quatro notas de 10 alunos, calcule e armazene num vetor a
		média de cada aluno, imprima o número de alunos com média maior ou igual a 7.0.*/

	}

}
