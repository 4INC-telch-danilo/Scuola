/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package istat;

/**
 *
 * @author danilo.telch
 */
public class Istat2 {
    private double[] latte;
    private double[] pane;
    private String[] regioni;
    
    
    public Istat2(String[] regioni, double[] latte, double[] pane) {
        this.regioni = copiaS(regioni);
        this.pane = copiaD(pane);
        this.latte = copiaD(latte);
    }

    public String maxBeni() {
        String testo = "Nessuna regione con i prezzi più alti";
        int indice = trovaMax(pane);
        if (indice == trovaMax(latte)) {
            testo = "Regione: " + regioni[indice] + " latte: " + latte[indice] + 
                    " pane: " + pane[indice];
        }
        return testo;
    }
    
    public String costoMaxPane() {
        int indice = trovaMax(pane);
        return "Regione: " + regioni[indice] + " costo pane: " + pane[indice];
    }
    
    public String costoMaxLatte() {
        int indice = trovaMax(latte);
        return "Regione: " + regioni[indice] + " costo pane: " + latte[indice];
    }
    
    
    private String[] copiaS(String[] arrayDaCopiare) {
        String[] temp = new String[arrayDaCopiare.length];
        for(int i = 0; i < arrayDaCopiare.length; i++) {
            temp[i] = arrayDaCopiare[i];
        }
        return temp;
    }
    
    private double[] copiaD(double[] arrayDaCopiare) {
        double[] temp = new double[arrayDaCopiare.length];
        for(int i = 0; i < arrayDaCopiare.length; i++) {
            temp[i] = arrayDaCopiare[i];
        }
        return temp;
    }
    
    private int trovaMax(double[] array) {
        double costoMax = array[0];
        int indice = 0;
        for (int i = 1; i < array.length; i++) {
            if (costoMax < array[i]) {
                costoMax = array[i];
                indice = i;
            }
        }
        return indice;
    }
}
