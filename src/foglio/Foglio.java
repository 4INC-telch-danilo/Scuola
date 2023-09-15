
package foglio;
import java.text.*;



/**
 *
 * @author danilo.telch
 */
public class Foglio {
    private double base;
    private double altezza;
    private String colore;
    
    
    public Foglio(double base, double altezza, String colore) {
        this.base = base;
        this.altezza = altezza;
        this.colore = colore;
    }
    
    public void setAltezza(double altezza) {
        this.altezza=altezza;
    }
    public double getAltezza() {
        return altezza; 
    }

    public void setBase(double base) {
        this.base=base;
    }
    public double getBase() {
        return base;
    }

    public void setColore(String colore) {
        this.colore=colore;
    }
    public String getColore() {
        return colore;
    }

    public double calcArea() { 
        double area;
        area=base*altezza;
        return area;
    }

    public double calcDiagonale() { 
        double diagonale;
        diagonale=Math.sqrt(altezza*altezza+base*base);
        return diagonale;
    }
    
    public void impostaAltezza(double area) { 
    	altezza=area/base;
    }
    public void impostaBase(double area) {
        base=area/altezza;
    }
    public void impostaColore(String colore) {
        this.colore=colore; 
    }

    public String stampa()  { 
        String testo;
        
        testo="Base: " + String.format("%.2f", base)  + "\nAltezza: " + altezza + "\nColore: " + colore;
        return testo; 
    }
    
    
}
