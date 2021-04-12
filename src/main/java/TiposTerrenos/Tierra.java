/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TiposTerrenos;

import Plantas.ManejadorPlanta;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import Vivo.*;
import javax.swing.JButton;
import javax.swing.JLabel;


public class Tierra extends TipoTerreno{
      
      private boolean libre;
      private boolean parcela;
      private ManejadorPlanta sembrador;
      private  SerVivo serVivo;
      ImageIcon imagen = new ImageIcon(getClass().getClassLoader().getResource("texturaTierra.jpg"));
      
      public Tierra(boolean libre, boolean parcela) {
            this.libre = libre;
            this.parcela = parcela;
      }
     
      public void sembrar (planta planta, JLabel vidaJLabel, JButton botonsiembra, JLabel edadJLabel, JLabel imagenEdad){
            this.serVivo = planta;
            if (libre == true && parcela == false){
                 sembrador  = new ManejadorPlanta(planta);
                 sembrador.sembrar(vidaJLabel, planta, edadJLabel, imagenEdad);
                 botonsiembra.setVisible(false);
            } 
            else {
                  System.out.println("este lugar esta ocupado o es una parcela");
            }
            
      }
      
      public void regar (SerVivo planta){
            if(serVivo.getVidaSer()<75) {
                  sembrador.regar(25);
            } else {
                  System.out.println("aun tiene agua, vuelve en un momento");
            }
      }
      
      public void fertilizar (SerVivo planta){
            sembrador.regar(1);
      }
      
      public void cosechar(SerVivo planta){
            if (planta.getEdadSer() == 3) {
                  System.out.println("acabas de cosechar, has recibido 2 mazorcas");
            } if (planta.getEdadSer() <= 2) {
                  System.out.println("espera un poco mas, la cosecha casi esta lista");
            } else if (planta.getEdadSer() == 4){
                  System.out.println("oh esta muerta, te recomiendo limpiar el terreno");
            }
            
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
