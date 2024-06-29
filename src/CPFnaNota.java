import java.util.Scanner;

public class CPFnaNota {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Nome do produto: ");
            String nomeProduto = input.next();

            System.out.print("Quantidade do produto: ");
            int quantidade = input.nextInt();

            System.out.print("Preço unitário: R$ ");
            float precoUnitario = input.nextFloat();

            float valorVenda = precoUnitario * quantidade;

            float valorComImposto = valorVenda * 1.2f;

            float desconto = 0f;
            if (quantidade <= 5) {
                desconto = valorComImposto - (valorComImposto * 0.02f);
                System.out.println("Desconto de 2%");
            } else if (quantidade > 5 && quantidade <= 10) {
                desconto = valorComImposto - (valorComImposto * 0.03f);
                System.out.println("Desconto de 3%");
            } else if (quantidade > 10) {
                desconto = valorComImposto - (valorComImposto * 0.05f);
                System.out.println("Desconto de 5%");
            } else {
                System.out.println("Erro ao calcular desconto.");
            }

            System.out.println("\nDetalhes da venda:");
            System.out.println("Produto: " + nomeProduto);
            System.out.println("Quantidade: " + quantidade);
            System.out.println("Preço unitário: R$ " + precoUnitario);
            System.out.println("Valor total sem imposto: R$ " + valorVenda);
            System.out.println("Imposto (20%): R$ " + (valorComImposto - valorVenda));
            System.out.println("Total a pagar com desconto: R$ " + desconto);


            input.close();
        }
}



