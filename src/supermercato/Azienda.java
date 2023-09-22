/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercato;

import prodotto.Prodotto;

/**
 *
 * @author danilo.telch
 */

/* 
nome gruppo
sede legale
supermercati
*/
public class Azienda {
    private String nomeGruppo;
    private String sedeLegale;
    private Supermercato[] supermercati;
    
    public Azienda(String nomeGruppo, String sedeLegale, Supermercato[] supermercati){
        this.nomeGruppo = nomeGruppo;
        this.sedeLegale = sedeLegale;
        this.supermercati = copia(supermercati);
    }
    
    private Supermercato[] copia(Supermercato[] arrayDaCopiare) {
        Supermercato[] temp = new Supermercato[arrayDaCopiare.length];
        for (int i = 0; i < arrayDaCopiare.length; i++) {
            temp[i] = arrayDaCopiare[i];
        }
        return temp;
    }
    
    public void addProd(Prodotto pAdd, int indice) {
        supermercati[indice].addProd(pAdd);
    }
    
    
    
    
}
