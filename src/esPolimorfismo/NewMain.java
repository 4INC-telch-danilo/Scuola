/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package esPolimorfismo;

/**
 *
 * @author danilo.telch
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Padre p = new Padre();
        Figlio f = new Figlio();
        Padre pf = new Figlio();
        Padre pp = pf;
        System.out.println("p " + p);
        System.out.println("f " +f);
        System.out.println("pf " +pf);
        
        p.incrementa();
        System.out.println("p "+ p);
        System.out.println("pp " + pp);
        
        pp.incrementa();
        System.out.println("p "+ p);
        System.out.println("pp " + pp);
        
        f.incrementa();
        System.out.println("f "+ f);
        
        pf.incrementa();
        System.out.println("f "+ f);
        
        Figlio ff = (Figlio) pp;
        System.out.println("ff "+ ff);
        
        ff = (Figlio) pf;
        System.out.println("ff "+ ff);
    }
    
}
