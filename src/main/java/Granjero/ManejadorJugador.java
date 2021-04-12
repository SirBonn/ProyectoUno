package Granjero;

import javax.swing.JLabel;
import Procesos.*;

public class ManejadorJugador {

      private Jugador jugador;
      private JLabel labelVida;
      private JLabel labelMonedas;
      private JLabel labelNombre;
      private Vida vida;

      public ManejadorJugador(Jugador jugador/*, JLabel labelVida, JLabel labelMonedas, JLabel labelNombre*/) {
            this.jugador = jugador;
//            this.labelVida = labelVida;
//            this.labelMonedas = labelMonedas;
//            this.labelNombre = labelNombre;
      }

      public void mostarDatos(JLabel monedasJLabel, JLabel nombreJLabel) {
            monedasJLabel.setText("" + jugador.getMonedas());
            nombreJLabel.setText(jugador.getNick());
      }

      public void VidaJugador(JLabel vidaJLabel) {
            vida = new Vida(jugador.getVidaSer(), vidaJLabel, jugador, 1000);
            vida.start();
      }

}
