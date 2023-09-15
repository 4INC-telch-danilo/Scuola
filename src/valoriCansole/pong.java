/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package valoriCansole;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
/**
 *
 * @author danilo.telch
 */


    /**
     * @param args the command line arguments
     */


public class pong extends JPanel implements ActionListener, KeyListener {

    private static final int WIDTH = 600;
    private static final int HEIGHT = 400;
    private static final int PADDLE_WIDTH = 10;
    private static final int PADDLE_HEIGHT = 80;
    private static final int BALL_SIZE = 10;
    private static final int PADDLE_SPEED = 10;
    private static final int BALL_SPEED = 3;
    private static final int TIMER_DELAY = 20;

    private int paddle1Y;
    private int paddle2Y;
    private int ballX;
    private int ballY;
    private int ballDeltaX;
    private int ballDeltaY;
    private int player1Score;
    private int player2Score;

    private Timer timer;

    public pong() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.BLACK);
        addKeyListener(this);

        paddle1Y = HEIGHT / 2 - PADDLE_HEIGHT / 2;
        paddle2Y = HEIGHT / 2 - PADDLE_HEIGHT / 2;
        ballX = WIDTH / 2 - BALL_SIZE / 2;
        ballY = HEIGHT / 2 - BALL_SIZE / 2;
        ballDeltaX = BALL_SPEED;
        ballDeltaY = BALL_SPEED;
        player1Score = 0;
        player2Score = 0;

        timer = new Timer(TIMER_DELAY, this);
        timer.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        g.fillRect(0, paddle1Y, PADDLE_WIDTH, PADDLE_HEIGHT);
        g.fillRect(WIDTH - PADDLE_WIDTH, paddle2Y, PADDLE_WIDTH, PADDLE_HEIGHT);
        g.fillOval(ballX, ballY, BALL_SIZE, BALL_SIZE);
        g.drawString("Player 1: " + player1Score, 10, 20);
        g.drawString("Player 2: " + player2Score, WIDTH - 80, 20);
    }

    public void actionPerformed(ActionEvent e) {
        movePaddles();
        moveBall();
        checkCollisions();
        repaint();
    }

    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                paddle2Y -= PADDLE_SPEED;
                break;
            case KeyEvent.VK_DOWN:
                paddle2Y += PADDLE_SPEED;
                break;
            case KeyEvent.VK_W:
                paddle1Y -= PADDLE_SPEED;
                break;
            case KeyEvent.VK_S:
                paddle1Y += PADDLE_SPEED;
                break;
        }
    }

    public void keyReleased(KeyEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }

    private void movePaddles() {
        if (paddle1Y < 0) {
            paddle1Y = 0;
        } else if (paddle1Y + PADDLE_HEIGHT > HEIGHT) {
            paddle1Y = HEIGHT - PADDLE_HEIGHT;
        }
        if (paddle2Y < 0) {
            paddle2Y = 0;
        } else if (paddle2Y + PADDLE_HEIGHT > HEIGHT) {
             paddle2Y = HEIGHT - PADDLE_HEIGHT;
        }
    }

private void moveBall() {
    ballX += ballDeltaX;
    ballY += ballDeltaY;
}

private void checkCollisions() {
    if (ballY <= 0 || ballY + BALL_SIZE >= HEIGHT) {
        ballDeltaY = -ballDeltaY;
    }
    if (ballX <= 0) {
        player2Score++;
        resetBall();
    } else if (ballX + BALL_SIZE >= WIDTH) {
        player1Score++;
        resetBall();
    }
    if (ballX <= PADDLE_WIDTH && ballY + BALL_SIZE >= paddle1Y && ballY <= paddle1Y + PADDLE_HEIGHT) {
        ballDeltaX = -ballDeltaX;
    }
    if (ballX + BALL_SIZE >= WIDTH - PADDLE_WIDTH && ballY + BALL_SIZE >= paddle2Y && ballY <= paddle2Y + PADDLE_HEIGHT) {
        ballDeltaX = -ballDeltaX;
    }
}

private void resetBall() {
    ballX = WIDTH / 2 - BALL_SIZE / 2;
    ballY = HEIGHT / 2 - BALL_SIZE / 2;
    ballDeltaX = BALL_SPEED;
    ballDeltaY = BALL_SPEED;
}

    public static void main(String[] args) {
    JFrame frame = new JFrame("Pong");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pong pong = new pong();
    frame.getContentPane().add(pong);
    frame.pack();
    frame.setVisible(true);
    pong.requestFocusInWindow();
    }
}

