package aggregazione.studente_classe;

public class Studente {
    private String cognome;
    private String nome;

    public Studente(String cognome, String nome) throws Exception {
        setCognome(cognome);
        setNome(nome);
    }

    public Studente(Studente studente) {
        this.cognome = studente.cognome;
        this.nome    = studente.nome;
    }

    public String getCognome() {
        return cognome;
    }

    public final void setCognome(String cognome) throws Exception {
        if (cognome == null) {
            throw new Exception("L'attributo cognome non può essere nullo!");
        }

        if (cognome.equals("")) {
            throw new Exception("L'attributo cognome non può essere vuoto!");
        }

        String[] cognomi = cognome.split(" ");

        for (int i = 0; i < cognomi.length; i++) {
            if ((int) cognomi[i].charAt(0) < 65 || (int) cognomi[i].charAt(0) > 90) {
                throw new Exception("L'attributo cognome deve avere le iniziali maiuscole!");
            }

            for (int j = 1; j < cognomi[i].length(); j++) {
                if ((int) cognomi[i].charAt(j) < 97 || (int) cognomi[i].charAt(j) > 122) {
                    throw new Exception("L'attributo cognome non deve contenere caratteri speciali e solo le iniziali maiuscole!");
                }
            }
        }

        this.cognome = cognome.trim();
    }

    public String getNome() {
        return nome;
    }
    
    public final void setNome(String nome) throws Exception {
        controlloStringa(nome);  //se viene sollevata un'eccezione la riga successiva non viene eseguita
        this.nome = nome;
    }

    // Cosa manca? apostrofo e caratteri accentati
    private void controlloStringa(String testo) throws Exception { //non è necesseraio che questo metodo restituisca un boolen se prevista la gestione delle eccezioni
        try {                        
            if (testo.equals(""))
                throw new MyException("L'attributo non può essere vuoto!");            

            String[] testi = testo.split(" ");

            for (int i = 0; i < testi.length; i++) {
                // controllo del primo carattere maiuscolo
                if ((int) testi[i].charAt(0) < 65 || (int) testi[i].charAt(0) > 90) {
                    throw new MyException("L'attributo deve avere le iniziali maiuscole!");
                }

                // controllo dei successivi caratteri minuscoli
                for (int j = 1; j < testi[i].length(); j++) {
                    if ((int) testi[i].charAt(j) < 97 || (int) testi[i].charAt(j) > 122) {
                        throw new MyException("L'attributo non deve contenere caratteri speciali e solo le iniziali maiuscole!");
                    }
                }
            }
            
            testo = testo.trim(); //il metodo trim() della classe String elimina gli spazi all'inizio e alla fine della stringa
            
        } catch (NullPointerException e){
            throw new NullPointerException /*oppure Exception*/ ("L'attributo non può essere null");
        } catch (StringIndexOutOfBoundsException e) {
            throw new StringIndexOutOfBoundsException /*oppure Exception*/ ("Non è consentito l'utilizzo di più di uno spazio!");
        } 
    }
    
    @Override
    public String toString() {
        return "[" + cognome + " " + nome + "]";
    }
}

// -----------------------------------------------------------------------------
class MyException extends Exception {    
    public MyException(String message) {
        super(message);
    }
}
