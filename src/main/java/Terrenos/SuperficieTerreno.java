
package Terrenos;

import javax.swing.Icon;
import javax.swing.JButton;

public class SuperficieTerreno extends JButton{
      
      private int numeroFila;
      private int numeroColumna;
      private String tipoTerreno;
      private Icon imagen;

      public SuperficieTerreno(int numeroFila, int numeroColumna, String tipoTerreno, Icon icon) {
            super(icon);
            this.numeroFila = numeroFila;
            this.numeroColumna = numeroColumna;
            this.tipoTerreno = tipoTerreno;
      }
      
      public Icon getImagen() {
            return imagen;
      }
      
      public void setImagen(Icon imagen) {
            this.imagen = imagen;
      }

      public int getNumeroFila() {
            return numeroFila;
      }

      public void setNumeroFila(int numeroFila) {
            this.numeroFila = numeroFila;
      }

      public int getNumeroColumna() {
            return numeroColumna;
      }

      public void setNumeroColumna(int numeroColumna) {
            this.numeroColumna = numeroColumna;
      }

      public  String getTipoTerreno() {
            return tipoTerreno;
      }

      public void setTipoTerreno(String tipoTerreno) {
            this.tipoTerreno = tipoTerreno;
      }
      
      
      
}
