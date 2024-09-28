import java.util.Scanner;

public class Ex034 {

	public static void main(String[] args) {
		// Group of numbers
		
		Scanner input = new Scanner(System.in);

		int n1 = 0;
		int count = 1;
		int g1 = 0;
		int g2 = 0;
		int g3 = 0;
		int g4 = 0;
		int g5 = 0;
		
		while (n1 >= 0)
		{
			System.out.print(count + "° Valor: ");
			n1 = input.nextInt();
			
			if (n1 >= 0 && n1 <= 25)
			{
				g1 ++;
			}
			
			else if(n1 > 25 && n1 <= 50)
			{
				g2 ++;
			}
			
			else if(n1 > 50 && n1 <= 75)
			{
				g3 ++;
			}
			
			else if(n1 > 75 && n1 <= 100)
			{
				g4 ++;
			}
			else
			{
				g5 ++;
			}
			
			count++;
			
		}
		System.out.println();
		System.out.println(count-1 + " foram informados");
		System.out.println("[0  -  25] = " + g1 + " números");
		System.out.println("[25 -  50] = " + g2 + " números");
		System.out.println("[51 -  75] = " + g3 + " números");
		System.out.println("[76 - 100] = " + g4 + " números");
		System.out.println("[  +100  ] = " + g5);
	
		input.close();
	}

}
