
package Vivo;

import Procesos.Vida;
import javax.swing.JLabel;

public class planta extends SerVivo{
      
      private String tipo;
      private Vida vida;
      private JLabel labelvidainfo;
      
      
      public planta(String tipo, int Vida, String nombre) {
            super(Vida, nombre);
            this.tipo = tipo;
      }
      
      
}
