public class UmaBrincadeiraSobreAlturas {
        public static void main(String[] args) {

            int alturaAnacleto = 150;
            int alturaFelisberto = 110;

            int crescimentoAnualAnacleto = 2;
            int crescimentoAnualFelisberto = 3;

            int anos = 0;


            while (alturaFelisberto <= alturaAnacleto) {
                alturaAnacleto += crescimentoAnualAnacleto;
                alturaFelisberto += crescimentoAnualFelisberto;
                anos++;
            }

            System.out.println("Levará " + anos + " anos para Felisberto ficar maior que Anacleto.");
            System.out.println("Altura final de Felisberto: " + alturaFelisberto + " cm");
            System.out.println("Altura final de Anacleto: " + alturaAnacleto + " cm");
        }
}


