package examen5;

import Entidades.GestorDePaqueteDeProyectores;
import Entidades.PaqueteProyectores;
import javax.swing.JOptionPane;

public class Examen5 {

    public static void main(String[] args) {

        PaqueteProyectores paquetes = new PaqueteProyectores("Leo", 15, "Ushuaia", 10);
        GestorDePaqueteDeProyectores gestor = new GestorDePaqueteDeProyectores("Arcor");
        gestor.AgregarPaquete(paquetes);
        
        
        JOptionPane.showMessageDialog(null,"Buscar paquete : " +gestor.BuscarPaqueteDeProyectores(10));
        
        
        
        
        
        
    }

}
