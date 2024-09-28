import java.util.Scanner;

public class Ex003 {

	public static void main(String[] args) {
		// Registration validation
		
		Scanner input = new Scanner(System.in);
		
		String name = " ";
		String gender = " ";
		String marital = " ";
		
		int age = 0;
		double salary = 0;
	
		do 
		{
			System.out.print("Nome: ");
			name = input.nextLine();
			
			if (name.length() <= 3)
			{
				System.out.println();
				System.out.println("ERRO! O nome precisa ter mais de 3 caracteres!");
			}
			
		} while (name.length() <= 3);
		
		do 
		{
			System.out.print("Idade: ");
			age = input.nextInt();
			
			if (age < 0 || age > 150)
			{
				System.out.println();
				System.out.println("ERRO! Idade inválida!");
			}
			
		} while (age < 0 || age > 150);
		
		do 
		{
			System.out.print("Salário: ");
			salary = input.nextDouble();
			
			if (salary <= 0 || salary > 10000000)
			{
				System.out.println();
				System.out.println("ERRO! Salário inválido!");
			}
			
		} while (salary <= 0 || salary > 10000000);
		
		input.nextLine();
		
		do 
		{
			System.out.print("Gênero [M] [F] [O - outro] : ");
			gender = input.nextLine().toUpperCase();
			
			if (!gender.equals("M")  && !gender.equals("F") && !gender.equals("O"))
			{
				System.out.println();
				System.out.println("ERRO! Gênero inválido! Escolha 'M' ou 'F'.");
			}
			
		} while (!gender.equals("M")  && !gender.equals("F") && !gender.equals("O"));
		
		do 
		{
			System.out.print("Estado civil [S] [C] [V] [D]: ");
			marital = input.nextLine().toUpperCase();
			
			if (!marital.equals("S") &&  !marital.equals("C") && !marital.equals("V") && !marital.equals("D"))
			{
				System.out.println();
				System.out.println("ERRO! Estado civil inválido! Escolha 'S', 'C', 'V' ou 'D'.");
			}
			
		} while (!marital.equals("S") &&  !marital.equals("C") && !marital.equals("V") && !marital.equals("D"));
		
		
		System.out.println("");
		System.out.println("=======================");
		
		System.out.println("Nome: " + name);
		System.out.println("Idade: " + age);
		System.out.println("Salário: R$" + salary);
		
		if (gender.equals("M"))
		{
			System.out.println("Gênero: Masculino");
		}
		else if (gender.equals("F"))
		{
			System.out.println("Gênero: Feminino");
		}
		else
		{
			System.out.println("Gênero: Outro");
		}
			
		if (marital.equals("S"))
		{
			System.out.println("Estado civil: Solteiro");
		}
		else if (marital.equals("C"))
		{
			System.out.println("Estado civil: Casado");
		}
		else if (marital.equals("V"))
		{
			System.out.println("Estado civil: Viúvo");
		}
		else
		{
			System.out.println("Estado civil: Divorciado");
		}
		
		System.out.println("=======================");
		
		input.close();

	}

}
