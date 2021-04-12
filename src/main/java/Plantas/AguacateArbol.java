
package Plantas;
import Vivo.*;
import javax.swing.ImageIcon;


public class AguacateArbol extends planta{
      
      private ImageIcon imagen0 = new ImageIcon(getClass().getClassLoader().getResource("maiz0.png"));
      private ImageIcon imagen1 = new ImageIcon(getClass().getClassLoader().getResource("maiz1.png"));
      private ImageIcon imagen2 = new ImageIcon(getClass().getClassLoader().getResource("maiz2.png"));
      private ImageIcon imagen3 = new ImageIcon(getClass().getClassLoader().getResource("maiz3.png"));
      
      public AguacateArbol () {
            super("Tamarindo", 200, "Tamarindo", 120000 , 5000);
            //planta tipo maiz, con 100 de vida, de nombre maiz, que a cada 60 seg crece 1nivel y cada 9 segundos pierde 1 de vida--
      }

      @Override
      public ImageIcon getImagen0() {
            return imagen0;
      }


      public void setImagen0(ImageIcon imagen0) {
            this.imagen0 = imagen0;
      }

      @Override
      public ImageIcon getImagen1() {
            return imagen1;
      }

 
      public void setImagen1(ImageIcon imagen1) {
            this.imagen1 = imagen1;
      }

      @Override
      public ImageIcon getImagen2() {
            return imagen2;
      }

  
      public void setImagen2(ImageIcon imagen2) {
            this.imagen2 = imagen2;
      }

      @Override
      public ImageIcon getImagen3() {
            return imagen3;
      }

      public void setImagen3(ImageIcon imagen3) {
            this.imagen3 = imagen3;
      }
      
}
