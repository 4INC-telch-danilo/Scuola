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
public class Supermercato {
     private String nome;
    private String indirizzo;
    private Prodotto[] prodotti;

    public Supermercato(String nome, String indirizzo, Prodotto[] prodotti) {
        this.nome = nome;
        this.indirizzo  = indirizzo;
        this.prodotti = copia(prodotti);
    }

    private Prodotto[] copia(Prodotto[] prodotti) {
        Prodotto[] temp = new Prodotto[prodotti.length];
        for (int i = 0; i < prodotti.length; i++) {
            temp[i] = prodotti[i];
        }
        return temp;
    }

    public String getNome() {
        return nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }


    public String prezzoAlto() {
        int prezzoAlto = 0;
        for (int i = 1; i < prodotti.length; i++){
            if (prodotti[prezzoAlto].prezzoIvato() < prodotti[i].prezzoIvato()){
                prezzoAlto = i;
            }
        }
        return prodotti[prezzoAlto].getDescrizione();
    }

    public double valoreMerce() {
        double somma = prodotti[0].getPrezzo();
        for (int i = 1; i < prodotti.length; i++) 
            somma += prodotti[i].getPrezzo();
        return somma;
    }

    public String pesoMinore() {
        int pesoMinore = 0;
        for (int i = 1; i < prodotti.length; i++){
            if (prodotti[pesoMinore].prezzoIvato() > prodotti[i].prezzoIvato()){
                pesoMinore = i;
            }
        }
        return prodotti[pesoMinore].getDescrizione();
    }

    public String sopraValoreMedio() {
        double valoreMedio = valoreMerce()/prodotti.length;
        String prodottiSopraMedia = "";
        for (int i = 0; i < prodotti.length; i++) {
            if (prodotti[i].getPrezzo() > valoreMedio) {
                prodottiSopraMedia += prodotti[i].getDescrizione() + "\n";
            }
        }
        return prodottiSopraMedia;
    }

}
