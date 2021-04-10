package Granjero;

public class Jugador {

    private String nombre;
    private String nick;
    private int monedas;
    private int puntosVida;

    public Jugador(String nombre, String nick, int monedas, int puntosVIda) {
        this.nombre = nombre;
        this.nick = nick;
        this.monedas = monedas;
        this.puntosVida = puntosVIda;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMonedas(int monedas) {
        this.monedas = monedas;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
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

    public int getPuntosVida() {
        return puntosVida;
    }

}
