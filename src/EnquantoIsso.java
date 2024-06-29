import java.util.Scanner;

public class EnquantoIsso {

        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.print("Escolha o primeiro valor: ");
            int number1 = entrada.nextInt();

            int number2;
            do {
                System.out.print("Escolha o segundo valor (positivo e diferente de zero): ");
                number2 = entrada.nextInt();
                if (number2 <= 0) {
                    System.out.println("O valor deve ser positivo e diferente de zero. Tente novamente.");
                }
            } while (number2 <= 0);

            int resultado = number1 / number2;
            System.out.println("Resultado = " + resultado);

            entrada.close();
        }
}

