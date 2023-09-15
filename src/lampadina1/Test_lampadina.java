/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lampadina1;

/**
 *
 * @author danilo.telch
 */
public class Test_lampadina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lampadina l1 = new Lampadina("Phillips", "rosso", 24, 2);
        Lampadina l2 = new Lampadina("Phillips", "giallo", 23, 3);
        Lampadina l3 = new Lampadina("Phillips", "verde", 22, 12);
        
        int nAcc1 = l1.getNAcc();
        int nAcc2 = l2.getNAcc();
        int nAcc3 = l3.getNAcc();
        
        
        
        if (nAcc1 > nAcc2 && nAcc1 > nAcc3) {
            System.out.println(l1.accendi() + "  Lampadina 1");
        } 
        else {

// not(nAcc1 > nAcc2 && nAcc1 > nAcc3)
            // nAcc1 <= nAcc2 || nAcc1 <= nAcc3 
            if (nAcc2 > nAcc3) {
                System.out.println(l2.accendi() + " Lampadina 2");
            } 
            else {
                // nAcc2 <= nAcc
                System.out.println(l3.accendi() + " Lampadina 3");
            }
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        if (nAcc1 > nAcc2 && nAcc1 > nAcc3) {
            System.out.println("Lampadina 1");
        }
        else {
            if (nAcc1 == nAcc2 || nAcc1 == nAcc3){
                System.out.println("Due o tre lampadine uguali");
            }
            else {
               //n2 > n3 o n3 > n2 o n2 = n3 
              
               if (nAcc2 > nAcc3) {
                   System.out.println("Lampadina 2");
               }
               else {
                   // n2 <= n3
                   if (nAcc3 > nAcc2) {
                       System.out.println("Lampadina 3");
                   }
                   else {
                       System.out.println("Due lampadine uguali");
                   }
               }
            }
        }
       

    }
    
}
