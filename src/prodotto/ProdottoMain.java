/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prodotto;

/**
 *
 * @author danilo.telch
 */
public class ProdottoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String codice = "8001097150137";
        Prodotto p = new Prodotto(10, 4, 15, 6, "Barretta energetica",  codice);

        System.out.println("Prezzo prodotto + iva: " + p.prezzoIvato());
        System.out.println("Peso lordo: " + p.pesoLordo());
        System.out.println("Il codice è corretto: " + p.controlloCodice());

    }
    
}
