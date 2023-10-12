package collage;

public class Collage {
    private Immagine[] immagini;
    private int dimL;

    public Collage(Immagine[] im) {
        this.dimL = im.length;
        immagini = copia(im);        
    }
    
    public void aggiungiImmangine(Immagine nuova){
        if (dimL == immagini.length)
            ingrandisciArrayImmagini();
        this.immagini[dimL] = nuova;
        dimL++;
    }
    
    public void rimuoviImmagine(int posIm){
        ShiftSx(posIm);
    }

    
    public int dimensioneTotale(){
        int somma = immagini[0].numeroPixel();
        for (int i = 1; i < dimL; i++) {
            somma += immagini[i].numeroPixel();
        }
        return somma;
    }
    
    public int contaImmaginiColori(){
        int n = 0;
        for (int i = 0; i < dimL; i++) {
            if(immagini[i].isColore()){
                n++;
            }
        }
        return n;
    }
    
    public int contaImmaginiGrigi(){
        return dimL - contaImmaginiColori();
    }
    
    public Immagine trovaImmaginePiuGrande(){

        //Rifare completamente



        int pos = 0;
        for (int i = 0; i < dimL; i++) {
            if(immagini[i].numeroPixel() > immagini[pos].numeroPixel()){
                pos = i;
                max = immagini[i].numeroPixel();
            }
        }
        return immagini[pos];
    }
    
    
    public String stampa(){
        String t = "";
        for (int i = 0; i < dimL; i++) {
            t += "\n---Immagine " + (i + 1) + "---\n" + immagini[i].stampa();
        }
        t+= "\ndimL:" + dimL;
        return t;
    }




    private Immagine[] copia(Immagine[] im){
        Immagine[] temp = new Immagine[im.length];
        for(int i = 0; i < im.length; i++){
            im[i] = temp[i];
        }
        return temp;
    }

    private void ingrandisciArrayImmagini() {
        Immagine temp = new Immagine[this.immagini.length + 5];
        for(int i = 0; i < im.length; i++){
            temp[i] = this.immagini[i];
        }
        this.immagini = temp;
    }

        
    private void ShiftSx(int pos) {
        for (int i = pos; i < dimL - 1; i++) 
            immagini[i] = immagini[i+1];
        dimL--;
    } 
}
