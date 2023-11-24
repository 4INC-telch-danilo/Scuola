/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaProdotti;
import prodotto.Prodotto;
import data.DataCompleta;
import java.time.LocalDate;
import java.util.Random;
/**
 *
 * @author danilo.telch
 */
public class ListaProdotti { 
    public static void main(String[] args){
        Random r = new Random();
        Prodotto p[] = new Prodotto[5];
        String descrizione[] = {"latte", "uova", "shampoo", "bisteccha", "zucchero"};
        
        for (int i = 0; i < 5; i++) {
            p[i] = new Prodotto(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble(), descrizione[i], "");
        }
                
        
        
        LocalDate d = LocalDate.now();
        DataCompleta dataOdierna = new DataCompleta(d.getDayOfMonth(), d.getMonthValue(), d.getYear());
        Prodotto lista[] = {new Alimentari(p[0], new DataCompleta(25, 11, 2023)), 
                            new Alimentari(p[1], new DataCompleta(30,11,2023)), 
                            new NonAlimentari(p[2], true), 
                            new NonAlimentari(p[3], false), 
                            new Alimentari(p[4], new DataCompleta(20,12,2023))
        };
        
        
        Prodotto prodottiPlasticaSconto50[] = new Prodotto[lista.length];
        int cont = 0;
        
        
        for(Prodotto prod : lista){
            if (prod instanceof Alimentari) {
                Alimentari temp = (Alimentari) prod;
                if (dataOdierna.diffData(temp.getDataScadenza()) < 2) {
                    prodottiPlasticaSconto50[cont] = temp;
                    cont++;
                }
            }
        }
        
        for(Prodotto prod : lista) {
            if (prod instanceof NonAlimentari) {
                NonAlimentari temp = (NonAlimentari) prod;
                if (temp.contienePlastica()) {
                    prodottiPlasticaSconto50[cont] = temp;
                    cont++;
                }
            }
        }
        
        
        for(Prodotto prod : prodottiPlasticaSconto50) {
            if (prod != null)
            System.out.println(prod);
        }        
    }

}
