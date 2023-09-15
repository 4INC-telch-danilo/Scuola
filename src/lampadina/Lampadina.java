package lampadina;

/*
 *
 * @author danilo.telch
 */
public class Lampadina {
    private String marca;
    private String colore;
    private int numeroAccensioni;
    private int numeroVolte;
    private boolean stato;
    
    
    public Lampadina(String marca, String colore, int numeroAccensioni, 
                                               int numeroVolte, boolean stato) {
        this.marca = marca;
        this.colore = colore;
        this.numeroAccensioni = numeroAccensioni;
        this.numeroVolte = numeroVolte;
        this.stato = stato;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public int getNumeroAccensioni() {
        return numeroAccensioni;
    }

    public void setNumeroAccensioni(int numeroAccensioni) {
        this.numeroAccensioni = numeroAccensioni;
    }

    public int getNumeroVolte() {
        return numeroVolte;
    }

    public void setNumeroVolte(int numeroVolte) {
        this.numeroVolte = numeroVolte;
    }
    
    
    
    
}
