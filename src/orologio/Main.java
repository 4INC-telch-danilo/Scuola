package orologio;

import orologio.OrologioDigitale.Format;

public class Main {
    public static void main(String[] args) {
        try {
            Orologio orologio = new Orologio(5, 80, 15);

            orologio.impostaOrologio(6, 7, 8);
            orologio.setOra(7);
            orologio.setMinuti(8);
            orologio.setSecondi(9);

            System.out.println(orologio.dammiOrario());
            System.out.println(orologio.getSecondi());
            System.out.println(orologio.getMinuti());
            System.out.println(orologio.getOra());
            System.out.println(orologio);

            OrologioCucu orologioCucu = new OrologioCucu(5, 6, 7, false);
            orologioCucu.setSecondi(6);
            orologioCucu.setMinuti(7);
            orologioCucu.setOra(8);
            orologioCucu.impostaOrologio(7, 8, 9);
            orologioCucu.impostaCarillon(true);
            orologioCucu.setCarillon(false);
            System.out.println(orologioCucu.dammiOrario());
            System.out.println(orologioCucu.getSecondi());
            System.out.println(orologioCucu.getMinuti());
            System.out.println(orologioCucu.getOra());
            System.out.println(orologioCucu);

            OrologioDigitale orologioDigitale = new OrologioDigitale(5, 6, 7, Format.FORMATO_24H);
            orologioDigitale.setSecondi(6);
            orologioDigitale.setMinuti(7);
            orologioDigitale.setOra(8);
            orologioDigitale.impostaOrologio(7, 8, 9);
            orologioDigitale.setFormatoOra(Format.FORMATO_12H);
            System.out.println(orologioDigitale.dammiOrario());
            System.out.println(orologioDigitale.getSecondi());
            System.out.println(orologioDigitale.getMinuti());
            System.out.println(orologioDigitale.getOra());
            System.out.println(orologioDigitale);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}