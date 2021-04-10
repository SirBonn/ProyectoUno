/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TiposTerrenos;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author byron
 */
public class Desierto extends TipoTerreno {

      private String lamento;
      
      public Desierto() {

      }

      ImageIcon imagen = new ImageIcon(getClass().getClassLoader().getResource("texturaDesierto.jpg"));

      @Override
      public String toString() {
            return "Desierto";
      }

      public Icon getImagen() {
            return imagen;
      }

      public void lamentarse() {
            System.out.println("oh no, no puedo sembrar aca");
      }
}
