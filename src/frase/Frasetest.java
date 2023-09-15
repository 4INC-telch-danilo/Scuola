package frase;

public class Frasetest {
    public static void main(String[] args) {
        String [] a = {"oggi", "ho", "fatto", "la", "Verifica"};
        Frase ax = new Frase(a);

        System.out.println(ax.stampa());
        System.out.println(ax.nCaratteri());
        //Le posizioni partono dalla 0 e arrivano alla lunghezza -1
        ax.spostamento(0, 1);
        ax.spostamento(0, 2);
        ax.spostamento(0, 3);
        ax.spostamento(0, 4);
        ax.spostamento(1, 0);
        ax.spostamento(1, 2);
        ax.spostamento(1, 3);
        ax.spostamento(1, 4);
        ax.spostamento(2, 0);
        ax.spostamento(2, 1);
        ax.spostamento(2, 3);
        ax.spostamento(2, 4);
        ax.spostamento(3, 0);
        ax.spostamento(3, 1);
        ax.spostamento(3, 2);
        ax.spostamento(3, 4);
        ax.spostamento(4, 0);
        ax.spostamento(4, 1);
        ax.spostamento(4, 2);
        ax.spostamento(4, 3);


//      System.out.println(ax.spostamento(4, 0));
        System.out.println(ax.stampa());
//        System.out.println(ax.inserimento("Io", 1));
//        System.out.println(ax.cancellazione(0));
//        a = ax.getParole();
//        for (int i = 0; i < a.length; i++)
//            System.out.println(a[i]);
//        System.out.println(ax.stampa());
    }
}



