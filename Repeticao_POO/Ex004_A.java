import java.util.Scanner;

public class Ex004_A {

	public static void main(String[] args) {
		// Growth rate
		
		Scanner input = new Scanner(System.in);
		
		double pop_a = 80000;
		double pop_b = 200000;
		int cont = 0;
		
		
		System.out.println("Poulação A: " + pop_a + " habitantes");
		System.out.println("Poulação B: " + pop_b + " habitantes");
		System.out.println("Taxa de crescimento da população A: 3.0%");
		System.out.println("Taxa de crescimento da população A: 1.5%");
		
		while (pop_a < pop_b)
		{
			pop_a = pop_a * 1.03;
			pop_b = pop_b * 1.015;
			cont += 1;
		}
		
		System.out.println();
		System.out.println("Foram necessários " + cont + " anos para a população A atingir a população B, com " + (int)pop_a + " habitantes");
		
		input.close();

	}

}
