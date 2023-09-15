/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package valoriCansole;

/**
 *
 * @author danilo.telch
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CampoMinato extends JFrame implements ActionListener {
    private int righe = 10;
    private int colonne = 10;
    private int bombe = 10;
    private JButton[][] celle = new JButton[righe][colonne];
    private boolean[][] bombePosizionate = new boolean[righe][colonne];
    private boolean[][] celleScoperte = new boolean[righe][colonne];
    private JPanel campo = new JPanel(new GridLayout(righe, colonne));

    public CampoMinato() {
        setTitle("Campo Minato");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setResizable(false);
        setLocationRelativeTo(null);

        for (int i = 0; i < righe; i++) {
            for (int j = 0; j < colonne; j++) {
                celle[i][j] = new JButton();
                celle[i][j].addActionListener(this);
                campo.add(celle[i][j]);
            }
        }

        getContentPane().add(campo, BorderLayout.CENTER);

        posizionaBombe();

        setVisible(true);
    }

    private void posizionaBombe() {
        int posizionate = 0;
        while (posizionate < bombe) {
            int x = (int) (Math.random() * righe);
            int y = (int) (Math.random() * colonne);
            if (!bombePosizionate[x][y]) {
                bombePosizionate[x][y] = true;
                posizionate++;
            }
        }
    }

    private void rivelacelle() {
        for (int i = 0; i < righe; i++) {
            for (int j = 0; j < colonne; j++) {
                if (bombePosizionate[i][j]) {
                    celle[i][j].setText("*");
                } else {
                    int vicino = contaVicini(i, j);
                    if (vicino > 0) {
                        celle[i][j].setText(Integer.toString(vicino));
                    }
                }
            }
        }
    }

    private int contaVicini(int x, int y) {
        int vicini = 0;
        for (int i = x - 1; i <= x + 1; i++) {
            for (int j = y - 1; j <= y + 1; j++) {
                if (i >= 0 && i < righe && j >= 0 && j < colonne) {
                    if (bombePosizionate[i][j]) {
                        vicini++;
                    }
                }
            }
        }
        return vicini;
    }

    private void vittoria() {
        JOptionPane.showMessageDialog(this, "Hai vinto!");
        System.exit(0);
    }

    private void sconfitta() {
        JOptionPane.showMessageDialog(this, "Hai perso!");
            System.exit(0);
}

@Override
public void actionPerformed(ActionEvent e) {
    JButton pulsante = (JButton) e.getSource();
    int x = -1;
    int y = -1;

    // Trova la posizione del pulsante nella matrice di bottoni
    for (int i = 0; i < righe; i++) {
        for (int j = 0; j < colonne; j++) {
            if (celle[i][j] == pulsante) {
                x = i;
                y = j;
                break;
            }
        }
    }

    if (bombePosizionate[x][y]) {
        pulsante.setText("*");
        sconfitta();
    } else {
        int vicino = contaVicini(x, y);
        if (vicino > 0) {
            pulsante.setText(Integer.toString(vicino));
        } else {
            espandiVicini(x, y);
        }
        celleScoperte[x][y] = true;
        if (contaScoperte() == righe * colonne - bombe) {
            vittoria();
        }
    }
}

private void espandiVicini(int x, int y) {
        for (int i = x - 1; i <= x + 1; i++) {
            for (int j = y - 1; j <= y + 1; j++) {
                if (i >= 0 && i < righe && j >= 0 && j < colonne) {
                    if (!celleScoperte[i][j]) {
                        int vicino = contaVicini(i, j);
                        celleScoperte[i][j] = true;
                        if (vicino > 0) {
                            celle[i][j].setText(Integer.toString(vicino));
                        } else {
                            espandiVicini(i, j);
                        }
                    }
                }
            }
        }
    }


private int contaScoperte() {
    int scoperte = 0;
    for (int i = 0; i < righe; i++) {
        for (int j = 0; j < colonne; j++) {
            if (celleScoperte[i][j]) {
                scoperte++;
            }
        }
    }
    return scoperte;
}

public static void main(String[] args) {
    new CampoMinato();
    
}
}

