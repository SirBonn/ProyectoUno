/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vivo;

import Procesos.Crecer;
import Procesos.Vida;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 * a
 *
 * @author byron
 */
public class SerVivo {

      private JButton botonselec;
      private int vidaSer;
      private String nombre;
      ImageIcon imagennueva;
      private int edadSer;
      private int decrecimiento;
      private int crecimiento;

      public SerVivo(JButton botonselect) {
            this.botonselec = botonselect;
      }

      public SerVivo(int Vida, String nombre, int decrecimiento, int crecimiento) {
            this.vidaSer = Vida;
            this.nombre = nombre;
            this.crecimiento = crecimiento;
            this.decrecimiento = decrecimiento;
      }

      public void observadorVida(JLabel etiqueta, int vida, Vida vidaHilo) {
            if (vida > 75) {
                  imagennueva = new ImageIcon(getClass().getClassLoader().getResource("Corazon.png"));
                  etiqueta.setIcon(imagennueva);
            }
            if (vida < 75 && this.vidaSer > 50) {
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
            if (this.vidaSer <= 0) {
                  System.out.println("ya te petatiaste");
                  imagennueva = new ImageIcon(getClass().getClassLoader().getResource("CorazonMuerte.png"));
                  etiqueta.setIcon(imagennueva);
                  vidaHilo.interrupted();
            }
      }

      public void observadorCrecimiento(int edad, planta planta,String tipo, JLabel edadJLabel, JLabel imagenEdad, Crecer crecer, Vida vida) {
            if (edad == 0) {
                  imagenEdad.setVisible(true);
                  imagenEdad.setIcon(planta.getImagen0());
                  System.out.println("tu " + tipo + " aun es joven");
            }
            if (edad == 1) {
                  imagenEdad.setIcon(planta.getImagen1());
                  System.out.println("tu " + tipo + " esta creciendo");
            }
            if (edad == 2) {
                  imagenEdad.setIcon(planta.getImagen2());
                  System.out.println("tu " + tipo + " ya es adulta");
            }
            if (edad == 3) {
                  imagenEdad.setIcon(planta.getImagen3());
                  System.out.println("tu " + tipo + " murio de vejez");
                  crecer.interrupt();
                  vida.interrupt();
            }
      }

      public JButton getBotonselec() {
            return botonselec;
      }

      public void setBotonselec(JButton botonselec) {
            this.botonselec = botonselec;
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

      public int getVidaSer() {
            return vidaSer;
      }

      public void setVidaSer(int Vida) {
            this.vidaSer = Vida;
      }

}
