package aggregazione.studente_classe;

import java.util.Arrays;

public class Classe {
    private Studente   capoClasse;
    private Studente[] studenti;

    public Classe(Studente capoClasse, Studente[] studenti) {
        setCapoClasse(capoClasse);
        setStudenti(studenti);
    }
    
    public Studente getCapoClasse() {        
        //return capoClasse; //aggregazione lasca
        
        //se non ci fosse il costruttore di copia
        //Studente temp = new Studente(capoClasse.getCognome(), capoClasse.getNome());
        
        //utilizzando il costruttore di copia         
        Studente temp = new Studente(capoClasse); //aggregazione stretta
        
        return temp;
    }

    public final void setCapoClasse(Studente capoClasse) {        
        Studente temp = new Studente(capoClasse);
        this.capoClasse = temp;       
    }

    public Studente[] getStudenti() {
        //return studenti; //aggregazione lasca
        
        //return studenti.clone(); non funziona perchè il metodo clone non è ridefinito
        
        //aggregazione stretta
        Studente[] temp = new Studente[studenti.length];                            
        
        for (int i = 0; i < temp.length; i++) {
            temp[i] = new Studente(studenti[i]); //attenzione qui! anche degli oggetti deve essere creata una nuova istanza
        }
        
        return temp;        
    }

    public final void setStudenti(Studente[] studenti) {
        
        //poichè si ripete la stessa operazione del metodo get potrebbe essere creato un metodo privato per la copia del vettore
        Studente[] temp = new Studente[studenti.length];                            
        
        for (int i = 0; i < temp.length; i++) {
            temp[i] = new Studente(studenti[i]);            
        }
        
        this.studenti = temp;
    }
    
    public void invertiAttributi() throws Exception{
        String tempCapoClasse;
        String tempStudenti;
        
        tempCapoClasse = capoClasse.getCognome();
        capoClasse.setCognome(capoClasse.getNome());
        capoClasse.setNome(tempCapoClasse);
        
      //for (int i=0; i < studenti.length; i++){
        for (Studente studenti1 : studenti) {
            tempStudenti = studenti1.getCognome();
            studenti1.setCognome(studenti1.getNome());
            studenti1.setNome(tempStudenti);
        }
    }
    
    public void ordinaStudenti() throws Exception {        
        Studente temp;
        
        for(int i=0; i<studenti.length-1; i++)                  
            for(int j=i+1; j<studenti.length; j++)
                if(studenti[i].getNome().charAt(0) > studenti[j].getNome().charAt(0)){
                    temp = studenti[i];
                    studenti[i] = studenti[j];
                    studenti[j] = temp;
                }           
    }

    @Override
    public String toString() {
        return capoClasse.toString() + "\n" + Arrays.toString(studenti) + "\n";
    }        
}
