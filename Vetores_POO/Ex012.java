import java.util.Scanner;

public class Ex012 {

	public static void main(String[] args) {
		// Ages and heights stats

		Scanner input = new Scanner(System.in);

		final int N = 5;

		float alt[] = new float[N];
		int age[] = new int[N];

		float fSomaAlt = 0;
		float fSomaAge = 0;
		float fMediaAlt = 0;
		float fMediaAge = 0;
		float fMN = 0;
		float fMV = 0;
		float fMA = 0;
		float fMB = 0;
		int iMN = 0;
		int iMV = 0;
		int iMA = 0;
		int iMB = 0;	

		for(int i = 0; i < N ;i++) {
			System.out.println("Infome sua idade: ");
			age[i] = input.nextInt();
			System.out.println("Informe a sua altura: ");
			alt[i] = input.nextFloat();

			fSomaAlt+=(alt[i]);
			fSomaAge+=(age[i]);

			if(i==0) 
			{
				fMN = alt[i];
				fMV = alt[i];
				fMA = alt[i];
				fMB = alt[i];
				iMN = age[i];
				iMV = age[i];
				iMA = age[i];
				iMB = age[i];
			}
			
			if(age[i] > iMV) 
			{
				iMV = age[i];
				fMV = alt[i];
			}
			
			else if(age[i] < iMN) 
			{
				iMN = age[i];
				fMN = alt[i];
			}
			else if(alt[i] > fMA) 
			{
				iMA = age[i];
				fMA = alt[i];
			}
			
			else 
			{
				iMB = age[i];
				fMB = alt[i];
			}


		}
		for (int i = (N-1); i >= 0; i--) 
		{
			System.out.println("Idade: " + age[i]);
			System.out.println("Altura: " + alt[i]);
		}



		for(int i = 0;i < N;i++) 
		{
			fMediaAlt=(fSomaAlt/N);
			fMediaAge=(fSomaAge/N);
			
			if(age[i] < fMediaAge) 
			{
				System.out.println("O aluno de altura: " + alt[i] + " e idade: " + age[i]+" está abaixo da média de idades.");
			}
			if(alt[i] < fMediaAlt) 
			{
				System.out.println("O aluno de altura: " + alt[i] + " e idade: " + age[i] + " está abaixo da média de altura.");
			}

		}
		System.out.println("Idade e altura do mais velho: " + iMV + " e " + fMV);
		System.out.println("Idade e altura do mais novo: " + iMN + " e " + fMN);
		System.out.println("Idade e altura do mais baixo: " + iMB + " e " + fMB);
		System.out.println("Idade e altura do mais alto: " + iMA + " e " + fMA);

		input.close();
	}
}
