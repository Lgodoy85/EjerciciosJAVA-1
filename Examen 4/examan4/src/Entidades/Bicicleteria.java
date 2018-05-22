package Entidades;

import java.util.ArrayList;
import java.util.List;

public class Bicicleteria {

private List <Bicicleta> bicicletas;
private float ganancias;
private int CantidadDeVentas;

public Bicicleteria(){
    
    this.ganancias=0;
    this.CantidadDeVentas=0;
    bicicletas= new ArrayList<Bicicleta>();

}


//Programar en Java el código del método buscarBicicleta en la clase Bicicleteria. El mismo recibirá por
//parámetros una variable llamada nroDeSerie de tipo String y retornará la bicicleta con dicho nroDeSerie.
//En caso de no encontrarlo deberá retornar null.

public Bicicleta buscarBicicleta (String NroDeSerie){
    
    Bicicleta auxBicicleta = null;
    
    for (Bicicleta bicicleta : bicicletas) {
        
        if (bicicleta.getNroDeSerie().equalsIgnoreCase(NroDeSerie)){
        
            auxBicicleta = bicicleta;
            break;
        }
        
    }

    return auxBicicleta;

}

public void VenderBicicleta (Bicicleta bicicleta){

    bicicletas.remove(bicicleta);
    CantidadDeVentas++;
    ganancias=ganancias+bicicleta.getPrecio();

}

public void AddBicicleta(Bicicleta mibici){

    bicicletas.add(mibici);
    
}

    @Override
    public String toString() {
    return "Bicicleteria{" + "bicicletas=" + bicicletas + ", ganancias=" + ganancias + ", CantidadDeVentas=" + CantidadDeVentas + '}';
    }




    
}
