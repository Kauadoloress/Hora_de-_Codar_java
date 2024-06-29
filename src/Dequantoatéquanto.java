import java.util.Scanner;

public class Dequantoatéquanto {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Primeiro valor: ");
            int number1 = input.nextInt();

            System.out.print("Segundo valor: ");
            int number2 = input.nextInt();

            if (number1 > number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }

            int soma = 0;
            int qtdElementos = 0;

            for (int i = number1; i <= number2; i++) {
                soma += i;
                qtdElementos++;
            }

            float result = (float) soma / qtdElementos;

            System.out.println("A média dos números entre " + number1 + " e " + number2 + " é: " + result);

        }
}
