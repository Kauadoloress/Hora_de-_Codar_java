import java.util.Scanner;

public class E0Que {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Digite o valor para A: ");
            int a = input.nextInt();

            System.out.print("Digite o valor para B: ");
            int b = input.nextInt();

            System.out.print("Digite o valor para C: ");
            int c = input.nextInt();

            if (a > 0 && b > 0 && c > 0 && a < b + c && b < a + c && c < a + b) {
                System.out.println("Os valores informados podem formar um triângulo.");
            } else {
                System.out.println("Os valores informados não podem formar um triângulo válido.");
            }

            input.close();
        }
}

