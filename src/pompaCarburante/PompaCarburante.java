/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pompaCarburante;

/**
 *
 * @author danilo.telch
 */
public class PompaCarburante {
    private String nomeDistributore;
    private double prezzoCarburante;   //  euro/litri
    private double capacitaCisterna;   //  litri
    private double carburanteVenduto;  //  litri

    public PompaCarburante(String nomeDistributore, double prezzoCarburante, int capacitaCisterna, int carburanteVenduto) {
        this.nomeDistributore = nomeDistributore;
        this.prezzoCarburante = prezzoCarburante;
        this.capacitaCisterna = capacitaCisterna;
        this.carburanteVenduto = carburanteVenduto;
    }
    
    public String stampa(){
        return "PompaCarburante:\nnomeDistributore = " + nomeDistributore
               + "\nprezzoCarburante = " + prezzoCarburante + "\ncapacitaCisterna = "
               + capacitaCisterna + "\ncarburanteVenduto = " + carburanteVenduto;
    }
    
    
    public double riempireCis(){
        return carburanteVenduto;
    }
    
    public double carbRim(){
        return capacitaCisterna - carburanteVenduto;
    }
    
    public double valoreRim(){
        return carbRim()*prezzoCarburante;
    }
    
    public double importoPieno(){
        return capacitaCisterna*prezzoCarburante;
    }
    

}
