import java.util.Scanner;


public class Ex006 {

	public static void main(String[] args) {
		// Odd numbers from 1 to 50

		final int LEN = 50;

		Scanner input = new Scanner(System.in);

		System.out.println("Números ímpares até 50");
		for (int i = 1; i <= LEN; i+= 2)
		{
			System.out.print(i + " ");

		}

		input.close();
	}

}
