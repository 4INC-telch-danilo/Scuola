package indovinanumero;

public class IndovinaNumeroTest {

    public static void main(String[] args) {
        int n = 19;
        
        //String testoDaStampare;
        
        IndovinaNumero n1 = new IndovinaNumero(n);
        
        /*
        testoDaStampare = n1.stampa();
        
        System.out.println(testoDaStampare); 
        */
        System.out.println(n1.pensa());
        
        System.out.println(n1.stampa());
        
        System.out.println(n1.getNumPensato());
        
        
        
    }
    
}
