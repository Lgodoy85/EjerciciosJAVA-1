package Entidades;

import Enumerados.Resultado;
import Dao.JugadorDao;
import java.util.ArrayList;

public class Jugador {

private int idJugador;    
private String nombre;
private String alias;
private Resultado resultado;
private Jugadas jugada;


public Jugador(int idjugador , String nombre , String alias){
    
    this.idJugador=idjugador;
    this.nombre=nombre;
    this.alias=alias;
    
}


public void setterNombre (String nombre){

    this.nombre=nombre;
}
public String getterNombre (){

    return this.nombre;

}

public void setterAlias (String alias){

    this.alias=alias;

}

public static ArrayList<String> retornarJugador(){
        JugadorDao playerDao= new JugadorDao();
        return playerDao.retornarJugador();    
    }

@Override
public String toString() {
return "Jugador{" + "idJugador=" + idJugador + ", nombre=" + nombre + ", alias=" + alias + '}';
}


    
}
