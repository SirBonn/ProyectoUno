/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TiposTerrenos;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Agua extends TipoTerreno {

      private boolean ocupado;
      private int cantidadPescados;

      public Agua(boolean ocupado, int cantidadPescados) {
            this.ocupado = ocupado;
            this.cantidadPescados = cantidadPescados;
      }
//colocamos la textura de agua y la laojamos 
      ImageIcon imagen = new ImageIcon(getClass().getClassLoader().getResource("texturaAgua.jpg"));

      @Override
      public String toString() {
            return "Agua";
      }

      public Icon getImagen() {
            return imagen;
      }

      public void pescar() {

            System.out.println("usted esta pescando");

      }

      public boolean isOcupado() {
            return ocupado;
      }

      public void setOcupado(boolean ocupado) {
            this.ocupado = ocupado;
      }

      public int getCantidadPescados() {
            return cantidadPescados;
      }

      public void setCantidadPescados(int cantidadPescados) {
            this.cantidadPescados = cantidadPescados;
      }

}
