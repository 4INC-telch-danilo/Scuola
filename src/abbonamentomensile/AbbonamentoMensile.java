/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abbonamentomensile;

/**
 *
 * @author danilo.telch
 */
public class AbbonamentoMensile {
    private String meseCorrente;
    
    public AbbonamentoMensile(String meseCorrente) {
        this.meseCorrente=meseCorrente;
    }
    
    public String calcolaCosto(String nominativo, int eta, String sesso) {
        double costo = 0;
        String testo = " ";
        
        
        if ("maschio".equals(sesso)  && eta > 10 && eta <=30 || "femmina".equals(sesso) && eta > 14 && eta <= 30) {
            costo = 10;
        }
        if ("maschio".equals(sesso) && eta > 30 && eta <=75 || "femmina".equals(sesso) && eta > 30 && eta <= 70) {
            costo = 18.5;
        }
        testo = "Nominativo: " + nominativo + "\n" +
                "Età: " + eta + "\n" +
                "Sesso: " + sesso + "\n" +
                meseCorrente + " Costo dell'abbonamento di " + nominativo + ": " + costo + "\n";
        return testo;
    }
    
    public void setMeseCorrente(String meseCorrente) {
        this.meseCorrente=meseCorrente;
    }
    
    public String getMeseCorrente() {
        return meseCorrente;
    }
    
    public String stampa() {
        return "Il mese corrente è: " + meseCorrente;
    }
}
