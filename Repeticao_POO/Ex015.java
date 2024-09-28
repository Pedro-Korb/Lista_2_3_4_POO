public class Ex015 {

	public static void main(String[] args) {
		// Calculation with series of values
		
		final int N1 = 37;
		
		int cont = 1;
		int sum = 0;
		
		for (int i = N1; i >= 1; i--)
		{
			if (i > 1)
			{
				System.out.print(i + "*" + (i+1) + "/" + cont + " + ");
			}
			else
			{
				System.out.print(i + "*" + (i+1) + "/" + cont);
			}
			sum += (i * (i + 1) / cont);
			cont++;
		}

		System.out.println("\n");
		System.out.println("Soma = " + sum);
	}
}