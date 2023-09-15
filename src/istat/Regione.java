/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package istat;

/**
 *
 * @author danilo.telch
 */
public class Regione {
    private String nome;
    private double[] costi;
    private String[] prodotti;


    public Regione(String nome, String[] prodotti, double[] costi) {
        this.nome = nome;
        this.prodotti = copiaS(prodotti);
        this.costi = copiaD(costi);
    }

    public String getNome() {
        return nome;
    }
    
    private int  trovaindice(String selezione) {
        int indice = 0;
        for (int i = 0; i < prodotti.length; i++){
            if (prodotti[i].equals(selezione))
                indice = i;
        }
        return indice;
    }
    
    public double getDaSelezione(String selezione) {
        return costi[trovaindice(selezione)];
    }
    
    private double[] copiaD(double[] arrayDaCopiare) {
        double[] temp = new double[arrayDaCopiare.length];
        for (int i = 0; i < arrayDaCopiare.length; i++){
            temp[i] = arrayDaCopiare[i];
        }
        return temp;
    }
    
    private String[] copiaS(String[] arrayDaCopiare) {
        String[] temp = new String[arrayDaCopiare.length];
        for (int i = 0; i < arrayDaCopiare.length; i++){
            temp[i] = arrayDaCopiare[i];
        }
        return temp;
    }
}
