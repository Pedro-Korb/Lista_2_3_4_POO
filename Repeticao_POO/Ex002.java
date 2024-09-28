import java.util.Scanner;

public class Ex002 {

	public static void main(String[] args) {
		// Password checker
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Usuário: ");
		String user = input.nextLine();
		
		System.out.println();
		
		System.out.println("Senha: ");
		String pass = input.nextLine();
		
		System.out.println();
		
		while (pass.equals(user))
		{
			System.out.println("Sua senha deve ser diferente do seu usuário!");
			System.out.println("Senha: ");
			pass = input.nextLine();
			
			System.out.println();
		}
		
		System.out.println("OK");
		input.close();
	}

}