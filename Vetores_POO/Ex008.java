import java.util.Scanner;
import java.util.Random;

public class Ex008 {

	public static void main(String[] args) {
		// Password generator
		
		final int ST = 0;
		
        String vowel = "AEIOU";
        String cons = "BCDFGHJKLMNPQRSTVWXYZ";
        
        char[] vow = new char[vowel.length()];
        char[] con = new char[cons.length()];

        int value = 0;
        
        for (int i = 0; i < vowel.length(); i++) 
        {
            vow[i] = vowel.charAt(i);
        }

        for (int j = 0; j < cons.length(); j++) 
        {
            con[j] = cons.charAt(j);
        }
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Quantos caracteres terá sua senha? ");
		value = input.nextInt();
		
		Random random = new Random();

		System.out.println();
		System.out.print("Sua senha é: ");
		for (int k  = ST; k < value; k++)
		{
			if (k % 2 == 0)
			{
				int ran = random.nextInt(con.length);
				System.out.print(con[ran] + "");
			}
			else
			{
				int ran_1 = random.nextInt(vowel.length());
				System.out.print(vow[ran_1] + "");
			}
			
		}
		
		input.close();

	}

}
