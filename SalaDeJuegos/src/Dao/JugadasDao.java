package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class JugadasDao{
    
    public ArrayList<String> retornarJugadas(){
        
        ArrayList<String> lista = new ArrayList<String>();
        
        try {
            Conexion con= new Conexion();
            Connection conn= con.RetornarConeccion();
            
            PreparedStatement ps=conn.prepareStatement("SELECT Nombre FROM jugador_juego");
            ResultSet rs=ps.executeQuery();
            
            
            while(rs.next()){
                
                lista.add(rs.getString("resultado"));
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        
        return lista;
    }
    
    
}