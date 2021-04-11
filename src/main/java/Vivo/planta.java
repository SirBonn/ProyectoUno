
package Vivo;

import javax.swing.JLabel;

public class planta extends SerVivo{
      
      private String tipo;
      private JLabel labelvidainfo;
      
      
      public planta(String tipo, int Vida, String nombre, int crecimiento, int decrecimiento) {
            super(Vida, nombre, crecimiento, decrecimiento);
            this.tipo = tipo;
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
