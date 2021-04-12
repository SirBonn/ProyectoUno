
package Plantas;

import Procesos.*;
import Vivo.*;
import Terrenos.*;
import javax.swing.JLabel;

public class ManejadorPlanta {
     
      
      private planta planta;
      private Vida vidaPlanta;
      private Crecer crecer;
      private ManejadorTerreno posicion;

      public ManejadorPlanta(planta planta) {
            this.planta = planta;
            
      }
     

      public void sembrar (JLabel vidaJLabel, planta planta,JLabel edadJLabel, JLabel imaJLabel) {
            vidaPlanta = new Vida(planta.getVidaSer(), vidaJLabel, planta, planta.getCrecimiento());
            crecer = new Crecer(planta.getDecrecimiento(), planta, planta, edadJLabel, imaJLabel, vidaPlanta);
            crecer.start();
            vidaPlanta.start();
      }
      
      public void regar (int incremento){
            vidaPlanta.incrementoVida(incremento);     
      }
      
      public void Fertilizar (int incremento){
            crecer.incrementoedad(incremento);
      }
      
}

