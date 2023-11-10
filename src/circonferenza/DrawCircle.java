/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package circonferenza;

/**
 *
 * @author danilo.telch
 */
import javax.swing.*;
import java.awt.*;

public class DrawCircle extends JFrame {
    
    
    private Circonferenza c;
    private int raggio;
    public DrawCircle(int xA,int xB, int yA, int yB){
        c = new Circonferenza(xA, xB, yA, yB);
        raggio = (int) c.getRaggio()*100;
        System.out.println(raggio);
        setTitle("Drawing a Circle");
        int x = raggio + 200;
        int y = raggio + 200;
        setSize(x, y);
        JOptionPane.showMessageDialog(null, "Sto disegnando");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("ciao");
        }
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void paint(Graphics g) {       
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawOval((raggio+200)/2-raggio/2, (raggio+200)/2-raggio/2, raggio, raggio);
    }

    public static void main(String[] args) {

       new DrawCircle(10, 0, 0,0);

    }
    

}