import java.util.Scanner;

public class InvertendoTudo {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            Object[] array = new Object[12];

            System.out.println("Digite 12 números ou caracteres:");
            for (int i = 0; i < 12; i++) {
                array[i] = input.next();
            }

            System.out.print("Saída 1 (inversão simples): ");
            inverterArray(array);
            imprimirArray(array);

            System.out.print("Saída 2 (separação por tipo): ");
            separarPorTipo(array);
            imprimirArray(array);

            input.close();
        }

        private static void inverterArray(Object[] array) {
            int inicio = 0;
            int fim = array.length - 1;

            while (inicio < fim) {

                Object temp = array[inicio];
                array[inicio] = array[fim];
                array[fim] = temp;
                inicio++;
                fim--;
            }
        }


        private static void separarPorTipo(Object[] array) {
            int inicio = 0;
            int fim = array.length - 1;


            while (inicio < fim) {

                while (inicio < fim && !(array[inicio] instanceof Integer)) {
                    inicio++;
                }

                while (inicio < fim && !(array[fim] instanceof String)) {
                    fim--;
                }

                if (inicio < fim) {
                    Object temp = array[inicio];
                    array[inicio] = array[fim];
                    array[fim] = temp;
                    inicio++;
                    fim--;
                }
            }
        }

        // Função para imprimir os elementos do array separados por vírgula
        private static void imprimirArray(Object[] array) {
            for (int i = 0; i < array.length; i++) {
                if (i > 0) {
                    System.out.print(", ");
                }
                System.out.print(array[i]);
            }
            System.out.println();
        }
}

