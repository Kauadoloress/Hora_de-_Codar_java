import java.util.Scanner;

public class HelloClarice {
    public static void main(String[] args) {

        //Escreva um programa em Java em que o usuário informe o seu nome e exiba a mensagem "Olá, [NomeDoUsuario]".

        Scanner sanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nomeUser = sanner.nextLine();

        System.out.println("Hello " + nomeUser);

    }
}
