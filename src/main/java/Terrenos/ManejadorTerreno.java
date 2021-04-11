package Terrenos;

import javax.swing.JPanel;
import Ventanas.*;
import javax.swing.JFrame;

public class ManejadorTerreno {

      private JPanel sueloJPanel;
      private Terreno[][] distribucionSuelos;
      OpcionesAgua ventanaAgua; //= new OpcionesAgua();
      OpcionesDesierto ventanaDesierto = new OpcionesDesierto();
      OpcionesTierra ventanaTierra; // = new OpcionesTierra();

      public ManejadorTerreno() {
      }

      public ManejadorTerreno(JPanel sueloJPanel, Terreno[][] distribucionSuelos) {
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

      public JFrame opcionesTerreno(String celdarecibida) {

            if ("Agua".equals(celdarecibida)) {
                  ventanaAgua = new OpcionesAgua();
//                  ventanaAgua.setLocation(posX, posY);
//                  ventanaAgua.setVisible(true);
                  return ventanaAgua;
            }
            if ("Tierra".equals(celdarecibida)) {
                  ventanaTierra = new OpcionesTierra();

//                  ventanaTierra.setLocation(posX, posY);
//                  ventanaTierra.setVisible(true);
                  return ventanaTierra;
            } else {
                  
                  return ventanaDesierto;
            }
      }
}
