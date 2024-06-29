import java.text.DecimalFormat;
import java.util.Scanner;

public class CustaQuanto {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            DecimalFormat df = new DecimalFormat("#,##0.00");

            System.out.print("Qual o valor de fábrica do carro? R$ ");
            double valorCarro = input.nextDouble();

            while (valorCarro <= 0) {
                System.out.print("Valor inválido. Por favor, digite um valor positivo para o carro: R$ ");
                valorCarro = input.nextDouble();
            }

            double custoDistribuidor = valorCarro * 0.28;

            double impostos = valorCarro * 0.45;

            double valorFinal = valorCarro + custoDistribuidor + impostos;

            System.out.println("\n--- Detalhamento dos custos ---");
            System.out.println("Valor de fábrica: R$ " + df.format(valorCarro));
            System.out.println("Custo do distribuidor (28%): R$ " + df.format(custoDistribuidor));
            System.out.println("Impostos (45%): R$ " + df.format(impostos));
            System.out.println("Valor total do carro: R$ " + df.format(valorFinal));

            input.close();
        }
    }

