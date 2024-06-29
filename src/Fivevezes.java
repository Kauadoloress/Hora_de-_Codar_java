import java.util.Scanner;

public class Fivevezes {
     public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.print("Primeiro valor: ");
            int number1 = entrada.nextInt();

            System.out.print("Segundo valor: ");
            int number2 = entrada.nextInt();

            System.out.print("Terceiro valor: ");
            int number3 = entrada.nextInt();

            System.out.print("Quarto valor: ");
            int number4 = entrada.nextInt();

            System.out.print("Quinto valor: ");
            int number5= entrada.nextInt();

            int maior = Math.max(number5, Math.max(number4, Math.max(number3, Math.max(number1, number2))));

            int smaior;
            if (maior == number1){
                smaior = Math.max(number5, Math.max(number4, Math.max(number2, number3)));
            }else if (maior == number2){
                smaior = Math.max(number5, Math.max(number4, Math.max(number1, number3)));
            }else if (maior == number3){
                smaior = Math.max(number5, Math.max(number4, Math.max(number1, number2)));
            }else if (maior == number5){
                smaior = Math.max(number2, Math.max(number3, Math.max(number1, number5)));
            }else{
                smaior = Math.max(number4, Math.max(number3, Math.max(number1, number2)));
            }

            int result = maior + smaior;
            System.out.print("A soma dos dois maiores: " + result);
            entrada.close();
        }
}

