
package Vivo;

import Procesos.*;
import Terrenos.*;
import javax.swing.JLabel;

public class ManejadorSeresVivos {
     
      
      private planta planta;
      private Animal animal;
      private Vida vida;
      private Crecer crecer;
      private ManejadorTerreno posicion;

      public ManejadorSeresVivos(planta planta) {
            this.planta = planta;
            
      }
     
      public ManejadorSeresVivos(Animal animal){
            this.animal = animal;
      }

      public void sembrar (JLabel vidaJLabel, planta planta,JLabel edadJLabel, JLabel imaJLabel) {
            vida = new Vida(planta.getVidaSer(), vidaJLabel, planta, planta.getCrecimiento());
            crecer = new Crecer(planta.getDecrecimiento(), planta, planta, edadJLabel, imaJLabel, vida);
            crecer.start();
            vida.start();
      }
      
      public void colocar (JLabel vidaJLabel, Animal animal,JLabel edadJLabel, JLabel imaJLabel){
           this.vida = new Vida(animal.getVidaSer(), vidaJLabel, animal, animal.getCrecimiento());
            this.crecer = new Crecer(animal.getDecrecimiento(), animal, animal, edadJLabel, imaJLabel, vida);
            crecer.start();
            vida.start();
      }

      public Vida getVida() {
            return vida;
      }

      public Crecer getCrecer() {
            return crecer;
      }
      
      public void regarOalimentar (int incremento){
            vida.incrementoVida(incremento);     
      }
      
      public void Fertilizar (int incremento){
            crecer.incrementoedad(incremento);
      }
      
}

