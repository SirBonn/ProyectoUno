/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Terrenos;

import Granjero.Jugador;

/**
 *
 * @author byron
 */
public class Granja {

      private Terreno[][] suelo;
      
      public Granja(Jugador jugador) {
             CreadorTerreno creadorTerreno = new CreadorTerreno();
            this.suelo = creadorTerreno.crearTerrenoInicial(jugador);
      }

      public Terreno[][] getSuelo() {
            return suelo;
      }

      public void setSuelo(Terreno[][] suelo) {
            this.suelo = suelo;
      }

}
