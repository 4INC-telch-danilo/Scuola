/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abbonamentomensile;

import javax.swing.JOptionPane;
/**
 *
 * @author danilo.telch
 */
public class AbbonamentoMensileTest2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String mese;
        String nominativo;
        String t;
        int eta;
        String input;
        JOptionPane.showMessageDialog(null, "Test della classe AbbonamentoMensile", "Test", JOptionPane.INFORMATION_MESSAGE);
        
        mese=JOptionPane.showInputDialog("Inserisci il mese corrente: ", "Gennaio");
        
        AbbonamentoMensile ab1 = new AbbonamentoMensile(mese);
        
        JOptionPane.showMessageDialog(null, "Inserire dati abbonamento", "Dati", JOptionPane.INFORMATION_MESSAGE);
        nominativo = JOptionPane.showInputDialog("Nominativo ?","Mario Rossi");
        t = JOptionPane.showInputDialog("Età ?","10");
        eta = Integer. parseInt(t);
        Object[] sessi = { "maschio" , "femmina" };
        Object sesso = JOptionPane.showInputDialog(null, "Sesso ?", "Sesso", JOptionPane.QUESTION_MESSAGE, null, sessi, sessi[0]);
        
        input = sesso.toString();
        
        JOptionPane.showMessageDialog(null, ab1.calcolaCosto(nominativo, eta, input), "Costo", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
