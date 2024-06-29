import java.text.DecimalFormat;
import java.util.Scanner;

public class Apagar {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            DecimalFormat df = new DecimalFormat("#,##0.00");

            System.out.print("Quantidade de carros vendidos: ");
            int carrosVendidos = input.nextInt();

            System.out.print("Valor total das vendas: R$ ");
            double totalVendas = input.nextDouble();

            System.out.print("Salário fixo do vendedor: R$ ");
            double salVendedor = input.nextDouble();

            System.out.print("Comissão fixa por carro: R$ ");
            double comPorCarro = input.nextDouble();

            double valorComissaoVendas = totalVendas * 0.05;
            double comissaoPorCarro = comPorCarro * carrosVendidos;
            double salarioTotal = salVendedor + valorComissaoVendas + comissaoPorCarro;

            System.out.println("\nDetalhes do Salário do Vendedor:");
            System.out.println("Quantidade de carros vendidos: " + carrosVendidos);
            System.out.println("Valor total das vendas: R$ " + df.format(totalVendas));
            System.out.println("Salário do vendedor: R$ " + df.format(salarioTotal));
            System.out.println("- Salário fixo: R$ " + df.format(salVendedor));
            System.out.println("- Comissão sobre vendas (5%): R$ " + df.format(valorComissaoVendas));
            System.out.println("- Comissão por carro vendido: R$ " + df.format(comissaoPorCarro));

            input.close();
        }
    }


