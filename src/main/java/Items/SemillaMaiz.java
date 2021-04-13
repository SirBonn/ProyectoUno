/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Items;

/**
 *
 * @author byron
 */
public class SemillaMaiz extends Item{
      
      private int cantidad;

      public SemillaMaiz(int cantidad) {
            super(cantidad);
      }

      

      @Override
      public void setCantidad(int cantidad) {
            super.setCantidad(cantidad); //To change body of generated methods, choose Tools | Templates.
      }

      @Override
      public int getCantidad() {
            return super.getCantidad(); //To change body of generated methods, choose Tools | Templates.
      }
      

      
}
