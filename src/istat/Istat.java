/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package istat;

/**
 *
 * @author danilo.telch
 */
public class Istat {
    private Regione[] regioni;
    
    public Istat(String[] nomi, String[] prodotti,  double[][] costi) {
        regioni = new Regione[20];
        for (int i = 0; i < regioni.length; i++) {
            this.regioni[i] = new Regione(nomi[i], prodotti, costi[i]);
        }
    }
//    
//    public String costoMaxLatte() {
//        int indice = trovaMax("latte");
//        return "Regione: " + regioni[indice].getNome() + 
//               " latte:  " + regioni[indice].getLatte();
//    }
//    
//    public String costoMaxPane() {
//        int indice = trovaMax("pane");
//        return "Regione: " + regioni[indice].getNome() + 
//               " pane:  " + regioni[indice].getPane();
//    }
//    
//    public String maxBeni() {
//        String testo = "Nessuna regione con i prezzi più alti";
//        int indice = trovaMax("pane");
//        if (indice == trovaMax("latte")) {
//            testo = "Regione: " + regioni[indice].getNome() + 
//                    " latte: " + regioni[indice].getLatte() + 
//                    " pane: " + regioni[indice].getPane();
//        }
//        return testo;
//    }
//    
//    private int trovaMax(String selezione) {
//        double costoMax = regioni[0].getDaSelezione(selezione);
//        int indice = 0;
//        for (int i = 1; i < regioni.length; i++) {
//            if (regioni[indice].getDaSelezione(selezione) < 
//                    regioni[i].getDaSelezione(selezione)) {
//                indice = i;
//            }
//        }
//        return indice;       
//    }
}