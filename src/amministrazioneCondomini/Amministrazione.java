/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package amministrazioneCondomini;

/**
 *
 * @author danilo.telch
 */
public class Amministrazione {
    
    private Condominio[] condomini;
    
    public Amministrazione(Condominio[] c) {
        condomini = copia(c);
    }
    
    public Amministrazione(Amministrazione a){
        this.condomini = copia(a.condomini);
    }
    
    public String maxAppartamenti(){
        int pos = 0;
        for (int i = 1; i < condomini.length; i++){
            if(condomini[pos].numeroAppartamenti() < condomini[i].numeroAppartamenti())
                pos = i;
        }
        return condomini[pos].toString();
    }
    
    public String nominativoMillesimiMax() {
        String t = condomini[0].nominativoMillesimiMax() + "\n";
        for(int i = 1; i < condomini.length; i++){
            t += condomini[i].nominativoMillesimiMax() + "\n";
        }
        return t;
    }
    
    
    
    private Condominio[] copia(Condominio[] cond){
        Condominio[] temp = new Condominio[cond.length];
        for (int i = 0; i < cond.length; i++){
            temp[i] = cond[i];
        }
        return temp;
    }
}
