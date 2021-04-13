package TiposTerrenos;

import Vivo.ManejadorSeresVivos;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import Vivo.*;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Tierra extends TipoTerreno {

      private boolean libre;
      private boolean parcela;
      private ManejadorSeresVivos granjero;
      private SerVivo serVivo;
      ImageIcon imagen = new ImageIcon(getClass().getClassLoader().getResource("texturaTierra.jpg"));

      public Tierra(boolean libre, boolean parcela) {
            super("Tierra");
            this.libre = libre;
            this.parcela = parcela;
      }

      public void sembrar(planta planta, JLabel vidaJLabel, JButton botonsiembra, JLabel edadJLabel, JLabel imagenEdad) {
            this.serVivo = planta;
            if (libre == true && parcela == false) {
                  granjero = new ManejadorSeresVivos(planta);
                  granjero.sembrar(vidaJLabel, planta, edadJLabel, imagenEdad);
                  botonsiembra.setVisible(false);
            } else {
                  System.out.println("este lugar esta ocupado o es una parcela");
            }

      }

      public void colocar(Animal animal, JLabel vidaJLabel, JButton colcarAnimal, JLabel edJLabel, JLabel imagenEdad) {
            this.serVivo = animal;
            if (libre == true && parcela == true) {
                  granjero = new ManejadorSeresVivos(animal);
                  granjero.colocar(vidaJLabel, animal, edJLabel, imagenEdad);
                  colcarAnimal.setVisible(false);
            } else {
                  System.out.println("este lugar esta ocupado o es una parcela");
            }
      }

      public void mantenerVida(SerVivo planta) {
            if (serVivo.getVidaSer() < 75) {
                  granjero.regarOalimentar(25);
            } else {
                  System.out.println("aun tiene agua, vuelve en un momento");
            }
      }

      public void fertilizar(SerVivo planta) {
            granjero.Fertilizar(1);
      }

      public void cosechar(SerVivo planta) {
            if (planta.getEdadSer() == 3) {
                  System.out.println("acabas de cosechar, has recibido 2 mazorcas");
                  granjero.getCrecer().interrupt();
                  granjero.getVida().interrupt();
            }
            if (planta.getEdadSer() <= 2) {
                  System.out.println("espera un poco mas, la cosecha casi esta lista");

            } else if (planta.getEdadSer() == 4) {
                  System.out.println("oh esta muerta, te recomiendo limpiar el terreno");
            }
      }

      public void destazarAnimal(SerVivo animal) {
            if (animal.getEdadSer() == 3) {
                  System.out.println("acabas de matar a la vaca");
                  granjero.getCrecer().interrupt();
                  granjero.getVida().interrupt();
            }
            if (animal.getEdadSer() <= 2) {
                  System.out.println("espera un poco mas, la cosecha casi esta lista");

            } else if (animal.getEdadSer() == 4) {
                  System.out.println("oh esta muerta, te recomiendo limpiar la parcela");
            }
      }

      public void obtenerRecursos(SerVivo animal) {
            if (animal.getEdadSer() == 3) {
                  System.out.println("acabas de ordeñar a la vaca");
                  animal.setVidaSer(2);

            }
            if (animal.getEdadSer() <= 2) {
                  System.out.println("espera un poco mas, la cosecha casi esta lista");

            } else if (animal.getEdadSer() == 4) {
                  System.out.println("oh esta muerta, te recomiendo limpiar la parcela");
            }
      }

      public void limpiar(){
            granjero.getCrecer().interrupt();
            granjero.getVida().interrupt();
      }
      
      @Override
      public String toString() {
            return "Tierra";
      }

      public Icon getImagen() {
            return imagen;
      }

      public boolean isLibre() {
            return libre;
      }

      public void setLibre(boolean libre) {
            this.libre = libre;
      }

      public boolean isParcela() {
            return parcela;
      }

      public void setParcela(boolean parcela) {
            this.parcela = parcela;
      }

}
