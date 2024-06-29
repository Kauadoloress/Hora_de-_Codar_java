
import java.util.Scanner;
public class QualoMaior4vezespior {


        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.print("Insira o primeiro valor: ");
            int v1 = entrada.nextInt();

            System.out.print("Insira o segundo valor: ");
            int v2 = entrada.nextInt();

            System.out.print("Insira o terceiro valor: ");
            int v3 = entrada.nextInt();

            System.out.print("Insira o quarto valor: ");
            int v4 = entrada.nextInt();

            int maior = v1;


            if (v2 > maior) {
                maior = v2;
            }
            if (v3 > maior) {
                maior = v3;
            }
            if (v4 > maior) {
                maior = v4;
            }

            System.out.println("O maior valor é: " + maior);

            entrada.close();
        }
}

