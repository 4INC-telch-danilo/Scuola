/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package data;

/**
 *
 * @author danilo.telch
 */
public class Datatest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DataCompleta d = new DataCompleta(31, 12, 2023);
        DataCompleta d1 = new DataCompleta(22, 12, 2023);
        
//        System.out.println(d.ieri());
//        System.out.println("");
//        System.out.println(d.formattaData());
//        System.out.println("");
//        System.out.println(d.domani());
//        System.out.println("");
//        System.out.println(d.isBisestile());
//        System.out.println("");
//        System.out.println(d.stampa());
          System.out.println(d.diffData(d1));
    }   
}
