import java.util.Scanner;

public class Ex005 {

	public static void main(String[] args) {
		// Numbers from 1 to 20
		
		final int len = 20;
		
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i <= len; i++)
		{
			System.out.println(i);
		}
		
		System.out.println();
		
		for (int i = 0; i <= len; i++)
		{
			System.out.print(i + " ");
		}
		
		
		input.close();
	}

}
