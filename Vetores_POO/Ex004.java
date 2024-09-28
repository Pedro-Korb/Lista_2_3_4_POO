import java.util.Scanner;

public class Ex004 {

	public static void main(String[] args) {
		// Consonants in vector

		final int LEN = 10;
		final int ST = 0;


		String vect[] = new String[LEN];
		String cons[] = new String[LEN];
		String letters = "BCDFGHJKLMNPQRSTVWXYZ";
		String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		int count = 0;


		Scanner input = new Scanner(System.in);

		for (int i = ST; i < LEN; i++)
		{

			do
			{
				System.out.print(i+1 + "º Letra: ");
				vect[i] = input.nextLine().toUpperCase();
				if (vect[i].equals(" ") || vect[i].length() > 1 || !alpha.contains(vect[i]))
				{
					System.err.println("ERRO! Digite uma resposta válida.");
					System.out.println();
				}
					
			} while (vect[i].equals(" ") ||vect[i].length() > 1 || !alpha.contains(vect[i]));
			
			
			if (letters.contains(vect[i]))
			{
				cons[count] = vect[i];
				count++;
			}
		}
		
		System.out.println();
		System.out.println(count + " Consoantes foram digitadas, são elas:");
		
		for (int i = 0; i < count; i++)
		{
			System.out.print(cons[i] + " ");
		}

		input.close();
	}
}