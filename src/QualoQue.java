import java.util.Scanner;

public class QualoQue {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Escolha o primeiro valor: ");
            int valor1 = input.nextInt();

            System.out.print("Escolha o segundo valor: ");
            int valor2 = input.nextInt();

            System.out.print("Escolha o terceiro valor: ");
            int valor3 = input.nextInt();

            int maior = Math.max(valor1, Math.max(valor2, valor3));
            int segundoMaior = Math.min(Math.max(valor1, valor2), Math.max(valor2, valor3));

            int somaDosMaiores = maior + segundoMaior;

            System.out.println("A soma dos dois maiores valores é: " + somaDosMaiores);

            input.close();
        }
    }


