
package Terrenos;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class SuperficieTerreno extends JButton{
      
      private int numeroFila;
      private int numeroColumna;
      private String tipoTerreno;
      private JFrame frameventana;
      private Icon imagen;

      private SuperficieTerreno tiposuSuperficieTerreno;
      
      public SuperficieTerreno(int numeroFila, int numeroColumna, String tipoTerreno, Icon icon, JFrame frameventana) {
            super(icon);
            this.numeroFila = numeroFila;
            this.numeroColumna = numeroColumna;
            this.tipoTerreno = tipoTerreno;
            this.frameventana = frameventana;
      }

      public SuperficieTerreno(SuperficieTerreno tiposuSuperficieTerreno) {
            this.tiposuSuperficieTerreno = tiposuSuperficieTerreno;
      }

      public SuperficieTerreno getTiposuSuperficieTerreno() {
            return tiposuSuperficieTerreno;
      }

      public void setTiposuSuperficieTerreno(SuperficieTerreno tiposuSuperficieTerreno) {
            this.tiposuSuperficieTerreno = tiposuSuperficieTerreno;
      }
      
      public JFrame getFrameventana() {
            return frameventana;
      }

      public void setFrameventana(JFrame frameventana) {
            this.frameventana = frameventana;
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
