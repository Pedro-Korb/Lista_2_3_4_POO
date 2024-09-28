import java.util.Scanner;

public class Ex023 {

	public static void main(String[] args) {
		// Student average
		
		Scanner input = new Scanner(System.in);
		
		int num_pess = 0;
		double med = 0;
		
		System.out.print("Número de turmas: ");
		int n1 = input.nextInt();
		
		for (int i = 1; i <= n1; i++)
		{
			do
			{
				System.out.println("Número de alunos na " + i + "º turma: ");
				num_pess = input.nextInt();
				
				if (num_pess < 0 || num_pess > 40)
				{
					System.out.println();
					System.out.println("ERRO! Número inválido de alunos.");
				}
			} while (num_pess < 0 || num_pess > 40);
				
			med += num_pess;
		}
		med = med / n1;
		System.out.println("Média de alunos nas " + n1 + " turmas: " + med);
		
		input.close();		
	}
	

}
