import java.util.Scanner;

public class JornadadeTrabalho {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int diasTrabalhadosPorSemana = 5;

            System.out.print("Horas trabalhadas no mês: ");
            int horasTrabalhadasPorMes = input.nextInt();

            int horasTrabalhadasPorSemana = horasTrabalhadasPorMes / 4;
            System.out.print("Salário por hora: ");
            int salarioPorHora = input.nextInt();

            int salarioPorSemana = salarioPorHora * horasTrabalhadasPorSemana;

            if (horasTrabalhadasPorSemana >= 40) {
                int salarioComAcrescimo = salarioPorSemana + (int) (salarioPorSemana * 0.5) * (diasTrabalhadosPorSemana * 4);
                System.out.println("Salário no final do mês será: R$" + salarioComAcrescimo);
            } else {

                int salarioPorMes = salarioPorSemana * (diasTrabalhadosPorSemana * 4);
                System.out.println("Salário no final do mês: R$" + salarioPorMes);
            }

            input.close();
        }
}
