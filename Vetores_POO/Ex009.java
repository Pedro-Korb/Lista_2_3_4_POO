import java.util.Scanner;

public class Ex009 {

	public static void main(String[] args) {
		// Text in character array
		       
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite uma palvra: ");
		String word = input.nextLine();
		
		
		
        char[] text = new char[word.length()];

        for (int i = 0; i < word.length(); i++) 
        {
            text[i] = word.charAt(i);
        }
		
        System.out.println();
        for (int j = 0; j < word.length(); j++) 
        {
        	System.out.print(text[j] + " ");
        }
		
		input.close();

	}

}
