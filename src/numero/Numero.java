/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numero;

/**
 *
 * @author danilo.telch
 */
public class Numero {

    private int val;

    public Numero(int val) {
       setVal(val); 
    }
    
    public final void setVal(int val) {
        if (val >=0)
            this.val = val;
    }
    
    public int getVal() {
        return val;
    }

    public String somma(int add) {
        String testo = "";
        int somma = 0;
        somma = val + add;
        testo = "La somma è di " + somma;
        return testo;
    }

    public String compareInt(int val) {
        String segno = " = ";
        String testo = "I due numeri sono uguali";

        if (val > this.val) {
            segno = " > ";
            testo = val + " è il maggiore";
        }
        if (val < this.val) {
            segno = " < ";
            testo = this.val + " è il maggiore";
        }
        return val + segno + this.val + "\n" + testo;
    }

    public boolean pariDispari() {
        boolean pari = false;
        if (val % 2 == 0) {
            pari = true;
        }

        /* 
            oppure si può fare così, rimuovendo di fatto l'if: boolean pari = (val%2==0);
            oppure direttamente con il return:  "return val%2==0;" 
         */
        return pari;
    }

    /* 
        public boolean pariDispari() {
            boolean pari = (val%2==0);
            return pari;
        }
    
        public boolean pariDispari() {
            return val%2==0;
        }
     */
    public boolean isNegativo() {
        boolean negativo = false;
        if (val < 0) {
            negativo = true;
        }

        /* 
            oppure così: boolean negativo = (val < 0);
            oppure direttamente con il return:  "return val < 0;" 
         */
        return negativo;
    }

    /*
        public boolean isNegativo() {
            boolean negativo = (val < 0);
            return negativo;
        }
    
        public boolean isNegativo() {
            return val < 0;
        }
     */
    public String stampa() {
        String testo = "";
        testo = "val: " + val;
        return testo;
    }

    /*
        public String stampa() {
            String testo = "";
            testo = "Val: " + String.valueOf(val);
            return testo;
        }
     */
    public String moltiplicazioneperSomma(int moltiplicatore) {
        String testo = "";
        int somma = val;
        int x = 0;
        while (x < moltiplicatore - 1) {
            somma += val;
            x++;
        }
        testo = "La moltiplicazione è: " + somma;
        return testo;
    }

    public String sequenzaFibonacci() {
        int cont = 3;
        int n1 = 1;
        int n2 = 1;
        int seq = 0;
        String testo = n1 + " " + n2 + " ";
        if (val == 1) {
            testo = "" + n1;
        }
        while (cont <= val) {
            seq = n1 + n2;
            testo += seq + " ";
            n1 = n2;
            n2 = seq;
            cont++;
        }
        return testo;
    }

    public String binario() {
        int contatore = val;
        String numeroBinario = "";
        if (val == 0) 
            numeroBinario = "0";
        while (contatore > 0) {
            numeroBinario = contatore % 2 + numeroBinario;
            contatore /= 2;
        }
        return numeroBinario;
    }
    
    public String esadecimale() {
        String numeroEsadecimale = "";
       
        String numeroBinario = binario();
        int lunghezzaNumero = numeroBinario.length();
        if (lunghezzaNumero%4==0){
           numeroEsadecimale = codificaEsadecimale(numeroBinario, lunghezzaNumero);
        }
        else {
            while (lunghezzaNumero%4==0){
                numeroBinario= "0" + numeroBinario;
                lunghezzaNumero=numeroBinario.length();
            }
            numeroEsadecimale = codificaEsadecimale(numeroBinario, lunghezzaNumero);
        }
        
        
        
        
        return numeroEsadecimale;
    }
    
    private String codifica(String conversione) {
        String myStr = conversione;
        String carattereConvertito = "";
        if (myStr.contentEquals("1010")){
            carattereConvertito="A";
        }
        else if (myStr.contentEquals("1011")){
            carattereConvertito="B";
        }
        else if (myStr.contentEquals("1100")){
            carattereConvertito="C";
        }
        else if (myStr.contentEquals("1101")){
            carattereConvertito="D";
        }
        if (myStr.contentEquals("1110")){
            carattereConvertito="E";
        }
        if (myStr.contentEquals("1111")){
            carattereConvertito="F";
        }
        else{
            carattereConvertito=conversione + "";
        }
        return carattereConvertito;
    }
    
    private String codificaEsadecimale(String numeroBinario, int lunghezzaNumero) {
        String conversione = "";
        String numeroEsadecimale = "";
        int inizio = lunghezzaNumero;
        int fine = lunghezzaNumero-4;
        while (fine >= 0){
               conversione= numeroBinario.substring(fine, inizio);
               numeroEsadecimale = codifica(conversione) + numeroEsadecimale;
               inizio-=4;
               fine-=4;
               
           }
        return numeroEsadecimale;
    }
    
    public String sommaBinaria(String addendoBinario) {    
        String sommaBinaria = "";
        String nBinario = binario();
        int riporto = 0;
        int contatore = Integer.max(addendoBinario.length(), nBinario.length());
        addendoBinario = aggiungiZeri(addendoBinario, contatore);
        nBinario = aggiungiZeri(nBinario, contatore);
        
        contatore--;
        while (contatore >= 0) {
            int bin2 = Character.hashCode(nBinario.charAt(contatore));
            int bin1 = Character.hashCode(addendoBinario.charAt(contatore));


            sommaBinaria = (bin1 ^ bin2 ^ riporto) + sommaBinaria;


            if ((bin1 & bin2) == 49) {
                riporto = 1;
            } 
            if ((bin1 & bin2 & riporto) == 48){
                riporto = 0;
            }
            contatore--;
        }


        if (riporto == 1){
            sommaBinaria = 1 + sommaBinaria;
        }
        return sommaBinaria;
    }


    private String aggiungiZeri(String binario, int contatore) {
        while (binario.length() != contatore){
            binario = 0 + binario;
        }
        return binario;
    }  
//    public char[] sommaBinaria(String addendoBinario) {    
//        
//        
//        
//        
//        char[] sommaBinaria = new char[10];
//        char[] numBinario = new char[10];
//        char[] addBinario = new char[10];
//        String nBinario = binario();
//        
//        int riporto = 0;
//        int contatore = Integer.max(addendoBinario.length, numBinario.length);
//        addendoBinario = aggiungiZeri(addendoBinario, contatore);
//        numBinario = aggiungiZeri(numBinario, contatore);
//        int i = 9;
//        
//        
//        
//        
//        
//        contatore--;
//        while (contatore >= 0) {
//           
//            int bin2 = Character.hashCode(nBinario.charAt(contatore));
//            int bin1 = Character.hashCode(addendoBinario[contatore]);
//
//
//            sommaBinaria[i] = (char) (bin1 ^ bin2 ^ riporto);
//
//
//            if ((bin1 & bin2) == 49) {
//                riporto = 1;
//            } 
//            if ((bin1 & bin2 & riporto) == 48){
//                riporto = 0;
//            }
//            contatore--;
//            i--;
//        }
//
//
//        if (riporto == 1){
//            sommaBinaria[i-1] = 1;
//        }
//        return sommaBinaria;
//    }
    
    
    
}



