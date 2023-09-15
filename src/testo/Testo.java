/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testo;

/**
 *
 * @author danilo.telch
 */
public class Testo {
    private char[] messaggioCriptato;
    private String caratteri;

    public Testo(String messaggio) {
        this.messaggioCriptato = criptaMessaggio(messaggio);
	 caratteri = "bcdfghjklmnpqrstvwyzaeiou0123456789";
    }

    public String getMessaggio() {
        String t = "";
        for (int i = 0; i < messaggioCriptato.length; i++) {
            t += messaggioCriptato[i];
        }
        return t;
    }

    private char[] criptaMessaggio(String messaggio) {
        char[] messaggioChar = messaggio.toCharArray();
        for (int i = 0; i < messaggio.length(); i++) {
            if (Character.isUpperCase(messaggioChar[i])) {
                messaggioChar[i] = Character.toUpperCase(cripta(messaggioChar[i]));
            } else {
                messaggioChar[i] = cripta(messaggioChar[i]);
            }
        }
        return messaggioChar;
    }

    private char cripta(char c) {

        if (Character.isAlphabetic(c)) {
            c = Character.toLowerCase(c);

            if (vocale(c)) {
                int cont = 20;
                while (c != caratteri.charAt(cont)) {
                    cont++;

                }
                if (cont == 24) {
                    c = caratteri.charAt(20);
                } else {
                    c = caratteri.charAt(cont + 1);
                }

            } else {
                int cont = 0;
                while (c != caratteri.charAt(cont)) {
                    cont++;

                }
                if (cont == 19) {
                    c = caratteri.charAt(0);
                } else {
                    c = caratteri.charAt(cont + 1);
                }

            }
        } else {

            if (Character.isDigit(c)) {
                int cont = 25;
                while (c != caratteri.charAt(cont)) {
                    cont++;

                }
                if (cont == caratteri.length() - 1) {
                    c = caratteri.charAt(25);
                } else {
                    c = caratteri.charAt(cont + 1);
                }
            }

        }
        return c;
    }

    private boolean vocale(char c) {
        return (c == 97 || c == 101 || c == 105 || c == 111 || c == 117);

    }

}
