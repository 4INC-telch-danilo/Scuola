/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package valoriCansole;

/**
 *
 * @author danilo.telch
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class battaglianavale extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;

    private JPanel pnlGame, pnlButtons;
    private JButton[][] btnGrid;
    private int[][] shipGrid;
    private int shipsRemaining;

    public battaglianavale() {
        super("Battaglia Navale");

        pnlGame = new JPanel(new GridLayout(10, 10));
        pnlButtons = new JPanel(new BorderLayout());
        pnlButtons.setBackground(Color.WHITE);

        btnGrid = new JButton[10][10];
        shipGrid = new int[10][10];
        shipsRemaining = 5;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                btnGrid[i][j] = new JButton();
                btnGrid[i][j].setActionCommand(i + "," + j);
                btnGrid[i][j].addActionListener(this);
                pnlGame.add(btnGrid[i][j]);
            }
        }

        pnlButtons.add(new JLabel("Navi rimanenti: " + shipsRemaining), BorderLayout.WEST);

        generateShips();

        add(pnlGame, BorderLayout.CENTER);
        add(pnlButtons, BorderLayout.SOUTH);

        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void generateShips() {
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            int x = rand.nextInt(10);
            int y = rand.nextInt(10);
            if (shipGrid[x][y] == 0) {
                shipGrid[x][y] = 1;
            } else {
                i--;
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String[] coordinates = e.getActionCommand().split(",");
        int x = Integer.parseInt(coordinates[0]);
        int y = Integer.parseInt(coordinates[1]);

        if (shipGrid[x][y] == 1) {
            btnGrid[x][y].setBackground(Color.RED);
            shipGrid[x][y] = 0;
            shipsRemaining--;
            pnlButtons.removeAll();
            pnlButtons.add(new JLabel("Navi rimanenti: " + shipsRemaining), BorderLayout.WEST);
            pnlButtons.revalidate();
            pnlButtons.repaint();
        } else {
            btnGrid[x][y].setBackground(Color.BLUE);
        }

        btnGrid[x][y].setEnabled(false);

        if (shipsRemaining == 0) {
            JOptionPane.showMessageDialog(this, "Hai vinto!");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new battaglianavale();
    }

}

