package Entidades;

import Dao.JugadasDao;
import Dao.JugadorDao;
import Enumerados.Resultado;
import java.util.ArrayList;
import java.util.List;

public class Jugadas {
    
private Jugador mijugador;
private Juego mijuego;
private Resultado resultado;

    public Jugadas(Jugador mijugador, Juego mijuego, Resultado resultado) {
        this.mijugador = mijugador;
        this.mijuego = mijuego;
        this.resultado = resultado;
    }

    public Juego getMijuego() {
        return mijuego;
    }

    public void setMijuego(Juego mijuego) {
        this.mijuego = mijuego;
    }

    public Resultado getResultado() {
        return resultado;
    }

    public void setResultado(Resultado resultado) {
        this.resultado = resultado;
    }
    public static ArrayList<String> retornarJugadas(){
        JugadasDao playerDao= new JugadasDao();
        return playerDao.retornarJugadas();    
    }

    @Override
    public String toString() {
        return "Jugadas{" + "mijugador=" + mijugador + ", mijuego=" + mijuego + ", resultado=" + resultado + '}';
    }

 
 
    
}
