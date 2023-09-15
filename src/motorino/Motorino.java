
package motorino;

/**
 *
 * @author danilo.telch
 */
public class Motorino {
    
    private int velocita;
    private boolean antifurto;
    private String marca;
    private String modello;
    private String colore;

    public Motorino(String colore, int velocita, String marca, String modello, boolean antifurto) {
        this.colore = colore;
        this.velocita = velocita;
        this.marca = marca;
        this.modello = modello;
        this.antifurto = antifurto;
    }
    
    public void setVelocita(int velocita) {
        this.velocita=velocita;
    }
    public double getVelocita() {
        return velocita;
    }
    
    public void setColore(String colore) {
        this.colore=colore;
    }
    public String getColore() {
        return colore;
    }
    
    public void setMarca(String marca) {
        this.marca=marca;
    }
    public String getMarca() {
        return marca;
    }
    
    public void setModello(String modello) {
        this.modello=modello;
    }
    public String getModello() {
        return modello;
    }
    
    public void setAntifurto(boolean antifurto) {
        this.antifurto=antifurto;
    }
    public boolean getAntifurto() {
        return antifurto;
    }    
    
    public void accelera(int v) {
        velocita += v;
    }

    public void decelera(int v) {
        velocita -= v;
    }

    public void frena() {
        velocita = 0;
    }

    public void inserisciAntifurto() {
        antifurto = true;
    }

    public String stampa() {
        String testo;
        testo = "colore " + colore
                + "\nmarca: " + marca
                + "\nmodello " + modello
                + "\nantifurto " + antifurto
                + "\nvelocità " + velocita + "Km/h";
        return testo;
    }

}
