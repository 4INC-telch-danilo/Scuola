/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frase;
public class Frase {
   
    private String[] parole;
    private int dimL;

    public Frase(String[] parole){
        this.parole = copiaP(parole);
        dimL = parole.length;
    }

    public String[] getParole() {
        return copiaP(parole);
    }

    private String[] copiaP(String[] arP){
        String[] copia = new String[arP.length];
        for (int i = 0; i < copia.length; i++)
            copia[i] = arP[i];  
        return copia;
    }

    private void shiftDx(int posP, int posA) {
        for (int i = posA; i > posP; i--)
            parole[i] = parole[i-1];
    }

    private void shiftSx(int posP, int posA) {
        for (int i = posP; i < posA; i++)
            parole[i] = parole[i+1];
    }

    public void inserimento(String parola, int indice) {
            if (isFull())
                ingrandisciArray();
            shiftDx(indice, dimL);
            parole[indice] = parola;
            dimL++;
    }

    public void cancellazione(int indice) {
        shiftSx(indice, dimL-1);
        dimL--;
    }

    public void spostamento(int posP, int posA) {
        String parola = parole[posP];
        if (posP < posA){     
            shiftSx(posP,posA);
        }
        else {
            shiftDx(posA, posP); 
        }
        parole[posA] = parola;
        
        
    }

    public int nParole() {
        return dimL;
    }

    public int nCaratteri() {
        int caratteri = 0;
        for (int i = 0; i < dimL; i++)
            caratteri += parole[i].length();
        return caratteri;
    }

    public String stampa() {
        String testo = "";
        for (int i = 0; i < dimL; i++)
            testo += "parole[" + i + "] = " + parole[i] + "\n";
        return testo;
    }

    /*
     * Buongiorno Prof, io e Giacomo abbiamo deciso di aggiungere questi 3 metodi
     * per evitare le ripetizioni di codice e per ingrandire l'array qualora fosse pieno
     */

   
    private boolean controlloIndice(int indice) {
        return indice >= 0 && indice < parole.length;
    }

    private boolean isFull() {
        return dimL == parole.length;
    }

    public void ingrandisciArray() {
        String[] arrayIngrandito = new String[parole.length + 5];
        for (int i = 0; i < parole.length; i++)
            arrayIngrandito[i] = parole[i];  
        parole = arrayIngrandito;
    }
}

    /* Poi non sapevamo se fosse meglio eliminare il metodo ingrandisci array e dare al metodo copia l'ingrandimento
       
        Ad esempio :

        private String[] copiaP(String[] arP){
            String[] copia = new String[arP.length + 5];
            for (int i = 0; i < copia.length; i++)
                copia[i] = arP[i];  
            return copia;
        }

        e potevamo rimuovere il metodo ingrandisci array da inserimento ed fare direttamente un comando di copia

        ad esempio:

        public boolean inserimento(String parola, int indice) {
            boolean risultato = controlloIndice(indice) || indice == dimL;
            if (risultato){
                if (isFull()){
                    parole = copiaP(parole);
                }
                shiftDx(indice);
                parole[indice] = parola;
                dimL++;
            }
            return risultato;
        }

    */




