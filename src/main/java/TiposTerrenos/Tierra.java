package TiposTerrenos;

import Items.Item;
import Vivo.ManejadorSeresVivos;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import Vivo.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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

      public void cosechar(SerVivo planta ,Item item) {
            if (planta.getEdadSer() == 3) {
                  JOptionPane.showMessageDialog(null, "Haz obtenido recursos, consulta el inventario");
                  item.setCantidad(item.getCantidad()+3);
                  granjero.getCrecer().interrupt();
                  granjero.getVida().interrupt();
            }
            if (planta.getEdadSer() <= 2) {
                  System.out.println("espera un poco mas, la cosecha casi esta lista");

            } else if (planta.getEdadSer() == 4) {
                  System.out.println("oh esta muerta, te recomiendo limpiar el terreno");
            }
      }

      public void destazarAnimal(SerVivo animal, Item item) {
            if (animal.getEdadSer() == 3) {
                  JOptionPane.showMessageDialog(null, "Haz obtenido recursos, consulta tu inventario!");
                  item.setCantidad(item.getCantidad()+5);
                  granjero.getCrecer().interrupt();
                  granjero.getVida().interrupt();
            }
            if (animal.getEdadSer() <= 2) {
                  System.out.println("espera un poco mas, la cosecha casi esta lista");

            } else if (animal.getEdadSer() == 4) {
                  System.out.println("oh esta muerta, te recomiendo limpiar la parcela");
            }
      }

      public void obtenerRecursos(SerVivo animal, Item item) {
            if (animal.getEdadSer() == 3) {
                  JOptionPane.showMessageDialog(null,"Acabas de obtener recursos, revisa tu inventario");
                  item.setCantidad(item.getCantidad()+5);
                  animal.setVidaSer(1);
            }
            if (animal.getEdadSer() <= 2) {
                  System.out.println("espera un poco mas, la cosecha casi esta lista");

            } else if (animal.getEdadSer() == 4) {
                  System.out.println("oh esta muerta, te recomiendo limpiar la parcela");
            }
      }

      public void limpiar(JLabel siembraLabel, JLabel edadColocao){
            granjero.getCrecer().interrupt();
            granjero.getVida().interrupt();
            siembraLabel.setText("Listo para trabajar");
            edadColocao.setText("");
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
