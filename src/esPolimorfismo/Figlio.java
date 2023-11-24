/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esPolimorfismo;

/**
 *
 * @author danilo.telch
 */
public class Figlio extends Padre{
    String ff;
    
    public Figlio() {
        super();
        ff = "figlio";
    }

    public final String getFf() {
        return ff;
    }

    public final void setFf(String ff) {
        this.ff = ff;
    }
    
    @Override
    public void incrementa() {
        ff = "ho modificato il metodo del padre";
    }

    @Override
    public String toString() {
        return super.toString() + ff;
    }
    
    
}
