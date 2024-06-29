import java.util.Scanner;

public class DescansoMerecido {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Número do funcionário: ");
            int numeroFuncionario = input.nextInt();

            System.out.print("Ano de nascimento: ");
            int anoNascimento = input.nextInt();

            System.out.print("Ano de ingresso na empresa: ");
            int anoIngresso = input.nextInt();

            if (anoNascimento <= 1959 && anoIngresso <= 1994) {
                int idade = 2024 - anoNascimento;
                int tempoTrabalho = 2024 - anoIngresso;

                System.out.println("\nDetalhes do funcionário:");
                System.out.println("Número do funcionário: " + numeroFuncionario);
                System.out.println("Idade: " + idade + " anos");
                System.out.println("Tempo de trabalho na empresa: " + tempoTrabalho + " anos");

                System.out.print("\nRequerer aposentadoria? (sim/não): ");
                String escolha = input.next().toLowerCase();

                if (escolha.equals("sim")) {
                    System.out.println("Aposentadoria aprovada.");
                } else {
                    System.out.println("Aposentadoria não requerida.");
                }
            } else {
                System.out.println("\nNão tem direito a aposentadoria no momento.");
            }

            input.close();
        }
}


