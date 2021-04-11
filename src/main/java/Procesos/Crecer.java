
package Procesos;

import Vivo.SerVivo;
import javax.swing.JButton;

public class Crecer extends Thread {
      
      private JButton botonpulsado;
      private int velocidadcrecimiento;
      private SerVivo serVivo;

      public Crecer(JButton botonpulsado, int velocidadcrecimiento, SerVivo serVivo) {
            this.botonpulsado = botonpulsado;
            this.velocidadcrecimiento = velocidadcrecimiento;
            this.serVivo = serVivo;
      }
      
      @Override
      public void run (){
            int edad = 0;
            for (int i = 0; i < 5; i++) {
                  edad = i;
                  System.out.println("edad ahora: " + edad);
                  serVivo.setEdadSer(i);
                  serVivo.observadorCrecimiento(i, "nuevoslñdka");
                  try {
                        Vida.sleep(velocidadcrecimiento);
                  } catch (InterruptedException e) {
                        System.out.println("Error en el conteo de vida de: nuevoslñdka" );
                  }
            }
      }
}
