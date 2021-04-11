package Granjero;

import Vivo.SerVivo;

public class Jugador extends  SerVivo{

    private String nombrevivo;
    private String nick;
    private int monedas;

      public Jugador(String nombre, String nick, int monedas, int Vida) {
            super(Vida, nick);
            this.nombrevivo = nombre;
            this.nick = nick;
            this.monedas = monedas;
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
