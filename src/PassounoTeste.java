import java.util.Scanner;

public class PassounoTeste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userResponse;
        int aprovados = 0;
        int reprovados = 0;

        do {
            float soma = 0f;
            int totalNotas = 6;

            for (int i = 1; i <= totalNotas; i++) {
                float nota = 0;
                boolean notaValida = false;

                while (!notaValida) {
                    System.out.print("Digite a nota " + i + " do aluno (0-10): ");
                    nota = input.nextFloat();

                    if (nota >= 0 && nota <= 10) {
                        notaValida = true;
                    } else {
                        System.out.println("Nota inválida. Insira uma nota entre 0 e 10.");
                    }
                }

                soma += nota;
            }

            float media = soma / totalNotas;

            if (media >= 6.5) {
                System.out.println("Nota final: " + media + ". Aprovado!");
                aprovados++;
            } else {
                System.out.println("Nota final: " + media + ". Reprovado!");
                reprovados++;
            }

            System.out.print("Quer calcular a nota do próximo aluno? (sim/não): ");
            userResponse = input.next();

        } while (userResponse.equalsIgnoreCase("sim"));

        System.out.println("Alunos aprovados: " + aprovados);
        System.out.println("Alunos reprovados: " + reprovados);

        input.close();
    }
}