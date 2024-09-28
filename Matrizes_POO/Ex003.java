import java.util.Scanner;

public class Ex003 {

    public static void main(String[] args) {
        // Student Evaluation Program
    	
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o número de alunos: ");
        int n = input.nextInt();
        input.nextLine();

        String[] names = new String[n];
        double[][] grades = new double[n][2];
        double[] averages = new double[n];
        
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            names[i] = input.nextLine();

            System.out.print("Digite a nota da primeira prova: ");
            grades[i][0] = input.nextDouble();

            System.out.print("Digite a nota da segunda prova: ");
            grades[i][1] = input.nextDouble();
            input.nextLine();
            System.out.println();

            averages[i] = (grades[i][0] + grades[i][1]) / 2;
        }

        double totalAverage = 0;
        double maxGrade = Double.MIN_VALUE;
        double minGrade = Double.MAX_VALUE;
        double maxAverage = Double.MIN_VALUE;
        double minAverage = Double.MAX_VALUE;
        String maxGradeName = "";
        String minGradeName = "";
        String maxAverageName = "";
        String minAverageName = "";

        for (int i = 0; i < n; i++) {
            totalAverage += averages[i];

            for (double grade : grades[i]) {
                if (grade > maxGrade) {
                    maxGrade = grade;
                    maxGradeName = names[i];
                }
                if (grade < minGrade) {
                    minGrade = grade;
                    minGradeName = names[i];
                }
            }

            if (averages[i] > maxAverage) {
                maxAverage = averages[i];
                maxAverageName = names[i];
            }
            if (averages[i] < minAverage) {
                minAverage = averages[i];
                minAverageName = names[i];
            }
        }

        totalAverage /= n;
        
        System.out.println("\nResultados:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Nome: %s, Nota 1: %.2f, Nota 2: %.2f, Média: %.2f%n", names[i], grades[i][0], grades[i][1], averages[i]);
        }

        System.out.printf("Maior nota: %.2f (Aluno: %s)%n", maxGrade, maxGradeName);
        System.out.printf("Menor nota: %.2f (Aluno: %s)%n", minGrade, minGradeName);
        System.out.printf("Maior média: %.2f (Aluno: %s)%n", maxAverage, maxAverageName);
        System.out.printf("Menor média: %.2f (Aluno: %s)%n", minAverage, minAverageName);
        System.out.printf("Média geral da turma: %.2f%n", totalAverage);
        
        System.out.println();
        System.out.println("Alunos acima da média geral:");
        for (int i = 0; i < n; i++) {
            if (averages[i] > totalAverage) {
                System.out.println(names[i]);
            }
        }
        
        System.out.println();
        System.out.println("Alunos abaixo da média geral:");
        for (int i = 0; i < n; i++) {
            if (averages[i] < totalAverage) {
                System.out.println(names[i]);
            }
        }

        input.close();
    }
}
