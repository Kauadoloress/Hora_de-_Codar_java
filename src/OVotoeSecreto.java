import java.util.Scanner;

public class OVotoeSecreto {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Quantos eleitores? ");
            int eleitores = input.nextInt();

            if (eleitores <= 0) {
                System.out.println("Número de eleitores deve ser positivo.");
                return;
            }

            System.out.print("Votos brancos (percentual): ");
            double percentBrancos = input.nextDouble();

            System.out.print("Votos válidos (percentual): ");
            double percentValidos = input.nextDouble();

            System.out.print("Votos nulos (percentual): ");
            double percentNulos = input.nextDouble();

            double somaPercentuais = percentBrancos + percentValidos + percentNulos;
            if (somaPercentuais != 100) {
                System.out.println("A soma dos percentuais deve ser igual a 100%. Verifique os valores inseridos.");
                return;
            }

            int votosBrancos = (int) Math.round(eleitores * (percentBrancos / 100));
            int votosValidos = (int) Math.round(eleitores * (percentValidos / 100));
            int votosNulos = (int) Math.round(eleitores * (percentNulos / 100));

            System.out.println("Total de eleitores: " + eleitores);
            System.out.println("Quantidade de votos brancos: " + votosBrancos);
            System.out.println("Quantidade de votos válidos: " + votosValidos);
            System.out.println("Quantidade de votos nulos: " + votosNulos);

            input.close();
        }
}


