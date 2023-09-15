/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package countdown;

/**
 *
 * @author danilo.telch
 */
public class Countdown {
    
    
    //information hiding, incapsulamento
    
    
    private int numeroDiPartenza;
    
    public Countdown(int numeroDiPartenza) {
        setNumeroDiPartenza(numeroDiPartenza);
    }
    
    public int getNumeroDiPartenza() {
        return numeroDiPartenza;
    }
    
    public final void setNumeroDiPartenza(int numeroDiPartenza) {
        if (numeroDiPartenza>=0)
        this.numeroDiPartenza=numeroDiPartenza;
    }
    
    public String stampa() {
        return "Il numero di partenza è: " + numeroDiPartenza;
    }
    
    public String conta() {
        String testo = "";
        int contatore = numeroDiPartenza;
        while (contatore >= 0) {
            testo += decodificaNumero(contatore) + "\n";
            contatore--;
        }
        return testo;      
    }
    
    private String decodificaNumero(int contatore) {
        String numero = "";        
        switch (contatore) {
            case 0:  numero = "  ******  \n" +
                              " **    ** \n" +
                              " **    ** \n" +
                              " **    ** \n" +
                              " **    ** \n" +
                              " **    ** \n" +
                              "  ******  \n" ;
                     break;
                     
            case 1:  numero = "   *** \n" +
                              "  **** \n" +
                              " ** ** \n" +
                              "    ** \n" +
                              "    ** \n" +
                              "    ** \n" +
                              "    ** \n" ;
                     break;
                     
            case 2:  numero = "  *********  \n" +
                              " *********** \n" +
                              " ***     *** \n" +
                              "       ***   \n" +
                              "     ***     \n" +
                              " *********** \n" +
                              " *********** \n" ;
                     break;
                     
            case 3:  numero = " *********  \n" +
                              " ********** \n" +
                              "         ** \n" +
                              " *********  \n" +
                              "         ** \n" +
                              " ********** \n" +
                              " *********  \n" ;
                     break;
                     
            case 4:  numero = "   ******* \n" +
                              "  ***   ** \n" +
                              " ***    ** \n" +
                              " ***    ** \n" +
                              " ********* \n" +
                              "       *** \n" +
                              "       *** \n" ;
                     break;
                     
            case 5:  numero = " *********** \n" +
                              " *********** \n" +
                              " ****        \n" +
                              " **********  \n" +
                              " *********** \n" +
                              "       ***** \n" +
                              " **********  \n" ;
                     break;
                     
            case 6:  numero = "   ********* \n" +
                              "  ****       \n" +
                              " ****        \n" +
                              " **********  \n" +
                              " ***      ** \n" +
                              " ***      ** \n" +
                              "  *********  \n" ;
                     break;
                     
            case 7:  numero = " *********** \n" +
                              " *********** \n" +
                              "       ***** \n" +
                              "      *****  \n" +
                              "     *****   \n" +
                              "    *****    \n" +
                              "   *****     \n" ;
                     break;
                     
            case 8:  numero = "  ********  \n" +
                              " **      ** \n" +
                              " **      ** \n" +
                              "  ********  \n" +
                              " **      ** \n" +
                              " **      ** \n" +
                              "  ********  \n" ;
                     break;
                     
            case 9:  numero = "  *******  \n" +
                              " **     ** \n" +
                              " **     ** \n" +
                              "  ******** \n" +
                              "      ***  \n" +
                              "     ***   \n" +
                              "    ***    \n" ;
                     break;
                     
            case 10: numero = "   ***   ******  \n" +
                              "  ****  **    ** \n" +
                              " ** **  **    ** \n" +
                              "    **  **    ** \n" +
                              "    **  **    ** \n" +
                              "    **  **    ** \n" +
                              "    **   ******  \n" ;
                     break;
                     
            default: numero += contatore;
        }
        return numero;
    }
    
}