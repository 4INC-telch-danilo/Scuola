/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author danilo.telch
 */
public class DataCompleta {

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

    public DataCompleta(int giorno, int mese, int anno) {
        int[] giorniDeiMesi = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        this.giorniMesi = giorniDeiMesi;
        this.giorno = giorno;
        this.anno = anno;
        setFebbraio(anno);
        if (mese > 0 && mese < 13)
            this.mese = mese;
        if (giorno > 0 && giorno <= giorniMesi[mese - 1])
            this.giorno = giorno;
    }
    
    public DataCompleta(DataCompleta d){
        int[] giorniDeiMesi = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        this.giorniMesi = giorniDeiMesi;
        this.giorno = d.giorno;
        this.anno = d.anno;
        this.mese = d.mese;
    }

    private boolean controlloBisestile(int anno) {
        return (anno % 400 == 0) || ((anno % 4 == 0) && (anno % 100 != 0));
    }

    public final boolean isBisestile() {
        return controlloBisestile(anno);
    }
    
    private void setFebbraio(int anno) {
        if (controlloBisestile(anno))
            this.giorniMesi[1] = 29;
        
        else {
            this.giorniMesi[1] = 28;
        }
    }

    public String domani() {
        int giorno = this.giorno;
        int mese = this.mese;
        int anno = this.anno;

        giorno++;
        if (giorno > giorniMesi[mese - 1]) {
            giorno = 1;
            mese++;
        }
        if (mese > giorniMesi.length) {
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
        if (giorno < 1) {
            mese--;
            if (mese == 0) 
                mese = 12;
            giorno = giorniMesi[mese - 1];
        }
        if (mese == 12)
            anno--;
        return formattazione(giorno, mese, anno);
    }

    public String formattaData() {
        return formattazione(giorno, mese, anno);
    }

    private String formattazione(int giorno, int mese, int anno) {
        String testo = "";
        testo += String.format("%02d/", giorno);
        testo += String.format("%02d/", mese);
        testo += anno;
        return testo;
    }

    @Override
    public String toString() {
        String testo = "";
        testo = "Giorno: " + giorno + "\n"
                + "Mese: " + mese + "\n"
                + "Anno: " + anno + "\n";
        return testo;
    }

    public String aggiungiGiorni(int giorniDaAggiungere) {
        int giorno = this.giorno;
        int mese = this.mese;
        int anno = this.anno;
        giorno += giorniDaAggiungere; 
        while (giorno > giorniMesi[mese-1]) {
            giorno -= giorniMesi[mese-1];
            mese++;
            if (mese > 12) {
                mese = 1;
                anno++;
                setFebbraio(anno);
            }
        }
        return formattazione(giorno, mese, anno);
    }

    public String togliGiorni(int giorniDaTogliere) {
        int giorno = this.giorno;
        int mese = this.mese;
        int anno = this.anno;
        giorno -= giorniDaTogliere;
        while (giorno < 1) {
            giorno += giorniMesi[mese-1];
            mese--;
            if (mese < 1) {
                mese = 12;
                anno--;
                setFebbraio(anno);
            }
        }
        return formattazione(giorno, mese, anno);
    }
    
    public long diffData(DataCompleta d){
        LocalDate data1 = LocalDate.of(this.anno, this.mese, this.giorno);
        LocalDate data2 = LocalDate.of(d.anno, d.mese, d.giorno);
        return Math.abs(ChronoUnit.DAYS.between(data1, data2));
    }
}
