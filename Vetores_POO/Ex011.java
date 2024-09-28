import java.util.Scanner;

public class Ex011 {

	public static void main(String[] args) {
		// Split words by semicolon

		Scanner input = new Scanner(System.in);

		System.out.println("Digite várias palavras separadas por ';': ");
		String words = input.nextLine();


		String text[] = words.split(";");

		System.out.println();
		System.out.println("Palavras separadas:");
		for (int i = 0; i < text.length; i++) 
		{
			System.out.println((i + 1) + "° Palavra: " + text[i]);
		}

		input.close();

	}

}
