package TiposTerrenos;

import javax.swing.ImageIcon;

public class TipoTerreno {
      
    private String nombre;
    private ImageIcon iconoCelda;
    ImageIcon imagenCelda;

    public TipoTerreno(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ImageIcon getIconoCelda() {
        return iconoCelda;
    }

    public void setIconoCelda(ImageIcon iconoCelda) {
        this.iconoCelda = iconoCelda;
    }

    public ImageIcon remplazarImagen() {
        return this.imagenCelda;
    }
}
