package prova;

import java.util.Random;

public class ProvaVett {
    private int[] vett;

    public ProvaVett(int[] vett) {
        setVett(vett);
    }

    public int[] getVett() {
        int[] vett = new int[this.vett.length];
        for (int i = 0; i < vett.length; i++)
            vett[i] = this.vett[i];
        return vett;
    }

    final public void setVett(int[] vett) {
        this.vett = new int[vett.length];
        for (int i = 0; i < vett.length; i++)
            this.vett[i] = vett[i]; 
    }

    public void caricamentoRandom(int min, int max){
        Random random = new Random();
        for (int i = 0; i < this.vett.length; i++){
            int num = random.nextInt(max) + 1;
            while (num < min)
                num = random.nextInt(max) + 1;        
            
            this.vett[i]=num; 
        }      
    }

    public boolean scambioElementi(int posOrigine, int posDest){
        boolean risultato = false;
        int temp = 0; 
        if (controlloPosizione(posDest) && controlloPosizione(posOrigine)) {
            temp = this.vett[posDest];
            this.vett[posDest] = this.vett[posOrigine];
            this.vett[posOrigine] = temp;
            risultato = true;
        }
        return risultato;
    }

    public boolean modificaElemento(int posizione, int valore) {
        boolean risultato = false;
        if (controlloPosizione(posizione)) {
            this.vett[posizione] = valore;
            risultato = true;
        } 
        return risultato;
    }

    public boolean cancellaElemento(int posizione) {
        boolean risultato = false;
        if (controlloPosizione(posizione)) {
            int[] vett = new int[this.vett.length-1];
            for (int i = 0; i < posizione; i++)
                vett[i] = this.vett[i];

            for (int i = posizione; i < this.vett.length-1; i++)
                vett[i] = this.vett[i+1];

            this.vett = vett;
            risultato = true;
        }
        return risultato;
    }

    public int numeroElementi(int valore) {
        int cont = 0;

        for (int i = 0; i < this.vett.length; i++) 
            if (this.vett[i] == valore)
                cont++;

        if (cont == 0) 
            cont = -1;
        return cont;
    }

    public int sommaElementi() {
        int somma = 0;
        for (int i = 0; i < this.vett.length; i++) 
            somma += this.vett[i];
        return somma;
    }

    public int sommaElementiDaVettore(int[] elementi) {
        int somma = 0;
        for (int i = 0;  i < elementi.length; i++) 
            somma += this.vett[elementi[i]];
        return somma;
    }

    public String stampa() {
        String testo = "";
        for (int i = 0; i < this.vett.length; i++) 
            testo += "\nvett[" + i + "] = " + vett[i];
        return testo;
    }

    private boolean controlloPosizione(int posizione) {
        return (posizione >=0 && posizione < this.vett.length);
    }

    public int cercaElemento(int valore) {
        int posizione = -1;
        for (int i = 0; i < this.vett.length; i++)
                if (this.vett[i] == valore)
                    posizione = i;
        return posizione;
    }

    public boolean aggiungiElemento(int posizione, int valore) {
        boolean risultato = false;
        
        if (controlloPosizione(posizione)) {
            int[] vett = new int[this.vett.length +1];
            
            for (int i = 0; i < posizione; i++)
                    vett[i] = this.vett[i];

            vett[posizione] = valore;
            
            for (int i = posizione + 1; i < vett.length; i++)
                vett[i] = this.vett[i-1];

            this.vett = vett;
            risultato = true;
        }
        return risultato;
    }

    public void unisci(int[] vett){
        int lunghezza = this.vett.length + vett.length;
        int[] vettUniti = new int[lunghezza];
        for (int i = 0; i < this.vett.length; i++)
            vettUniti[i] = this.vett[i];
        
        for (int i = this.vett.length; i < lunghezza; i++)
            vettUniti[i] = vett[i-this.vett.length];
        
        this.vett = vettUniti;
    }
}