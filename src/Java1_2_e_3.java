import java.util.Scanner;

public class Java1_2_e_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numberR = scanner.nextInt();

        if (numberR > 0){
            System.out.println("O número informado é positivo.");
        }else if (numberR < 0){
            System.out.println("O número informado é negativo.");
        }else{
            System.out.println("O número informado é neutro.");
        }
    }
}
