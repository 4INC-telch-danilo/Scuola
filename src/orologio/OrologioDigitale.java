package orologio;

public class OrologioDigitale extends Orologio {

    public enum Format {
        FORMATO_12H, FORMATO_24H
    };

    private Format formatoAttuale;

    public OrologioDigitale(int ora, int minuti, int secondi, Format formatoOra) throws Exception {
        super(ora, minuti, secondi);
        setFormatoOra(formatoOra);
    }

    public final void setFormatoOra(Format formatoOra) {
        this.formatoAttuale = formatoOra;
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
        return "OrologioDigitale\n" +
                "formato ora: " + ((formatoAttuale == Format.FORMATO_24H) ? "24H" : "12H") + "\n" +
                super.toString();
    }

}
