import java.util.Scanner;

public class Qualomaior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numberA = scanner.nextInt();

        System.out.println("Digite um segundo número: ");
        int numberB = scanner.nextInt();

        System.out.println("Digite um terceiro número: ");
        int numberC = scanner.nextInt();

        if (numberA == numberB ){
            System.out.println("Troque o primeiro número: ");
            numberA = scanner.nextInt();

        }
        if (numberB == numberA ){
            System.out.println("Troque o segundo número: ");
            numberB = scanner.nextInt();

        }
        if (numberB == numberC || numberA == numberC){
            System.out.println("Troque o terceiro número: ");
            numberC = scanner.nextInt();
        }

        if (numberA > numberB && numberA > numberC){
                System.out.println("O número " + numberA + " é maior que os outros números informados.");

        } else if (numberB > numberA && numberB > numberC) {
                System.out.println("O número " + numberB + "  é maior que os outros números informados.");

        } else if (numberC > numberA && numberC > numberB) {
                System.out.println("O número " + numberC + "  é maior que os outros números informados.");

        }else{
            System.out.print("Os valores digitados são iguais :(");
        }


        scanner.close();


    }
}
