/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package morracinese;

        import javax.swing.JOptionPane;
public class MorraCineseTest {
    public static void main(String[] args) {
        String nome1;
        String nome2;
        
        
        nome1 = JOptionPane.showInputDialog(null, "Nome del computer?", "Nome Cpu", JOptionPane.QUESTION_MESSAGE);
        nome2 = JOptionPane.showInputDialog(null, "Nome del utente?", "Nome utente", JOptionPane.QUESTION_MESSAGE);
        
        
        MorraCinese mc1 = new MorraCinese(nome1, nome2);
        
        
        JOptionPane.showMessageDialog(null, "Giochiamo a morra cinese", "Morra cinese", JOptionPane.INFORMATION_MESSAGE);
        
        
        String temp;
        int inputg2;
        
        
        temp = JOptionPane.showInputDialog(null, "Inserisci un numero: \n 1 = forbici \n 2 = sasso \n 3 = carta", "Mossa g2", JOptionPane.QUESTION_MESSAGE);
        inputg2 = Integer.parseInt(temp);        
        JOptionPane.showMessageDialog(null, mc1.gioca(inputg2), "Risultato", JOptionPane.INFORMATION_MESSAGE);
        
        
        temp = JOptionPane.showInputDialog(null, "Inserisci un numero: \n 1 = forbici \n 2 = sasso \n 3 = carta", "Mossa g2", JOptionPane.QUESTION_MESSAGE);
        inputg2 = Integer.parseInt(temp);
        JOptionPane.showMessageDialog(null, mc1.gioca(inputg2), "Risultato", JOptionPane.INFORMATION_MESSAGE);
        
        
        temp = JOptionPane.showInputDialog(null, "Inserisci un numero: \n 1 = forbici \n 2 = sasso \n 3 = carta", "Mossa g2", JOptionPane.QUESTION_MESSAGE);
        inputg2 = Integer.parseInt(temp);
        JOptionPane.showMessageDialog(null, mc1.gioca(inputg2), "Risultato", JOptionPane.INFORMATION_MESSAGE);
        
        
        JOptionPane.showMessageDialog(null, "Grazie per aver giocato a morra cinese", "Finale", JOptionPane.INFORMATION_MESSAGE);

    }   
}

  
    

