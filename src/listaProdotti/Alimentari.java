/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaProdotti;

import prodotto.Prodotto;
import data.DataCompleta;
/**
 *
 * @author danilo.telch
 */
public class Alimentari extends Prodotto{
    private DataCompleta dataScadenza;
    
    public Alimentari(Prodotto p, DataCompleta dataScadenza) {
        super(p);
        setDataScadenza(dataScadenza);
    }
    
    public final void setDataScadenza(DataCompleta dataScadenza){
        this.dataScadenza = new DataCompleta(dataScadenza);
    }
        
    @Override
    public DataCompleta dataScadenza() {
        return new DataCompleta(dataScadenza);
    }
    
    @Override
    public String toString() {
        return super.toSting() + "dataScadenza: " + dataScadenza.toString();
    }
}
