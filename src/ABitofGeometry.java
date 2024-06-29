import java.util.Scanner;

public class ABitofGeometry {
    public static void main(String[] args) {
        //Considerando a figura abaixo, escreva um programa para cada forma que calcule e exiba em tela cada uma de suas respectivas áreas. O usuário irá informar os valores de cada variável. Crie um arquivo para cada fórmula e poste os  arquivos no GitHub. Link do repositório abaixo.

        //Figuras Planas

        Scanner scanner = new Scanner(System.in);

        //Retângulo

        System.out.println("Digite a altura do Retângulo: ");
        double alturaRetangulo = scanner.nextDouble();

        System.out.println("Digite a base do Retângulo: ");
        double baseRetangulo = scanner.nextDouble();

        double areaRetangulo = baseRetangulo * alturaRetangulo;

        System.out.println("Digite área do retângulo é " + areaRetangulo);

        //Quadrado

        System.out.println("Digite o Lado do quadrado: ");
        double ladoQuadrado = scanner.nextDouble();

        double areaQuadrado = ladoQuadrado * ladoQuadrado;

        System.out.println("A área do quadrado é " + areaQuadrado);

        //Losango

        System.out.println("Digite a diagonal maior do Losango: ");
        double diagMaior = scanner.nextDouble();

        System.out.println("Digite a diagonal menor do Losango: ");
        double diagMenor = scanner.nextDouble();

        double areaLosango = (diagMaior * diagMenor)/ 2;

        System.out.println("A área do Losango é " + areaLosango);

        //Trapézio

        System.out.println("Digite a base maior do trapézio: ");
        double trapMaior = scanner.nextDouble();

        System.out.println("Digite a base menor do trapézio: ");
        double trapMenor = scanner.nextDouble();

        System.out.println("Digite a altura do trapézio: ");
        double altTrapezio = scanner.nextDouble();

        double areaTrapezio = ((trapMaior * trapMenor) * altTrapezio )/2;

        System.out.println("A área do Trapézio é " + areaTrapezio);

        //Paralelogramo

        System.out.println("Digite a base do paralelogramo: ");
        double baseParal = scanner.nextDouble();

        System.out.println("Digite a altura do paralelogramo: ");
        double altParal = scanner.nextDouble();

        double areaParalelogramo = baseParal * altParal;

        System.out.println("A área do paralelogramo é " + areaParalelogramo);

        //Triângulo

        System.out.println("Digite a base do triângulo: ");
        double baseTrian = scanner.nextDouble();

        System.out.println("Digite a altura do triângulo: ");
        double altTrian = scanner.nextDouble();

        double areaTriangulo = (baseTrian * altTrian)/ 2;

        System.out.println("A área do triâgulo é " + areaTriangulo);

        //Círculo

        System.out.println("Digite o raio do cìrculo: ");
        double circuloRaio = scanner.nextDouble();

        double areaCirculo = (circuloRaio * circuloRaio) * 3.14;

        System.out.println("A área do círculo é " + areaCirculo);


    }
}
