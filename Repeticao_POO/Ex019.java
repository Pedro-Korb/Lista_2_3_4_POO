import java.util.Scanner;

public class Ex019 {
    public static void main(String[] args) {
    	// List of prime numbers
    	
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        
        int n1 = input.nextInt();
        
        int tot = 0;

        System.out.println("Números primos entre 1 e " + n1 + ":");
        System.out.println();
        
        for (int a = 2; a <= n1; a++) {
            int div = 0;
            
            for (int i = 2; i < a; i++) {
                tot++;
                if (a % i == 0) {
                    div++;
                    break;
                }
            }
            
            if (div == 0) {
                System.out.print(a + " ");
            }
        }
        System.out.println("\n");
        System.out.println("Número total de divisões realizadas: " + tot);
        
        input.close();
    }
}
