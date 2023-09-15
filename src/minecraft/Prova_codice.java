/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minecraft;

/**
 *
 * @author danilo.telch
 */
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Prova_codice {
    
  private final Timer timer = new Timer();
  private final Random random = new Random();

  public void scheduleRandomTask(int intervalInSeconds) {
    TimerTask task = new TimerTask() {
      @Override
      public void run() {
        // Genera un numero casuale tra 1 e 10
        int randomDelayInSeconds = random.nextInt(10) + 1;
        System.out.println("Esecuzione dell'attività casuale dopo " + randomDelayInSeconds + " secondi");
      }
    };

    // Avvia l'esecuzione dell'attività casuale ogni "intervalInSeconds" secondi
    timer.scheduleAtFixedRate(task, 0, intervalInSeconds * 1000);
  }

  public void stop() {
    timer.cancel();
  }

  public static void main(String[] args) {
   Prova_codice scheduler = new Prova_codice();
    scheduler.scheduleRandomTask(5); // Esegue l'attività casuale ogni 5 secondi
  }
}


