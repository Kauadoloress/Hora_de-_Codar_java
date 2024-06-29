public class excer10_9_8_7_6_5_4_3_2_1 {
        public static void main(String[] args) {
            int contagem = 10;

            while (contagem >= 1) {
                System.out.println(contagem);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                    System.err.println("A contagem foi interrompida inesperadamente!");
                }

                contagem--;
            }


            System.out.println("A contagem regressiva terminou!");
        }
}
