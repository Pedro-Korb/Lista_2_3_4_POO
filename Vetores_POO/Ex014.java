import java.util.Scanner;

public class Ex014 {

	public static void main(String[] args) {
		// Age and height comparison

		Scanner input = new Scanner(System.in);

		final int N = 30;

		float alt[] = new float[N];
		int age[] = new int[N];

		float fsum = 0;
		float fmed = 0;
		int k = 0;


		for(int i = 0; i < N ;i++) 
		{
			System.out.println("Infome sua idade: ");
			age[i] = input.nextInt();
			
			System.out.println("Informe a sua altura: ");
			alt[i] = input.nextFloat();

			if(age[i] > 13) 
			{
				fsum += alt[i];
			}

		}
		fmed = (fsum / N);

		for(int i = 0;i < N;i++) 
		{
			if(age[i] > 13 && alt[i] < fmed) 
			{
				k++;
			}	

		}
		System.out.println(k+" alunos maiores de 13 anos tem altura inferior a média.");

		input.close();

	}

}
