public class ContaComigo {
        public static void main(String[] args) {
            int totalLinhas = 20;
            int numerosPorLinha = 10;

            int linhaAtual = 1;


            while (linhaAtual <= totalLinhas) {
                System.out.print("(" + linhaAtual + ", ");


                int inicio = (linhaAtual - 1) * numerosPorLinha + 1;

                int fim = inicio + numerosPorLinha - 1;

                linhaAtual++;

                int numeroAtual = inicio;

                while (numeroAtual <= fim) {
                    System.out.print(numeroAtual);
                    if (numeroAtual < fim) {
                        System.out.print(", ");
                    }
                    numeroAtual++;
                }
                System.out.println(")");
            }
        }
}
