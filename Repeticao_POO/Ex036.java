import java.util.Scanner;

public class Ex036 {

	public static void main(String[] args) {
		// Election v2.0

		Scanner input = new Scanner(System.in);

		int cand1 = 0;
		int cand2 = 0;
		int cand3 = 0;
		int cand4 = 0;
		int vote = 1;
		int nul = 0;
		int white = 0;
		int count = 1;

		while (vote != 0)
		{
			do
			{
				System.out.print("[1] José\n[2] Ronaldo\n[3] Marcos\n[4] João\n[5] Branco\n[6] Nulo\n[0] FINALIZAR\n" + count + "° Voto: ");
				vote = input.nextInt();
				
				if (vote < 0 || vote > 6)
				{
					System.err.println("ERRO! Voto inválido");
					System.out.println();
				}
			} while (vote < 0 || vote > 6);



			if (vote == 1)
			{
				cand1 ++;
			}
			else if (vote == 2)
			{
				cand2++;
			}

			else if (vote == 3)
			{
				cand3++;
			}

			else if (vote == 4)
			{
				cand4++;
			}

			else if (vote == 5)
			{
				white++;
			}

			else if (vote == 6)
			{
				nul++;
			}
			
			count ++;
			System.out.println();
		}
		
		count -= 2;

		System.out.println();
        System.out.println("José:           " + cand1 + " votos" + " (" + String.format("%.2f", (((double)cand1 / count) * 100)) + "%)");
        System.out.println("Ronaldo:        " + cand2 + " votos" + " (" + String.format("%.2f", (((double)cand2 / count) * 100)) + "%)");
        System.out.println("Marcos:         " + cand3 + " votos" + " (" + String.format("%.2f", (((double)cand3 / count) * 100)) + "%)");
        System.out.println("João:           " + cand4 + " votos" + " (" + String.format("%.2f", (((double)cand4 / count) * 100)) + "%)");
        System.out.println("Votos Brancos:  " + white + " votos" + " (" + String.format("%.2f", (((double)white / count) * 100)) + "%)");
        System.out.println("Votos Nulos:    " + nul + " votos" + " (" + String.format("%.2f", (((double)nul / count) * 100)) + "%)");
        System.out.println("Total de votos: " + count);
		input.close();

	}

}