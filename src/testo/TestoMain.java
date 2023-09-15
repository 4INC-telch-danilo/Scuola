/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testo;

/**
 *
 * @author danilo.telch
 */
public class TestoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String g = "Il cellulare di Elena e' 338-4189961";
        String controllo = "Om dimmamesi fo Imipe i' 449-5290072";
        Testo t = new Testo(g);

        System.out.println(t.getMessaggio());
        System.out.println(controllo.equals(t.getMessaggio()));

    }
    
}
