/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package morracinese;

import java.util.Random;

enum Mossa {
    FORBICI,
    CARTA,
    SASSO
}

public class MorraCinese {

    private String g1;
    private String g2;

    Random r1 = new Random();

    public MorraCinese(String g1, String g2) {
        this.g1 = g1;
        this.g2 = g2;
    }

    public void setG1(String g1) {
        this.g1 = g1;
    }

    public void setG2(String g2) {
        this.g2 = g2;
    }

    public String getG1() {
        return g1;
    }

    public String getG2() {
        return g2;
    }

    public String gioca(int sceltag2) {
        String testo = "";

        int sceltag1 = r1.nextInt(3) + 1;

        if (sceltag2 < 1 || sceltag2 > 3) {
            testo = "Giocata non prevista";
        }
        else {
            if (sceltag1 == sceltag2) {
                testo = "Pareggio, hanno giocato entrambi " + decodGiocata(sceltag1);
            } else {
                if (sceltag1 == 2 && sceltag2 == 1
                        || sceltag1 == 1 && sceltag2 == 3
                        || sceltag1 == 3 && sceltag2 == 2) {
                    testo = g1 + " vince, ha giocato " + decodGiocata(sceltag1) + " contro " + decodGiocata(sceltag2);
                } else {
                    if (sceltag1 == 1 && sceltag2 == 2
                            || sceltag1 == 2 && sceltag2 == 3
                            || sceltag1 == 3 && sceltag2 == 1) {
                        testo = g2 + " vince, ha giocato " + decodGiocata(sceltag2) + " contro " + decodGiocata(sceltag1);
                    }
                }
            }
        }

        return testo;
    }

    private String decodGiocata(int mano) {

        String testo = "";

        
        switch (mano) {
            case 1:
                testo = "Forbici";
                break;
            case 2:
                testo = "Sasso";
                break;
            case 3:
                testo = "Carta";
                break;
            default:
                testo = "Giocata non prevista";

        }
        return testo;
    }

    public String stampa() {
        return "Nome computer: " + g1 + "\nNome utente: " + g2;
    }

}
