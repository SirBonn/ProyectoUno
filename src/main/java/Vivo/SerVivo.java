/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vivo;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author byron
 */
public class SerVivo {

      private int vidaSer;
      private String nombre;
      ImageIcon imagennueva;
      private int edadSer;
      private int decrecimiento;
      private int crecimiento;

      public SerVivo(int Vida, String nombre, int decrecimiento, int crecimiento) {
            this.vidaSer = Vida;
            this.nombre = nombre;
            this.crecimiento = crecimiento;
            this.decrecimiento = decrecimiento;
      }

      public void observadorVida(JLabel etiqueta) {
            if (this.vidaSer > 75) {
                  imagennueva = new ImageIcon(getClass().getClassLoader().getResource("Corazon.png"));
                  etiqueta.setIcon(imagennueva);
            }
            if (this.vidaSer < 75 && this.vidaSer > 50) {
                  System.out.println("te estas debilitando, recuerda comer algo");
                  imagennueva = new ImageIcon(getClass().getClassLoader().getResource("Corazoncuarto.png"));
                  etiqueta.setIcon(imagennueva);
            }
            if (this.vidaSer <= 50 && this.vidaSer > 25) {
                  System.out.println(" te queda media vida");
                  imagennueva = new ImageIcon(getClass().getClassLoader().getResource("CorazonMedio.png"));
                  etiqueta.setIcon(imagennueva);
            }
            if (this.vidaSer <= 25 && this.vidaSer > 0) {
                  System.out.println("ya te vas a morir, come algo");
                  imagennueva = new ImageIcon(getClass().getClassLoader().getResource("Corazontrescuartos.png"));
                  etiqueta.setIcon(imagennueva);
            }
            if (this.vidaSer == 0) {
                  System.out.println("ya te petatiaste");
                  imagennueva = new ImageIcon(getClass().getClassLoader().getResource("CorazonMuerte.png"));
                  etiqueta.setIcon(imagennueva);
            }

      }

      
      public void observadorCrecimiento(int edad, String tipo, JButton boton){
            if (edad == 0) {
                  System.out.println("tu " +tipo +"aun es joven");
                    imagennueva = new ImageIcon(getClass().getClassLoader().getResource("texturaTierraMaiz.jpg"));
                    boton.setIcon(imagennueva);
            } if (edad == 1) {
                  System.out.println("tu " +tipo +" esta creciendo");
            } if (edad == 2) {
                  System.out.println("tu " +tipo +"ya es adulta");
            } if (edad == 3) {
                  System.out.println("tu" +tipo +"murio de vejez");
            }
      }

      public int getDecrecimiento() {
            return decrecimiento;
      }

      public void setDecrecimiento(int decrecimiento) {
            this.decrecimiento = decrecimiento;
      }

      public int getCrecimiento() {
            return crecimiento;
      }

      public void setCrecimiento(int crecimiento) {
            this.crecimiento = crecimiento;
      }
      
      public int getEdadSer() {
            return edadSer;
      }

      public void setEdadSer(int edadSer) {
            this.edadSer = edadSer;
      }
      
      public String getNombre() {
            return nombre;
      }

      public void setNombre(String nombre) {
            this.nombre = nombre;
      }

      public int getVida() {
            return vidaSer;
      }

      public void setVida(int Vida) {
            this.vidaSer = Vida;
      }

}
