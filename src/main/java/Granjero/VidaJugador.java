package Granjero;

import Procesos.Vida;
import Vivo.SerVivo;
import static java.lang.Thread.interrupted;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author byron
 */
public class VidaJugador extends Thread {

      private int vida;
      private String nombre;
      private JLabel vidaJugadorJLabel;
      private Jugador jugador;
      private int decaimiento;
      private int boost;
      private JLabel monedasJLabel;
      private Inventario inventario;

      public VidaJugador(int vida, JLabel labelvidaJLabel, Jugador jugador, int decaimiento, JLabel monedasJLabel, Inventario inventario) {
            this.vidaJugadorJLabel = labelvidaJLabel;
            this.vida = vida;
            this.jugador = jugador;
            this.decaimiento = decaimiento;
            this.monedasJLabel = monedasJLabel;
            this.inventario = inventario;
      }

      public void incrementoVida(int increment) {
            this.boost += increment;

      }

      @Override
      public void run() {

            while (!interrupted()) {
                  int hp = jugador.getVidaSer();

                  if (hp >= 0) {
                        try {
                              hp -= 1;
                              //System.out.println(jugador.getVidaSer() + " de " + jugador.getNombre());
                              vidaJugadorJLabel.setText("" + jugador.getVidaSer());
                              monedasJLabel.setText(""+jugador.getMonedas());
                              inventario.actualizarInventario();
                              jugador.observadorVida(vidaJugadorJLabel, jugador.getVidaSer(), this);
                              jugador.setVidaSer(hp + boost);
                              boost = 0;
                              hp = jugador.getVidaSer();
                              Vida.sleep(decaimiento);
                        } catch (InterruptedException e) {
                              jugador.observadorVida(vidaJugadorJLabel, jugador.getVidaSer(), this);
                              hp = jugador.getVidaSer();
                               JOptionPane.showMessageDialog(null, "Ya no puede seguir jugando");
                              interrupted();
                        }
                  }
            }
           
      }
      
}
