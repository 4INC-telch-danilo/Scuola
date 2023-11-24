package aggregazione.studente_classe;

public class AggregazioneTest {
    public static void main(String[] args) {
        try{
            Studente capoClasse = new Studente("Cognome", "Nome");

            Studente s1 = new Studente("A Cognome", "A Nome");
            Studente s2 = new Studente("B Cognome", "B Nome");

            Studente[] studenti = {s2, s1};               

            Classe c = new Classe(capoClasse, studenti);

            System.out.println("Attributi della classe Classe prima di inverti");
            System.out.println(c.toString());
            
            c.invertiAttributi();
            c.ordinaStudenti();
            
            System.out.println("Attributi della classe Classe dopo di inverti e ordina");
            System.out.println(c.toString());

            System.out.println("Attributi della classe Studente");
            System.out.println(capoClasse.toString());
            System.out.println(s1.toString());
            System.out.println(s2.toString());
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }    
}
