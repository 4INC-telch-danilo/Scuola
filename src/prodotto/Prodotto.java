/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prodotto;

/**
 *
 * @author danilo.telch
 */
public class Prodotto {
    private double prezzo;
     private double iva;
     private double peso;
     private double tara;
     private String descrizione;
     private String codiceBarre;

    public Prodotto(double prezzo, double iva, double peso, double tara, String descrizione, String codiceBarre) {
        this.prezzo = prezzo;
        this.iva = iva;
        this.peso = peso;
        this.tara = tara;
        this.descrizione = descrizione;
        this.codiceBarre = codiceBarre;
    }
    
    public Prodotto(Prodotto p){
        this.prezzo = p.prezzo;
        this.iva = p.iva;
        this.peso = p.peso;
        this.tara = p.tara;
        this.descrizione = p.descrizione;
        this.codiceBarre = p.codiceBarre;         
    }

    public String getDescrizione() {
        return descrizione;
    }
    
    public double getPrezzo() {
        return prezzo;
    }
    
    
    public String stampa(){
        return "Prezzo: " + prezzo + "\nIva: " + iva + "\nPeso: " + peso + "\nTara: " + tara + "\nDescrizione: " + descrizione + "\nCodice a barre: " + codiceBarre;
    }
    
    public double prezzoIvato(){
        return (prezzo * iva / 100) + prezzo;
    }
    
    public double pesoLordo(){
        return peso + tara;
    }
    
    public boolean controlloCodice(){
        int somm = 0;
        for(int i = 0; i < 12; i++){
            if(i%2 == 0){
                somm += Integer.parseInt(String.valueOf(codiceBarre.charAt(i)))*3;
            }else{
                somm += Integer.parseInt(String.valueOf(codiceBarre.charAt(i)));
            }
        }
        return Integer.parseInt(String.valueOf(codiceBarre.charAt(12))) == somm%10;
    }
    
}
