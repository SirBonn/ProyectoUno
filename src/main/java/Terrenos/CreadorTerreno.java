/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Terrenos;

import Granjero.Jugador;
import Vivo.ManejadorSeresVivos;
import TiposTerrenos.*;
import Vivo.SerVivo;
import Terrenos.*;

public class CreadorTerreno {
      private Jugador jugador;
      
      public Terreno[][] crearTerrenoInicial (Jugador jugador) {
            Terreno celdaTerreno;
            this.jugador=jugador;
            Terreno[][] SueloTerreno = new Terreno[5][5];
            PobabilidadTerreno tipo = new PobabilidadTerreno();
            ManejadorTerreno manej = new ManejadorTerreno();
            
                   
                   for (int x = 0; x < 5; x++) {
                  for (int y = 0; y < 5; y++) {
                        TipoTerreno terretipe = tipo.randomTerreno();
                        SuperficieTerreno nuevaSuperficieTerreno = new SuperficieTerreno(x, y, terretipe.getNombre(), tipo.getImagen(), manej.opcionesTerreno(terretipe, jugador.getInventario()));
                        celdaTerreno = new Terreno(terretipe, nuevaSuperficieTerreno);
                        SueloTerreno[x][y] = celdaTerreno;
                        
                        nuevaSuperficieTerreno.addMouseListener(new java.awt.event.MouseAdapter() {
                              @Override
                              public void mouseClicked (java.awt.event.MouseEvent evt) {
                                    SuperficieTerreno celdaSueloCreado = (SuperficieTerreno) evt.getComponent();
                                           celdaSueloCreado.getFrameventana().setVisible(true);
                                           celdaSueloCreado.getFrameventana().setLocation(evt.getXOnScreen(), evt.getYOnScreen());
                                          // manej.setBotonRecibido(celdaSueloCreado);
                              }   
                        });
                  }
            }
            return SueloTerreno;
      }
}
