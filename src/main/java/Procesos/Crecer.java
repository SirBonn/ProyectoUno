package Procesos;

import Terrenos.SuperficieTerreno;
import Vivo.SerVivo;
import Vivo.planta;
import javax.swing.JLabel;

public class Crecer extends Thread {

      private SuperficieTerreno botonpulsado;
      private int velocidadcrecimiento;
      private SerVivo serVivo;
      private planta planta;
      private JLabel edadJLabel;
      private JLabel imagenEdad;
      private int increment;
      private Vida vida;

      public Crecer(int velocidadcrecimiento, SerVivo serVivo1, SerVivo serVivo, JLabel edadJLabel, JLabel imagenEdad, Vida vida) {
            this.velocidadcrecimiento = velocidadcrecimiento;
            this.serVivo = serVivo;
            this.edadJLabel = edadJLabel;
            this.imagenEdad = imagenEdad;
            this.vida = vida;
            this.serVivo =  serVivo;
      }

      public void incrementoedad(int increment) {
            this.increment += increment;

      }

      @Override
      public void run() {
            
            while (!interrupted()) {
                  
                  int edad = serVivo.getEdadSer();
                  for (int i = edad+1; i < 5; i++) {

                        serVivo.observadorCrecimiento(serVivo.getEdadSer(), serVivo, serVivo.getNombre(), edadJLabel, imagenEdad, this, vida);
                        try {
                              
                              serVivo.setEdadSer((i) + increment);
                              edadJLabel.setText("Edad: " + serVivo.getEdadSer());
                              Vida.sleep(velocidadcrecimiento);
                        } catch (InterruptedException e) {
                              serVivo.setVidaSer(0);
                              interrupted();
                              vida.isInterrupted();
                        }     
                  }
            } 
            System.out.println("tu planta murio");
            vida.isInterrupted();
            
      }
}
