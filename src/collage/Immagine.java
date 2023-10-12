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

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public boolean isColore() {
        return colore;
    }

    public void setColore(boolean colore) {
        this.colore = colore;
    }
    
    public int numeroPixel(){
        return base * altezza;
    }
    
    public String confrontaDimensioni(Immagine nuova){
        String t = "";
        int dim1 = base*altezza;
        int dim2 = nuova.getBase()*nuova.getAltezza();
        if(dim1 > dim2){
            t = "L'immagine e' piu' grande";
        }else if(dim1 == dim2){
            t = "Le due immagini sono uguali";
        }else{
            t = "L'immagine e' piu' piccola";
        }
        return t;
    }
    
    public String ridimensiona(int nBase, int nAltezza){
        base = nBase;
        altezza = nAltezza;
        return "Immagine ridimensionata";
    }
    
    public String cambiaColore(boolean aColore){
        colore = aColore;
        return "Colore cambiato";
    }
    
   public String stampa(){
       String t = "";
       t = "base: " + base + "\naltezza: " + altezza + "\ncolorata: " + colore + "\n";
       return t;
   } 
    
}
