/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animales;
import Vivo.*;
import javax.swing.ImageIcon;

/**
 *
 * @author byron
 */

public class Cerdo extends Animal{

      //colocar las imagenes de las etapas de su crecimiento

      private ImageIcon imagen0 = new ImageIcon(getClass().getClassLoader().getResource("maiz0.png"));
      private ImageIcon imagen1 = new ImageIcon(getClass().getClassLoader().getResource("maiz1.png"));
      private ImageIcon imagen2 = new ImageIcon(getClass().getClassLoader().getResource("maiz2.png"));
      private ImageIcon imagen3 = new ImageIcon(getClass().getClassLoader().getResource("maiz3.png"));
      
      
      
      public Cerdo() {
            super("Cerdo", 100, "Cerdo", 60000 , 10000);
            //se setea un cerdo con 100 puntos de vida
            //crecera a cada 60 segundos 
            //su vida disminuira cada 10 segundos
      }
  
      
      //setear las imagenes de las 4 etapas de crecimiento
      
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
