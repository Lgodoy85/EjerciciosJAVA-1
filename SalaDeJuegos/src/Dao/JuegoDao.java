package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class JuegoDao {
 
    public ArrayList<String> retornarJuego(){
        
        ArrayList<String> lista = new ArrayList<String>();
        
        try {
            Conexion con= new Conexion();
            Connection conn= con.RetornarConeccion();
            
            PreparedStatement ps=conn.prepareStatement("SELECT Nombre FROM juego");
            ResultSet rs=ps.executeQuery();
            
            
            while(rs.next()){
                
                lista.add(rs.getString("Nombre"));
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        
        return lista;
    }
    
}
