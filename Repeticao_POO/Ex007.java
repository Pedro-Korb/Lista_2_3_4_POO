import java.util.Scanner;

public class Ex007 {

	public static void main(String[] args) {
		// Numbers between values
		
		Scanner input = new Scanner(System.in);
		
		int n3 = 0;
		int n4 = 0;
		
		System.out.println("1º número: ");
		int n1 = input.nextInt();
		
		System.out.println("2º número: ");
		int n2 = input.nextInt();
		
		if (n2 < n1)
		{
			n3 = n1;
			n4 = n2;
			n1 = n4;
			n2 = n3;
		}
		
		for(int i = n1+1; i < n2; i ++)
		{
			System.out.print(i + " ");
		}
		
		input.close();
	}

}