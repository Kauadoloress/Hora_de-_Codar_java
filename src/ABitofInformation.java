import java.util.Scanner;

public class ABitofInformation {

    public static void main(String[] args) {
        //Escreva um programa em Java em que o usuário informe o seu nome e em seguida o programa perguntará a idade do usuário. Agora o programa deve exibir a mensagem "Olá, [NomeDoUsuario], sua idade é [idade]".

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nomeUser = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idadeUser = scanner.nextInt();

        System.out.println("Olá, " + nomeUser + ", sua idade é " + idadeUser + " anos ");
    }
}
