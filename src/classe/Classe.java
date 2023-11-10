package classe;

public class Classe {
    private Studente capoClasse;
    private Studente[] studenti;

    public Classe(Studente capoClasse, Studente[] studenti) throws Exception {
        this.studenti = new Studente[studenti.length];
        for (int i = 0; i < studenti.length; i++) {
            this.studenti[i] = new Studente(studenti[i]);
        }
        setCapoClasse(capoClasse);
    }

    public void setCapoClasse(Studente capoClasse) throws Exception {
        try {
            int i = 0;
            while (!(capoClasse.getCognome().isEmpty() && capoClasse.getCognome().isEmpty()) && i < studenti.length) {
                if (capoClasse.getNome().equals(studenti[i].getNome())
                        && studenti[i].getCognome().equals(studenti[i].getCognome())) {
                    this.capoClasse = capoClasse;
                }
                i++;
            }

            if (this.capoClasse == null) {
                throw new Exception("il capo classe non è presente nella classe");
            }

        } catch (Exception e) {
            throw e;
        }
    }

    public void inveriAtt(int posizione) throws Exception {
        try {
            String cognome = studenti[posizione].getNome();
            String nome = studenti[posizione].getCognome();
            studenti[posizione].setCognome(cognome);
            studenti[posizione].setNome(nome);
        } catch (IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException("Posizione errata");
        }
    }

    public void ordinaStudenti() {
        int n = studenti.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (studenti[j].getCognome().compareTo(studenti[j + 1].getCognome()) > 0) {
                    // Scambia arr[j] con arr[j+1]
                    Studente temp = studenti[j];
                    studenti[j] = studenti[j + 1];
                    studenti[j + 1] = temp;
                }
            }
        }
    }

    @Override
    public String toString() {
        String r = "capo Classe: " + capoClasse + "\n";
        for (int i = 0; i < studenti.length; i++) {
            r += "studenti[" + i + "]:" + studenti[i].toString() + "\n";
        }
        return r;
    }
}
