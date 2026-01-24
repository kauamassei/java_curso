package Modulo1.Desafios;

public class DesafioUm {
    public static void main(String[] args) {

        //Ninja 1
        String nameNinja1 = "Tsunade";
        int idadeNinja1 = 48;
        String missaoNinja1 = "Liderar Aldeia";
        String statusMissao1 = "Concluída";
        char nivelDaMissao1 = 'S';

        if (idadeNinja1 < 15) {
            if(nivelDaMissao1 == 'C'|| nivelDaMissao1 == 'D' ) {
                statusMissao1 = "Concluída";
            } else {
                statusMissao1 = "Não concluída";
                System.out.println(statusMissao1);
            }
        } else {
            System.out.println("Ninja: " + nameNinja1 + " - Missão: " + missaoNinja1 + " - Status: " + statusMissao1 + " - Rank: " + nivelDaMissao1);
        }

        //Ninja 2
        String nameNinja2 = "Konan";
        int idadeNinja2 = 28;
        String missaoNinja2 = "Proteger Nagato";
        String statusMissao2 = "Concluída";
        char nivelDaMissao2 = 'A';

        if (idadeNinja2 < 15) {
            if(nivelDaMissao2 == 'C'|| nivelDaMissao2 == 'D' ) {
                statusMissao2 = "Concluída";
            } else {
                statusMissao2 = "Não concluída";
                System.out.println(statusMissao2);
            }
        } else {
            System.out.println("Ninja: " + nameNinja2 + " - Missão: " + missaoNinja2 + " - Status: " + statusMissao2 + " - Rank: " + nivelDaMissao2);
        }


        //Ninja 2
        String nameNinja3 = "Hinata";
        int idadeNinja3 = 18;
        String missaoNinja3 = "Treinar Byakugan";
        String statusMissao3 = "Em andamento";
        char nivelDaMissao3 = 'B';

        if (idadeNinja3 < 15) {
            if(nivelDaMissao3 == 'C'|| nivelDaMissao3 == 'D' ) {
                statusMissao3 = "Concluída";
            } else {
                statusMissao3 = "Não concluída";
                System.out.println(statusMissao3);
            }
        } else {
            System.out.println("Ninja: " + nameNinja3 + " - Missão: " + missaoNinja3 + " - Status: " + statusMissao3 + " - Rank: " + nivelDaMissao3);
        }



    }
}
