/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TiposTerrenos;

import javax.swing.Icon;
import javax.swing.ImageIcon;


public class Tierra extends TipoTerreno{
      
      private boolean libre;
      private boolean parcela;
      ImageIcon imagen = new ImageIcon(getClass().getClassLoader().getResource("texturaTierra.jpg"));
      
      public Tierra(boolean libre, boolean parcela) {
            this.libre = libre;
            this.parcela = parcela;
      }
     
      @Override
      public String toString() {
            return "Tierra";
      }

      public Icon getImagen() {
            return imagen;
      }

      public void sembrar (){
            System.out.println("usted esta sembrando");
      }
      
      public boolean isLibre() {
            return libre;
      }

      public void setLibre(boolean libre) {
            this.libre = libre;
      }

      public boolean isParcela() {
            return parcela;
      }

      public void setParcela(boolean parcela) {
            this.parcela = parcela;
      }
      
      
}
