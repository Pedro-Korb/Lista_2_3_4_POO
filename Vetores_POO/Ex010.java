import java.util.Scanner;

public class Ex010 {

	public static void main(String[] args) {
		// Validate date vector
		
		Scanner input = new Scanner(System.in);
		
		String date = " ";
		
		do
		{
			System.out.println("Digite uma data no formato XX/YY/ZZZZ: ");
			date = input.nextLine();
			
			if (date.length() != 10 || date.charAt(0) > '3' || (date.charAt(0) == '3' && date.charAt(1) > '1') || date.charAt(3) > '1' || (date.charAt(3) == '1' && date.charAt(4) > '2') || date.charAt(0) < '0' || date.charAt(1) < '0' || date.charAt(3) < '0' || date.charAt(4) < '0' || date.charAt(6) < '0' || date.charAt(7) < '0' || date.charAt(8) < '0' || date.charAt(9) < '0')
			{
				System.err.println("ERRO! Data inválida!");
				System.out.println();
			}

		} while (date.length() != 10 || date.charAt(0) > '3' || (date.charAt(0) == '3' && date.charAt(1) > '1') || date.charAt(3) > '1' || (date.charAt(3) == '1' && date.charAt(4) > '2') || date.charAt(0) < '0' || date.charAt(1) < '0' || date.charAt(3) < '0' || date.charAt(4) < '0' || date.charAt(6) < '0' || date.charAt(7) < '0' || date.charAt(8) < '0' || date.charAt(9) < '0');
		

		input.close();
		
		System.out.println();
		System.out.println("Dia:  " + date.charAt(0) + date.charAt(1));
		System.out.println("Mês:  " + date.charAt(3) + date.charAt(4));
		System.out.println("Ano : " + date.charAt(6) + date.charAt(7) + date.charAt(8) + date.charAt(9));

	}

}
