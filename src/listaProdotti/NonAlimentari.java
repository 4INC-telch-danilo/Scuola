/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaProdotti;

import prodotto.Prodotto;
/**
 *
 * @author danilo.telch
 */
public class NonAlimentari extends Prodotto{
    private boolean contienePlastica;
    
    public NonAlimentari(Prodotto p, boolean contienePlastica){
        super(p);
        setContienePlastica(contienePlastica);
    }
    
    public final void setContienePlastica(boolean contienePlastica) {
        this.contienePlastica=contienePlastica;
    }
    
    @Override
    public boolean contienePlastica() {
        return contienePlastica;
    }
    
    @Override
    public String toString() {
       return super.toSting() + "contienePlastica: " + contienePlastica + "\n";
    }   
}
