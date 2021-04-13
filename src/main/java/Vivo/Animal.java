
package Vivo;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Animal extends SerVivo{
      
      private String tipo;
      private JLabel labelvidainfo;
      private ImageIcon imagen0;
      private ImageIcon imagen1;
      private ImageIcon imagen2;
      private ImageIcon imagen3;

      public Animal(String tipo, int Vida, String nombre, int crecimiento, int decrecimiento) {
            super(Vida, nombre, crecimiento, decrecimiento);
            this.tipo = tipo;
      }

      @Override
      public ImageIcon getImagen0() {
            return imagen0;
      }
@Override
      public ImageIcon getImagen1() {
            return imagen1;
      }
@Override
      public ImageIcon getImagen2() {
            return imagen2;
      }
@Override
      public ImageIcon getImagen3() {
            return imagen3;
      }

      public String getTipo() {
            return tipo;
      }

      public void setTipo(String tipo) {
            this.tipo = tipo;
      }

      public JLabel getLabelvidainfo() {
            return labelvidainfo;
      }

      public void setLabelvidainfo(JLabel labelvidainfo) {
            this.labelvidainfo = labelvidainfo;
      }

}
