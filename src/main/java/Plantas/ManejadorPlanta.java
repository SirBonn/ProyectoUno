
package Plantas;

import Procesos.Vida;
import Vivo.planta;
import javax.swing.JLabel;

public class ManejadorPlanta {
     
      private planta planta;
      private JLabel labelVida;
      private JLabel labelMonedas;
      private JLabel labelNombre;
      private Vida vida;

      public ManejadorPlanta(planta planta) {
            this.planta = planta;
      }
      
      
      
//            public void mostarDatos(JLabel monedasJLabel, JLabel nombreJLabel) {
//            monedasJLabel.setText("" + .getMonedas());
//            nombreJLabel.setText(jugador.getNick());
//      }

      public void VidaJugador(JLabel vidaJLabel) {
            vida = new Vida(planta.getVida(), vidaJLabel, planta, 1000);
            vida.start();
      }
      
      
}

