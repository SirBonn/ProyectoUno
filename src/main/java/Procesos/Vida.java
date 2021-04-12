package Procesos;

import javax.swing.JLabel;
import Vivo.*;

public class Vida extends Thread {

      private int vida;
      private String nombre;
      private JLabel vidaJugadorJLabel;
      private SerVivo serVivo;
      private int decaimiento;
      private int boost;

      public Vida(int vida, JLabel labelvidaJLabel, SerVivo serVivo, int decaimiento) {
            this.vidaJugadorJLabel = labelvidaJLabel;
            this.vida = vida;
            this.serVivo = serVivo;
            this.decaimiento = decaimiento;
      }

      public void incrementoVida(int increment) {
            this.boost += increment;

      }

      @Override
      public void run() {

            while (!interrupted()) {
                  int hp = serVivo.getVidaSer();
                  
                  if (hp >= 0) {
                        hp-=1;
                        System.out.println(serVivo.getVidaSer() + " de " + serVivo.getNombre());
                        vidaJugadorJLabel.setText("" + serVivo.getVidaSer());
                        serVivo.observadorVida(vidaJugadorJLabel, serVivo.getVidaSer(), this);
                        serVivo.setVidaSer(hp + boost);
                  
                        try {
                              hp = serVivo.getVidaSer();
                              Vida.sleep(decaimiento);
                        } catch (InterruptedException e) {
                              serVivo.observadorVida(vidaJugadorJLabel, serVivo.getVidaSer(), this);
                              hp = serVivo.getVidaSer();
                              interrupted();
                        }
                  }
            }
      }

      public int getVida() {
            return vida;
      }

      public void setVida(int vida) {
            this.vida = vida;
      }

}
