package collage;

public class Immagine {
    
    private int base;
    private int altezza;
    private boolean colore;

    public Immagine(int base, int altezza, boolean colore) {
        this.base = base;
        this.altezza = altezza;
        this.colore = colore;
    }

    public Immagine(Immagine im){
        this.base = im.base;
        this.altezza = im.altezza;
        this.colore = im.colore;
    }

    public int getAltezza() {
        return altezza;
    }

    public int getBase() {
        return base;
    }

    public boolean isColore() {
        return colore;
    }
    
    public int dimensioni(){
        return base * altezza;
    }
    
    public String confrontaDimensioni(Immagine nuova){
        String t = "L'immagine e' piu' piccola";
        int dim1 = dimensioni();
        int dim2 = nuova.dimensioni();
        if(dim1 > dim2){
            t = "L'immagine e' piu' grande";
        }else if(dim1 == dim2){
            t = "Le due immagini sono uguali";
        }
        return t;
    }
    
    public String ridimensiona(int nBase, int nAltezza){
        base = nBase;
        altezza = nAltezza;
        return "Immagine ridimensionata";
    }
    
    public String cambiaColore(boolean aColore){
        this.colore = aColore;
        return "Colore cambiato";
    }
    
    public String stampa(){
        String t = "";
        t = "base: " + base + "\naltezza: " + altezza + "\ncolorata: " + colore + "\n";
        return t;
    } 
}
