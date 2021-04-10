/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Terrenos;

import TiposTerrenos.*;

public class CreadorTerreno {

      public Terreno[][] crearTerrenoInicial() {
            Terreno celdaTerreno;
            Terreno[][] SueloTerreno = new Terreno[8][8];
            PobabilidadTerreno tipo = new PobabilidadTerreno();
            ManejadorTerreno manej = new ManejadorTerreno();
            
            for (int x = 0; x < 5; x++) {
                  for (int y = 0; y < 5; y++) {
                        String terretipe = tipo.randomTerreno().toString();
                        
                        SuperficieTerreno nuevaSuperficieTerreno = new SuperficieTerreno(x, y, terretipe, tipo.getImagen());
                        TipoTerreno terrenoRandom = tipo.randomTerreno();
                        celdaTerreno = new Terreno(terrenoRandom, nuevaSuperficieTerreno);
                        SueloTerreno[x][y] = celdaTerreno;
                        
                        nuevaSuperficieTerreno.addMouseListener(new java.awt.event.MouseAdapter() {
                              @Override
                              public void mouseClicked(java.awt.event.MouseEvent evt) {
                                    
                                    SuperficieTerreno celdaSueloCreado = (SuperficieTerreno) evt.getComponent();
                                    System.out.println("hola soy un " + celdaSueloCreado.getTipoTerreno() + " en: (" + celdaSueloCreado.getNumeroFila() + ", "
                                           + celdaSueloCreado.getNumeroColumna()+")");
                                    manej.opcionesTerreno(celdaSueloCreado.getTipoTerreno(), evt.getXOnScreen(), evt.getYOnScreen());
                              }
                              
                        });
                  }
            }
            
            return SueloTerreno;
      }

}
