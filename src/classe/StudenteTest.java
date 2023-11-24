package aggregazione.studente_classe;

public class StudenteTest {

    public static void main(String[] args) {        
        try {
            Studente s = new Studente("De Lucia", "Ciccio Bello");
            s.setNome("Prova");
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }                                
    }    
}
