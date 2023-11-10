package collage;

public class Collage {

    private Immagine[] immagini; 
    private int dimL; // dimensione logica 

    // Costruttore della classe, diamo per scontato che l'array di immagini in entrata sia pieno.
    public Collage(Immagine[] im) {
        this.dimL = im.length; // assegno alla dimensione logica (dimL) il valore della lunghezza dell'array passato da parametro
        immagini = copia(im); // visto che siamo in una composizione, assegno all'array attributo della classe la copia dell'array passato da parametro       
    }

    // Metodo interessato che aggiunge un immagine al collage
    public void aggiungiImmangine(Immagine nuova){
        if (dimL == immagini.length) // controllo se la dimensione logica (dimL) è uguale alla lunghezza dell'array 
            ingrandisciArrayImmagini(); //se la condizione è vera allora ingrandisco l'array
        this.immagini[dimL] = nuova; // inserisco la nuova immagine
        dimL++; //aumento la dimensione logica
    }

    // Metodo che rimuove un immagine dall'array senza altrerne la dimensione fisica    
    public void rimuoviImmagine(int posIm){
        ShiftSx(posIm); // sposto tutte le immagini, dalla posizione data da parametro, verso sinistra di una posizione
        dimL--; // diminuisco la dimensione logica (dimL) perché ho rimosso un elemento dall'array di immagini
    }

    // Metodo che restituisce la grandezza totale del collage
    public int dimensioneTotale(){
        int somma = immagini[0].dimensioni(); // inizializzo la variabile somma con il valore della dimensione della prima foto

        //aggiungo a somma tutti i valori delle dimensioni delle foto 
        for (int i = 1; i < dimL; i++) { 
            somma += immagini[i].dimensioni(); 
        }
        
        return somma; // ritorno il risultato
    }

    // Metodo che restituisce quante immagini a colori ci sono nel collage
    public int contaImmaginiColori(){
        int n = 0; // variabile contatore

        // eseguo ciclo e controllo per ogni foto se è a colori
        for (int i = 0; i < dimL; i++) { 
            if(immagini[i].isColore()){
                n++; // se la condizione è vera allora incremento la variabile contatore (n)
            }
        }
        
        return n; // ritorno il risultato
    }
     
    // Metodo che restituisce quante immagini in scala di grigi(Bianco e nero) ci sono nel collage
    public int contaImmaginiGrigi(){

        // conto le immagini a colori e le tolgo dalle immagini totali e trovo le immagini in scala di grigi(Bianco e nero), poi ritorno il risultato
        return dimL - contaImmaginiColori(); 
    }

    // Metodo che mi permette di trovare l'immagine più grande del collage
    public Immagine trovaImmaginePiuGrande(){
        int pos = 0; // varibile che serve per tenere conto della posizione della foto con la grandezza massima
        
        // eseguo un ciclo che confronta ogni dimensione dell'immagine con la dimensione dell'immagine più grande
        // se la prima ha dimensioni più grandi allora assegno alla variabile (pos) il valore di i per salvare la posizione
        // in cui c'è l'immagine con le dimensioni più grandi
        for (int i = 0; i < dimL; i++) {
            if(immagini[i].dimensioni() > immagini[pos].dimensioni()){
                pos = i;
            }
        }
        
        return new Immagine(immagini[pos]); //ritorno l'immagine con le dimensioni più grandi
    }
    
    public String stampa(){
        String t = "";
        for (int i = 0; i < dimL; i++) {
            t += "\n---Immagine " + (i + 1) + "---\n" + immagini[i].stampa();
        }
        t+= "\ndimL:" + dimL;
        return t;
    }

    // Metodo che esegue la copia di un array di immmagini preso da parametro parametro
    private Immagine[] copia(Immagine[] im){
        Immagine[] temp = new Immagine[im.length]; // Dichiaro un nuovo array temporaneo

        //Copio i gli elemeti dell'array preso da parametro nell'array temporaneo
        for(int i = 0; i < im.length; i++){
            im[i] = temp[i];
        }

        return temp; // ritorno l'array temporaneo
    }
     
    // Metodo che esegue l'ingrandimento dell'array di immagini
    private void ingrandisciArrayImmagini() {
        Immagine[] temp = new Immagine[this.immagini.length + 5]; // Dichiaro un nuovo array temporaneo con 5 celle in più rispetto all'array di immagini
        
        //Copio i gli elemeti dell'array di immagini nell'array temporaneo
        for(int i = 0; i < immagini.length; i++){
            temp[i] = this.immagini[i];
        }
        
        this.immagini = temp; // assegno all'array di immagini il puntatore dell'array temporaneo
    }
 
    // Metodo che segue lo spostamento verso sinistra degli elementi dell'array di immagini 
    private void ShiftSx(int pos) {
        for (int i = pos; i < dimL - 1; i++) 
            immagini[i] = immagini[i+1];
    } 
}
