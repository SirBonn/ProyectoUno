package Terrenos;

import TiposTerrenos.*;
import java.util.Random;
import javax.swing.Icon;

public class PobabilidadTerreno {

      private Tierra tierra;
      private Desierto desierto;
      private Agua agua;
      private Icon imagen;
      
      public TipoTerreno randomTerreno() {
            Random probabilidad = new Random();
            int prob = probabilidad.nextInt(100) + 1;
            
            if (prob>0 && prob<= 40){
                  tierra = new Tierra(true, false);
                  this.imagen = tierra.getImagen();
                  return tierra;
            } if (prob>40 && prob <=75){
                  agua = new Agua(false, 5);
                  this.imagen = agua.getImagen();
                  return agua;
            } else {
                  desierto = new Desierto();
                  this.imagen = desierto.getImagen();
                  return desierto;
            }
            
      }

      public Icon getImagen() {
            return imagen;
      }
      
     
}
