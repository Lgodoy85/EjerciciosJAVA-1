package Entidades;

import java.util.ArrayList;
import java.util.List;

public class GestorDePaqueteDeProyectores {

    private List<PaqueteProyectores> paquetes;
    private String NombreEmpresa;

    public GestorDePaqueteDeProyectores(String NombreEmpresa) {

        this.NombreEmpresa = NombreEmpresa;
        this.paquetes = new ArrayList<>();

    }

//Programar en Java el código del método buscarPaqueteDeProyectores en la clase
//GestorDePaqueteDeProyectores. El mismo recibirá por parámetro una variable llamada codPaq de tipo
//int y retornará el paquete correspondiente a ese código. En caso de no encontrarlo deberá retornar null.
    public PaqueteProyectores BuscarPaqueteDeProyectores(int codpaq) {

        PaqueteProyectores aux = null;

        for (PaqueteProyectores paquete : paquetes) {

            if (paquete.getCodPaquete() == codpaq) {

                aux = paquete;
                break;
            }

        }
        return aux;
    }

    public String getNombreEmpresa() {
        return NombreEmpresa;
    }

    public void setNombreEmpresa(String NombreEmpresa) {
        this.NombreEmpresa = NombreEmpresa;
    }

    public void AgregarPaquete(PaqueteProyectores paquete) {

        this.paquetes.add(paquete);

    }

    @Override
    public String toString() {
    return "GestorDePaqueteDeProyectores{" + "paquetes=" + paquetes +
    ", NombreEmpresa=" + NombreEmpresa + '}';
    }


    

}
