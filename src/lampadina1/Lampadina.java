/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lampadina1;

/**
 *
 * @author danilo.telch
 */
public class Lampadina {

    private String marca;
    private String colore;
    private int maxAcc;
    private int nAcc;
    private boolean stato;

    public Lampadina(String marca, String colore, int maxAcc, int nAcc) {
        this.colore = colore;
        this.maxAcc = maxAcc;
        this.nAcc = nAcc;
        this.marca = marca;
        this.stato = false;
    }
   

    public String getColore() {
        return colore;
    }

    public void setColore(String c) {
        colore = c;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String m) {
        marca = m;
    }

    public int getMaxAcc() {
        return maxAcc;
    }

    public int getNAcc() {
        return nAcc;
    }

    public String accendi() {
        String s = "";
        if (stato == true) {
            s = "Lampadina già accesa.";
        } else {
            if (nAcc >= maxAcc) {
                s = "La lampadina non può essere accesa perché ha raggiunto il numero massimo di accensioni.";
            } else {
                nAcc++;
                stato=true;
                if (nAcc > maxAcc-11) {
                   s = "Puoi accendere la lampadina per " + (maxAcc-nAcc) + " volte."; 
                }
            }
        }
        return s;
    }

    public void spegni() {
        if (stato == true) {
            stato = false;
        }
    }

    public String stampa() {
        String s;
        s = "marca: " + marca + " colore: " + colore + " maxAcc: " + maxAcc
                + " nAcc: " + nAcc + "stato: " + stato;
        return s;
    }

}
