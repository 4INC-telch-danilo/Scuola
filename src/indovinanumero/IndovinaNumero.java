
package indovinanumero;

public class IndovinaNumero {
    private int numPensato;
    
    public IndovinaNumero(int numPensato) {
        this.numPensato = numPensato;
    }
    
    public void setNumPensato(int numPensato) {
        this.numPensato = numPensato;
    }
    
    public int getNumPensato() {
        return numPensato;
    }
    
    public String pensa() {
        int num = 0;
        
        String testo = "";
        
        num = numPensato + 4;
        num *= 2;
        num += 10;
        num -= 8;
        num /= 2;
        num -= numPensato;
        
        testo = "Il numero pensato è: " + numPensato + "\nIl risultato è: " + num;
        
        return testo;
    }
    
    public String stampa() {
        String s;
        
        s = "Il numero pensato è: " + numPensato;
        
        return s;
    }
}
