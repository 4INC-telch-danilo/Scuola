/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esPolimorfismo;

/**
 *
 * @author danilo.telch
 */
public class Padre {
    private int pp;
    
    public Padre(){
        this.pp = 0;
    }

    public final int getPp() {
        return pp;
    }

    public final void setPp(int pp) {
        this.pp = pp;
    }
    
    public void incrementa() {
        this.pp++;
    }

    @Override
    public String toString() {
        return pp + "";
    }
    
    
}
