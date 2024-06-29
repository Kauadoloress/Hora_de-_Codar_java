public class BOOOOMMM {
    public static void main(String[] args) {
        int contagem = 30;

        while (contagem >= 0) {
            System.out.println(contagem);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println("Interrupção inesperada!");
            }

            contagem--;
        }
        System.out.println("BOOOOMMMMM!!!! EXPLOSÃO!!!!!!");
    }
}



