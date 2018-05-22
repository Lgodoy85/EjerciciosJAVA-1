package examan4;

import Entidades.Bicicleta;
import Entidades.Bicicleteria;
import javax.swing.JOptionPane;

public class Examan4 {

    public static void main(String[] args) {

        Bicicleta mibici = new Bicicleta("150", "Mountain Bike", 5, 15);
        
        Bicicleteria nuevabici = new Bicicleteria();
        nuevabici.VenderBicicleta(mibici);
        nuevabici.AddBicicleta(mibici);
        

        JOptionPane.showMessageDialog(null,"Buscar bicicleta : "+ nuevabici.buscarBicicleta("150"));
    }
    
}
