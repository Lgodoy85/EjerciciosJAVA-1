package Entidades;
import Dao.JuegoDao;
import Enumerados.TipoDeJuego;
import java.util.ArrayList;

public class Juego {

private String nombre;
private int tipo;
private TipoDeJuego tipojuego;

    public Juego(String nombre, int tipo, TipoDeJuego tipojuego) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.tipojuego = tipojuego;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public TipoDeJuego getTipojuego() {
        return tipojuego;
    }

    public void setTipojuego(TipoDeJuego tipojuego) {
        this.tipojuego = tipojuego;
    }
    
    public static ArrayList<String> retornarJuego(){
        JuegoDao playerDao= new JuegoDao();
        return playerDao.retornarJuego();    
    }

    @Override
    public String toString() {
        return "Juego{" + "nombre=" + nombre + ", tipo=" + tipo + ", tipojuego=" + tipojuego + '}';
    }






    
}
