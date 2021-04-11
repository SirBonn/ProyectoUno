
package Plantas;

import Procesos.*;
import Vivo.*;
import Terrenos.ManejadorTerreno;
import javax.swing.JLabel;

public class ManejadorPlanta {
     
      private ManejadorTerreno manejadorTerreno = new ManejadorTerreno();
      private planta planta;
      private Vida vida;
      private Crecer crecer;

      public ManejadorPlanta(planta planta) {
            this.planta = planta;
      }
     

      public void sembrarPlanta (JLabel vidaJLabel, planta planta/*, String tipoPlanta, int crecimientoRatio, int decrecimientoRatio*/) {
            vida = new Vida(planta.getVida(), vidaJLabel, planta, planta.getCrecimiento() /*ratiodecrecimiento*/);
            crecer = new Crecer(manejadorTerreno.getBotonSelec(), planta.getDecrecimiento(), planta);
            vida.start();
            crecer.start();
      }
      
      
}

