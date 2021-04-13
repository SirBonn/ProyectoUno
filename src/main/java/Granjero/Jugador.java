package Granjero;

import Vivo.SerVivo;
import Items.*;

public class Jugador extends  SerVivo{

    private String nombrevivo;
    private String nick;
    private int monedas;

      public Jugador(String nombre, String nick, int monedas, int Vida) {
            super(Vida, nick, 0, 0);
            this.nombrevivo = nombre;
            this.nick = nick;
            this.monedas = monedas;
      }
      
      public void comprar(int cantidad, Item item){
            item.setCantidad(item.getCantidad()+cantidad);
      }
      
    public String getNombrevivo() {
        return nombrevivo;
    }

    public void setNombrevivo(String nombre) {
        this.nombrevivo = nombre;
    }

    public void setMonedas(int monedas) {
        this.monedas = monedas;
    }


    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getMonedas() {
        return monedas;
    }

}
