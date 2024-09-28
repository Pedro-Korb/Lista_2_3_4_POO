import java.util.Scanner;

public class Ex032 {

	public static void main(String[] args) {
		// Accident statistics

		Scanner input = new Scanner(System.in);

		double p_g_acci = 0;
		double p_l_acci = 0;
		double sum = 0;
		double sum_less_2k = 0;
		
		int count_less_2k = 0;
		
		
		String city_acci_lower = " ";
		String city_acci_greater = " ";

		
		for (int i = 1; i <= 5; i++)
		{
			System.out.print("Nome da " + i + "° cidade: ");
			String city = input.nextLine();
			
			System.out.print("Número de veículos de passeio: ");
			int number = input.nextInt();
			
			System.out.print("Número de acidentes com vítimas: ");
			int num_acci = input.nextInt();
			
			input.nextLine();
			
			double pc_acci = ((double)num_acci / number) * 100;
			
			if (i == 1)
			{
				p_g_acci = pc_acci;
				p_l_acci = pc_acci;
				city_acci_lower = city;
				city_acci_greater = city;
			}
			
			else if (pc_acci > p_g_acci)
			{
				p_g_acci = pc_acci;
				city_acci_greater = city;
			}
			
			else if (pc_acci < p_l_acci)
			{
				p_l_acci = pc_acci;
				city_acci_lower = city;
			}
			
			if (number < 2000)
			{
				sum_less_2k += pc_acci;
				count_less_2k += 1;
			}
			
			sum += number;
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Maior índice de acidentes: " + p_g_acci+ "% - " + city_acci_greater);
		System.out.println("Menor índice de acidentes: " + p_l_acci+ "% - " + city_acci_lower);
		System.out.println("Média de veículos mas cidades: " + (sum / 5));
		
		if (count_less_2k == 0)
		{
			System.out.println("Nenhuma cidade possue menos de 2000 carros de passeio!");
		}
		else
		{
			System.out.println("Média de acidentes nas cidades com menos de 2000 veículos: " + (sum_less_2k / count_less_2k) + "%");
		}
		
		input.close();
	}

}
