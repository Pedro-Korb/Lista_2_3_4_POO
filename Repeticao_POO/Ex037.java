import java.util.Scanner;

public class Ex037 {

	public static void main(String[] args) {
		// Grade checker

		Scanner input = new Scanner(System.in);

		int ans = 1;
		int ans2 = 1;
		int sum_grade = 0;
		int count = 0;
		int lower_grade = 0;
		int greater_grade = 0;

		double sum = 0;

		String resp_teacher = " ";

		String pass = "ABC123DEF";
		String att = " ";
		String ans_st = " ";

		String vect_ans[] = new String[10];

		vect_ans[0] = "A";
		vect_ans[1] = "A";
		vect_ans[2] = "B";
		vect_ans[3] = "B";
		vect_ans[4] = "C";
		vect_ans[5] = "C";
		vect_ans[6] = "D";
		vect_ans[7] = "D";
		vect_ans[8] = "E";
		vect_ans[9] = "E";

		while (ans != 0)
		{
			if (count == 0)
			{
				do
				{
					System.out.print("Você é professor? [1] Sim [0] Não ");
					ans2 = input.nextInt();

					if (ans2 < 0 || ans2 > 1)
					{
						System.err.println("ERRO! Digite uma resposta válida");
						System.out.println();
					}
				} while (ans2 < 0 || ans2 > 1);

				if (ans2 == 1)
				{
					input.nextLine();
					System.out.print("DIGITE SUA SENHA: ");
					att = input.nextLine();
				}

				if (att.equals(pass))
				{
					System.out.println("Digite as respostas das provas (1 - 10): ");

					for (int i = 0; i < 10; i++)
					{
						do
						{
							System.out.println(i+1 + "° Resposta: ");
							resp_teacher = input.nextLine().toUpperCase();

							if (!resp_teacher.equals("A") && !resp_teacher.equals("B") && !resp_teacher.equals("C") && !resp_teacher.equals("D") && !resp_teacher.equals("E"))
							{
								System.err.println("ERRO! Digite uma resposta entre 'A' e 'E'");
							}

						} while (!resp_teacher.equals("A") && !resp_teacher.equals("B") && !resp_teacher.equals("C") && !resp_teacher.equals("D") && !resp_teacher.equals("E"));

						vect_ans[i] = resp_teacher;
					}
				}
			}

			System.out.println("\nCorreção da prova (PARA ALUNOS)");
			System.out.println("Digite a resposta que você colocou para cada questão");
			System.out.println("======================================================");


			input.nextLine();


			for (int j = 0; j < 10; j++)
			{
				do
				{
					System.out.print(j+1 + "° Questão: ");
					ans_st = input.nextLine().toUpperCase();

					if(!ans_st.equals("A") && !ans_st.equals("B") && !ans_st.equals("C") && !ans_st.equals("D") && !ans_st.equals("E"))
					{
						System.err.println("ERRO! Digite uma resposta válida!");
						System.out.println();
					}
				} while (!ans_st.equals("A") && !ans_st.equals("B") && !ans_st.equals("C") && !ans_st.equals("D") && !ans_st.equals("E"));


				if (ans_st.equals(vect_ans[j]))
				{
					sum_grade ++;
				}
			}


			if (count == 0)
			{
				lower_grade = sum_grade;
				greater_grade = sum_grade;
			}
			else
			{

				if (sum_grade > greater_grade)
				{
					greater_grade = sum_grade;
				}
				else if (sum_grade < lower_grade)
				{
					lower_grade = sum_grade;
				}
			}

			System.out.println();
			do
			{
				System.out.println("Deseja informar mais um gabarito? [1] Sim [0] Não");
				ans = input.nextInt();

				if (ans < 0 || ans > 1)
				{
					System.err.println("ERRO! Digite uma resposta válida");
					System.out.println();
				}
			} while (ans < 0 || ans > 1);

			sum += sum_grade;
			sum_grade = 0;
			count++;

		}

		System.out.println("");
		System.out.println("=================================================");
		System.out.println("Maior acerto: " + greater_grade);
		System.out.println("Menor acerto: " + lower_grade);
		System.out.println("Total de alunos que utilizaram o sistema: " + count);
		System.out.println("Média das notas: " + String.format("%.2f", (double)sum / count));
		System.out.println("=================================================");
		System.out.println();
		System.out.println("Gabarito da prova: ");
		for (int k = 0; k < 10; k++)
		{
			System.out.println((k+1)+ "° Questão: " + vect_ans[k]);
		}

		input.close();
	}

}
