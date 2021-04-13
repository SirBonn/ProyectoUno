package Granjero;

import javax.swing.JLabel;
import Procesos.*;

public class ManejadorJugador {

      private Jugador jugador;
      private VidaJugador vida;
      private Inventario inventario;
      
      public ManejadorJugador(Jugador jugador, Inventario inventario) {
            this.jugador = jugador;
            this.inventario = inventario;

      }

      public void mostarDatos(JLabel monedasJLabel, JLabel nombreJLabel) {
            //monedasJLabel.setText(""+jugador.getMonedas());
            nombreJLabel.setText(jugador.getNick());
      }

      public void VidaJugador(JLabel vidaJLabel, JLabel monedasJLabell) {
            
            vida = new VidaJugador(jugador.getVidaSer(), vidaJLabel, jugador, 1000, monedasJLabell, inventario);
            vida.start();
            
      }

}
