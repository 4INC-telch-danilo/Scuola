package classe;

public class ClasseTest {

    public static void main(String[] args) {
        Studente test2 = null;
        Studente test3 = null;
        try {
            Studente test = new Studente("Giacomo Antonio", "Calo'");
            Studente test1 = new Studente("Gianluca", "Fortarel");
            test2 = new Studente("Luca", "Goller");
            test3 = new Studente("Danilo", "Telch");

            Studente[] st = { test3, test2, test1, test };
            Classe cl = new Classe(test3, st);
            cl.ordinaStudenti();

            System.out.println(cl);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

}
