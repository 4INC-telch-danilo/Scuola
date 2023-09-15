package foglio;

import java.util.*;
import java.text.*;

/**
 *
 * @author danilo.telch
 */
public class FoglioTest {
    public static void main(String[] args) {
        
        Foglio f = new Foglio(5.575858, 2, "rosso");
        
        double area = f.calcArea();
        System.out.println(area);
        
        double diagonale = f.calcDiagonale();
        
        System.out.println(String.format("%.2f", diagonale));
        
        System.out.println(f.stampa());
        
        /*f.impostaBase(30);
        System.out.println(f.getBase());
        
        f.impostaColore("verde");
        System.out.println(f.getColore());
        
        f.impostaAltezza(30);
        System.out.println(f.getAltezza());*/
        
        
        
        // Serve per fare numeri randomici da 0 a n-1
        /* Random r = new Random();
        
        int n = r.nextInt(10);
        
        System.out.println(n); */
        
        /*
        double d = 437598,478;
        
        DecimalFormatSymbols  t = new DecimalFormatSymbols(Locale.ITALIAN)
        NumberFormat t1 = new DecimalFormat("###,###.##", t)
        String str = t1(d);
        System.out.println(str);
        */
        
    }   
}
