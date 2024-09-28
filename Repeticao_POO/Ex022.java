import java.util.Scanner;

public class Ex022 {

	public static void main(String[] args) {
		// Election
		
		Scanner input = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		int cand1 = 0;
		int cand2 = 0;
		int cand3 = 0;
		
		System.out.print("Número de votantes: ");
		num1 = input.nextInt();
		
		System.out.println("[1] 1º Candidato\n[2] 2º Candidato\n[3] 3º Candidato\n");
		
		for (int i = 1; i <= num1; i++)
		{
			do
			{
				System.out.println(i + "º voto: " );
				num2 = input.nextInt();
				
				if (num2 < 1 || num2 > 3)
				{
					System.out.println();
					System.out.println("ERRO! Voto inválido");
				}
				
			} while (num2 < 1 || num2 > 3);
			
			if (num2 == 1)
			{
				cand1 ++;
			}
			else if (num2 == 2)
			{
				cand2++;
			}
			else
			{
				cand3 ++;
			}
	
		}
		System.out.println();
		System.out.println("1º Canditato: " + cand1 + " votos");
		System.out.println("2º Canditato: " + cand2 + " votos");
		System.out.println("3º Canditato: " + cand3 + " votos");
		
		input.close();

	}

}
