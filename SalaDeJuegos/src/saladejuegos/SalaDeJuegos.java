package saladejuegos;

import Dao.Conexion;
import Entidades.Jugador;
import Entidades.Jugadas;
import Entidades.Juego;
import Enumerados.TipoDeJuego;
import Enumerados.Resultado;
import Formularios.FormJugador;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class SalaDeJuegos {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Jugador mijugador1 = new Jugador(1, "Maria", "Aniquilidor");
        Jugador mijugador2 = new Jugador(2, "Pepe", "La Muerte");
        Jugador mijugador3 = new Jugador(3, "Lautaro", "El Jefe");
        Jugador mijugador4 = new Jugador(4, "Lore", "La Master");
      
        
        Juego mijuego1 = new Juego("moh", 1, TipoDeJuego.FPS);
        Juego mijuego2 = new Juego("monkey", 2, TipoDeJuego.RPG);
        Juego mijuego3 = new Juego("ww", 3, TipoDeJuego.ARCADE);
        Juego mijuego4 = new Juego("Pachan", 4, TipoDeJuego.ARCADE);
        Juego mijuego5 = new Juego("Wolfed", 5, TipoDeJuego.FPS);
        
        Jugadas mijugadas1 = new Jugadas(mijugador1, mijuego1, Resultado.gano);
        Jugadas mijugadas2 = new Jugadas(mijugador2, mijuego1, Resultado.perdio);
        Jugadas mijugadas3 = new Jugadas(mijugador3, mijuego2, Resultado.empato);
        Jugadas mijugadas4 = new Jugadas(mijugador4, mijuego3, Resultado.gano);
        Jugadas mijugadas5 = new Jugadas(mijugador2, mijuego4, Resultado.gano);
        Jugadas mijugadas6 = new Jugadas(mijugador1, mijuego4, Resultado.perdio);
        
        FormJugador fmjugador = new FormJugador();
        fmjugador.setVisible(true);
        
        Conexion c = new Conexion();
        if (c.RetornarConeccion()!=null){
        
            System.out.println("Conexion correcta");
        
        } else {
        
            System.out.println("sin conexion");
                    
        
        }
        
        ;
      
       
    //    JOptionPane.showMessageDialog(null," juego "+ mijuego1.toString());
    //   JOptionPane.showMessageDialog(null," Jugador "+ mijugador1.toString());
    //    JOptionPane.showMessageDialog(null," Resultado " + mijugadas1.toString());
        
    }
    
}
