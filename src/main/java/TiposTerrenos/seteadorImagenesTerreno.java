
package TiposTerrenos;

import Terrenos.SuperficieTerreno;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;

public class seteadorImagenesTerreno {
      
      public void maizSembrado ( JMenuItem clickrecibido, SuperficieTerreno botonClickeado){
            clickrecibido.addActionListener(new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                        ImageIcon imagenMaizSembrado = new ImageIcon((getClass().getClassLoader().getResource("texturaAgua.jpg")));
                        System.out.println("estoy en el seteador");
                        botonClickeado.setIcon(imagenMaizSembrado);
                  }
            });
            
      }
}
