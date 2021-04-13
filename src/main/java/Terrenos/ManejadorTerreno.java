package Terrenos;

import Granjero.Jugador;
import TiposTerrenos.*;
import Ventanas.*;
import javax.swing.*;

public class ManejadorTerreno {

      private JPanel sueloJPanel;
      private Terreno[][] distribucionSuelos;

      private Agua agua;
      private Tierra tierra;
      private Desierto desierto;
      private Icon imagen;
      private SuperficieTerreno botonRecibido;
      private Jugador jugador;

      OpcionesAgua ventanaAgua; //= new OpcionesAgua();
      OpcionesDesierto ventanaDesierto = new OpcionesDesierto();
      OpcionesTierra ventanaTierra; // = new OpcionesTierra();

      public ManejadorTerreno() {
      }

      public ManejadorTerreno(JPanel sueloJPanel, Terreno[][] distribucionSuelos, Jugador jugador) {
            this.sueloJPanel = sueloJPanel;
            this.distribucionSuelos = distribucionSuelos;
            this.jugador = jugador;
            dibujarSuelo();
      }

      public void dibujarSuelo() {
            for (int x = 0; x < 5; x++) {
                  for (int y = 0; y < 5; y++) {
                        Terreno sueloNuevo = this.distribucionSuelos[x][y];
                        this.sueloJPanel.add(sueloNuevo.getSuperficieTerreno());
                  }
            }
      }

      public void setBotonRecibido(SuperficieTerreno botonRecibido) {
            this.botonRecibido = botonRecibido;
      }

      public ManejadorTerreno(SuperficieTerreno botonRecibido) {
            this.botonRecibido = botonRecibido;
      }

      
      public JFrame opcionesTerreno(TipoTerreno celdarecibida) {
            
            if ("Agua".equals(celdarecibida.getNombre())) {
                  ventanaAgua = new OpcionesAgua(this.botonRecibido, jugador);
                  return ventanaAgua;
            }
            if ("Tierra".equals(celdarecibida.getNombre())) {
                  ventanaTierra = new OpcionesTierra(this.botonRecibido, jugador);
                  return ventanaTierra;
            } else {
                  return ventanaDesierto;
            }

      }

}
