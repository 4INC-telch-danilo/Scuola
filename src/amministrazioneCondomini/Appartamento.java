/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package amministrazioneCondomini;

/**
 *
 * @author danilo.telch
 */
public class Appartamento {
    
    private String nominativoProprietario;
    private double millesimi;
    private int numeroApp;
    
    public Appartamento(String nominativo, double millesimi, int numeroApp){
        this.nominativoProprietario = nominativo;
        this.millesimi = millesimi;
        this.numeroApp = numeroApp;
    }
    
    public Appartamento(Appartamento appart){
        this.nominativoProprietario = appart.nominativoProprietario;
        this.millesimi = appart.millesimi;
        this.numeroApp = appart.numeroApp;
    }

    public double getMillesimi() {
        return millesimi;
    }

    public String getNominativoProprietario() {
        return nominativoProprietario;
    }

    public int getNumeroApp() {
        return numeroApp;
    }

    public void setNominativoProprietario(String nominativoProprietario) {
        this.nominativoProprietario = nominativoProprietario;
    }

    public String toString() {
        return "nominativo proprietario: " + nominativoProprietario+ "\n" +
               "millesimi: " + millesimi + "\n" +
               "numero appartamento: " + numeroApp + "\n";
    }
}
