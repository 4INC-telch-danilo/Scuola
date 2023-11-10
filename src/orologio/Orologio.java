package orologio;

public class Orologio {
    private int ora;
    private int minuti;
    private int secondi;

    public Orologio(int ora, int minuti, int secondi) throws Exception {
        try {
            setOra(ora);
            setMinuti(minuti);
            setSecondi(secondi);
        } catch (Exception e) {
            provaConversione(ora, minuti, secondi);
        }
    }

    public final int getOra() {
        return ora;
    }

    public final int getMinuti() {
        return minuti;
    }

    public final int getSecondi() {
        return secondi;
    }

    public final void setOra(int ora) throws Exception {
        if (ora >= 0 && ora <= 23) {
            this.ora = ora;
        } else {
            throw new Exception("L'ora non puo' essere minori di 0 e maggiori di 59");
        }

    }

    public final void setMinuti(int minuti) throws Exception {
        if (minuti >= 0 && minuti <= 59) {
            this.minuti = minuti;
        } else {
            throw new Exception("I minuti non posso essere minori di 0 e maggiori di 59");
        }
    }

    public final void setSecondi(int secondi) throws Exception {
        if (secondi >= 0 && secondi <= 59) {
            this.secondi = secondi;
        } else {
            throw new Exception("I secondi non posso essere minori di 0 e maggiori di 59");
        }
    }

    public void impostaOrologio(int ora, int minuti, int secondi) throws Exception {
        setOra(ora);
        setMinuti(minuti);
        setSecondi(secondi);
    }

    public String dammiOrario() {
        return ora + ":" + minuti + ":" + secondi;
    }

    public String toString() {
        return "Orologio:"
                + "\nOra: " + ora
                + "\nMinuti: " + minuti
                + "\nSecondi: " + secondi;
    }

    private void provaConversione(int ora, int minuti, int secondi) throws Exception {
        if (secondi < 0 || ora < 0 || minuti < 0) {
            throw new Exception("I secondi, i minuti e le ore non posso essere minori di 0");
        } else {
            if (secondi > 59) {
                minuti += secondi / 60;
                secondi %= 60;
            }
            if (minuti > 59) {
                ora += minuti / 60;
                minuti %= 60;
            }
            if (ora > 24) {
                ora -= 24;
            }
            this.secondi = secondi;
            this.minuti = minuti;
            this.ora = ora;
        }
    }
}
