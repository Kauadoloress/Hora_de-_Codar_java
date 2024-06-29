import java.util.Scanner;

public class Parabens {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            float soma = 0f;
            int totalAvaliacoes = 4; // Número total de avaliações

            // Loop para coletar as notas das avaliações
            for (int i = 1; i <= totalAvaliacoes; i++) {
                System.out.print("Nota da avaliação " + i + ": ");
                soma += scanner.nextFloat();
            }

            // Calcular a média das notas
            float media = soma / totalAvaliacoes;

            // Determinar o resultado com base na média
            if (media >= 6) {
                System.out.println("Parabéns, você foi aprovado! Sua média foi: " + media);
            } else {
                System.out.println("Reprovado, sua média foi: " + media);
            }

            scanner.close();
        }
}

