package Terrenos;

import Granjero.Inventario;
import Granjero.Jugador;
import TiposTerrenos.*;
import Ventanas.*;
import javax.swing.*;

public class ManejadorTerreno {

      private JPanel sueloJPanel;
      private Terreno[][] distribucionSuelos;
      private SuperficieTerreno botonRecibido;
      private Inventario inventarioNuevo;
      OpcionesAgua ventanaAgua; //= new OpcionesAgua();
      OpcionesDesierto ventanaDesierto = new OpcionesDesierto();
      OpcionesTierra ventanaTierra; // = new OpcionesTierra();

      public ManejadorTerreno() {
      }

      public ManejadorTerreno(JPanel sueloJPanel, Terreno[][] distribucionSuelos, Inventario inventario) {
             this.inventarioNuevo=inventario;
            this.sueloJPanel = sueloJPanel;
            this.distribucionSuelos = distribucionSuelos;
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

      public Inventario getInventario() {
            return inventarioNuevo;
      }

      

      public JFrame opcionesTerreno(TipoTerreno celdarecibida, Inventario inventario) {
            
            if ("Agua".equals(celdarecibida.getNombre())) {
                  ventanaAgua = new OpcionesAgua(this.botonRecibido);
                  return ventanaAgua;
            }
            if ("Tierra".equals(celdarecibida.getNombre())) {
                  ventanaTierra = new OpcionesTierra(this.botonRecibido, inventario);
                  return ventanaTierra;
            } else {
                  return ventanaDesierto;
            }

      }

}
