import java.util.Scanner;

public class CansardeDigitar {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            float soma = 0;
            int i = 1;

            while (i <= 10) {
                System.out.print("Digite o valor " + i + ": ");
                soma += scanner.nextFloat();
                i++;
            }


            float media = soma / 10;


            System.out.println("A média dos valores inseridos é: " + media);

            scanner.close();
        }
    }


