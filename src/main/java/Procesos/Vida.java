
package Procesos;


import javax.swing.JLabel;
import Vivo.*;

public class Vida extends Thread{
      
      private int vida;
      private String nombre;
      private JLabel vidaJugadorJLabel;
      private SerVivo serVivo;
      private int decaimiento;
      
      public Vida( int vida, JLabel labelvidaJLabel, SerVivo serVivo, int decaimiento) {
            this.vidaJugadorJLabel = labelvidaJLabel;
            this.vida = vida;
            this.serVivo = serVivo;
            this.decaimiento = decaimiento;
      }
      
      @Override
      public void run(){
            int hp = this.vida;
            for (int i = 0; i <= 100; i++) {
                  vida = hp - i;
                  System.out.println(vida +" de " +serVivo.getNombre());
                  vidaJugadorJLabel.setText(""+vida);
                  serVivo.setVida(getVida());
                  serVivo.observadorVida(vidaJugadorJLabel);
                  try {
                        Vida.sleep(decaimiento);
                  } catch (InterruptedException e) {
                        System.out.println("Error en el conteo de vida de: " +nombre);
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
