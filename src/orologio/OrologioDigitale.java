package orologio;

enum Format {
        FORMATO_12H, FORMATO_24H
}

public class OrologioDigitale extends Orologio {

    private Format formatoAttuale;

    public OrologioDigitale(int ora, int minuti, int secondi, Format formatoOra) throws Exception {
        super(ora, minuti, secondi);
        try {
            setFormatoOra(formatoOra);
        } catch (Exception e) {
            setFormatoOra(Format.FORMATO_24H);            
        }
    }

    public final void setFormatoOra(Format formatoOra) throws Exception {
        if (formatoOra != null) {
            this.formatoAttuale = formatoOra;
        } else {
            throw new Exception();
        }
        
    }

    @Override
    public String dammiOrario() {
        String orario = "";
        if (formatoAttuale == Format.FORMATO_24H) {
            orario = super.dammiOrario();
        } else {
            if (getOra() < 12) {
                orario = super.dammiOrario() + " AM";
            } else {
                int ora = getOra() - 12 * (getOra() / 13);
                orario = ora + ":" + getMinuti() + ":" + getSecondi() + " PM";
            }
        }
        return orario;
    }

    @Override
    public String toString() {
        return  "OrologioDigitale\n" +
                "formato ora: " + ((formatoAttuale == Format.FORMATO_24H) ? "24H" : "12H") + "\n" +
                super.toString();
    }

}