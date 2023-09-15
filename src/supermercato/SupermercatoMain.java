/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package supermercato;
import prodotto.Prodotto;

/**
 *
 * @author danilo.telch
 */
public class SupermercatoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String[] codici = {"8001097150137", "8001097210084", "7332577849038", "4719072965440"};
        double[] prezzi = {8, 10, 29.99, 300};
        double[] pesi = {4.3, 5.2, 147, 1500};
        double[] tare = {1.1, 0.5, 15, 400};
        String[] descrizioni = {"carte briscola", "carte ramino", "cuffie", "scheda video"};




        Prodotto[] p = new Prodotto[4];

        for (int i = 0; i < 4; i++){
            p[i] = new Prodotto(prezzi[i], 4, pesi[i], tare[i], descrizioni[i], codici[i]);
        }

        Supermercato s = new Supermercato("Coop", "Viale IV Novembre 53", p);

        System.out.println(s.prezzoAlto());
        System.out.println(s.pesoMinore());
        System.out.println(s.valoreMerce());
        System.out.println(s.sopraValoreMedio());
    }   

    }


