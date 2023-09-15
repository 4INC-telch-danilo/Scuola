
package data;

public class Data {
    private int giorno;
    private int mese;
    private int anno;
    private int[] giorniMesi;

    public int getAnno() {
        return anno;
    }

    public int getMese() {
        return mese;
    }

    public int getGiorno() {
        return giorno;
    }
    
    
    
   
    public Data (int giorno, int mese, int anno) {
        int[] giorniDeiMesi = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        this.giorniMesi = giorniDeiMesi;
        this.giorno = giorno;
        this.anno = anno;
        if (isBisestile())
            this.giorniMesi[1]++;
        if (mese > 0 && mese < 13)
            this.mese = mese;
        if (giorno > 0 && giorno <= giorniMesi[mese-1])
            this.giorno = giorno;
    }
   
    public final boolean isBisestile(){
        return (anno%400==0) || ((anno%4==0) && (anno%100!=0));
    }
   
   
    public String domani() {
        int giorno = this.giorno;
        int mese = this.mese;
        int anno = this.anno;
       
        giorno++;
        if (giorno > giorniMesi[mese-1]){
            giorno=1;
            mese++;
        }
        if (mese > giorniMesi.length){
            mese = 1;
            anno++;
        }
        return formattazione(giorno, mese, anno);
    }
   
    public String ieri() {
        int giorno = this.giorno;
        int mese = this.mese;
        int anno = this.anno;
       
        giorno--;
        if (giorno < 1){
            mese--;
            if (mese == 0)
                mese = 12;
            giorno = giorniMesi[mese-1];  
        }
        if (mese == 12)
            anno--;
        return formattazione(giorno, mese, anno);
    }
   
    public String formattaData() {
        return formattazione(giorno, mese, anno);
    }
   
    private String formattazione(int giorno, int mese, int anno){
        String testo = "";
        testo += String.format("%02d/", giorno);
        testo += String.format("%02d/", mese);
        testo += anno;
        return testo;
    }
    
    


    public String stampa(){
        String testo = "";
        testo = "Giorno: " + giorno + "\n"
              + "Mese: "   + mese   + "\n"
              + "Anno: "   + anno   + "\n";
        return testo;
    }
}
