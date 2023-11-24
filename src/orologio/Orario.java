/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orologio;

/**
 *
 * @author danilo.telch
 */
public class Orario {
    private int ora;
    private int minuti;
    private int secondi;
    
    public Orario (int ora, int minuti, int secondi) {
        setOra(ora);
        setMinuti(minuti);
        setSecondi(secondi);
    }
    
    public Orario(Orario o){
        setOra(o.ora);
        setMinuti(o.minuti);
        setSecondi(o.secondi);
    }

    public final void setOra(int ora) {
        this.ora = ora;
    }

    public final void setMinuti(int minuti) {
        this.minuti = minuti;
    }

    public final void setSecondi(int secondi) {
        this.secondi = secondi;
    }

    public final int getOra() {
        return ora;
    }

    public final int getMinuti() {
        return minuti;
    }

    public final int getSecondi() {
        return secondi;
    }
    
    public int compare(Orario o) {
        int compare = -1;
        if (this.ora == o.ora && this.minuti == o.minuti && this.secondi == o.secondi) {
           compare = 0;
        }
        return compare;
    }
}
