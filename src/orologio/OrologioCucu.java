package orologio;

public class OrologioCucu extends Orologio {

    private boolean carillon;

    public OrologioCucu(int ora, int minuti, int secondi, boolean carillon) throws Exception {
        super(ora, minuti, secondi);
        this.carillon = carillon;
    }

    public final void setCarillon(boolean carillon) {
        this.carillon = carillon;
    }

    public void impostaCarillon(boolean carillon) {
        setCarillon(carillon);
    }

    @Override
    public String toString() {
        return "OrologioCucu:"
                + "\nCarillonAttivo: " + carillon
                + "\n" + super.toString();
    }
}
