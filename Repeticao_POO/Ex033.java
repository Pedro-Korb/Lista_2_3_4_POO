import java.util.Scanner;

public class Ex033 {

	public static void main(String[] args) {
		// Interest table

		Scanner input = new Scanner(System.in);
		double fees3 = 0;
		double fees6 = 0;
		double fees9 = 0;
		double fees12 = 0;
		
		System.out.print("Valor da dívida: R$ ");
		double debt = input.nextInt();
		
		fees3 = debt * 1.1;
		fees6 = debt * 1.15;
		fees9 = debt * 1.2;
		fees12 = debt * 1.25;
		
		System.out.println();
		System.out.println("==================================================================================================");
		System.out.println("Valor da dívida\t\tValor dos juros\t\tQuantidade de parcelas\t\tValor da parcela");
		System.out.println("==================================================================================================");
		System.out.println("R$ " + debt + "\t\t0\t\t\t1\t\t\t\tR$ " + debt);
		System.out.println("R$ " + String.format("%.2f", fees3) + "\t\t" + String.format("%.2f", (fees3-debt)) + "\t\t\t3\t\t\t\tR$ " + String.format("%.2f", (fees3 / 3)));
		System.out.println("R$ " + String.format("%.2f", fees6) + "\t\t" + String.format("%.2f", (fees6-debt)) + "\t\t\t6\t\t\t\tR$ " + String.format("%.2f", (fees6 / 6)));
		System.out.println("R$ " + String.format("%.2f", fees9) + "\t\t" + String.format("%.2f", (fees9-debt)) + "\t\t\t9\t\t\t\tR$ " + String.format("%.2f", (fees9 / 9)));
		System.out.println("R$ " + String.format("%.2f", fees12) + "\t\t" + String.format("%.2f", (fees12-debt)) + "\t\t\t12\t\t\t\tR$ " + String.format("%.2f", (fees12 / 12)));
		System.out.println("==================================================================================================");
		input.close();
	}

}
