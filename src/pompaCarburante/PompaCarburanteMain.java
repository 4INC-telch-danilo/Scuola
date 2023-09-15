/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pompaCarburante;

/**
 *
 * @author danilo.telch
 */
public class PompaCarburanteMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       PompaCarburante p1 = new PompaCarburante("Distributore Diesel", 1.89, 100, 25);
        
        System.out.println(p1.stampa() + "\n");
        System.out.println("riempireCis(): " + p1.riempireCis());
        System.out.println("carbRim(): " + p1.carbRim());
        System.out.println("valoreRim(): " + p1.valoreRim());
        System.out.println("importoPieno(10): " + p1.importoPieno());
        
        String[] nome = {"IP", "Eni", "Q8"};
        double[] prezzo = {1.50, 1.48, 1.97};
        int[] capacita = {100, 120, 90};
        int[] venduto = {15, 20, 5};
        
        PompaCarburante[] p = new PompaCarburante[nome.length];
        p[0] = new PompaCarburante(nome[0], prezzo[0], capacita[0], venduto[0]);
        double prezzoMin = p[0].importoPieno();
        String ris = "Il prezzo minore è di " + prezzoMin + " della pompa numero 1";
        for(int i = 1; i < p.length; i++){
            p[i] = new PompaCarburante(nome[i], prezzo[i], capacita[i], venduto[i]);
            if(prezzoMin > p[i].importoPieno()){
                prezzoMin = p[i].importoPieno();
                ris = "Il prezzo minore è di " + prezzoMin + " della pompa numero " + i;

            }
        }
    }
        
    
}
