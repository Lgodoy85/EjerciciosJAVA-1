package Entidades;
// Generated 03/04/2018 16:15:58 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Tipo generated by hbm2java
 */
public class Tipo  implements java.io.Serializable {


     private Integer idTipo;
     private String tipoNombre;
     private Set funcions = new HashSet(0);

    public Tipo() {
    }

	
    public Tipo(String tipoNombre) {
        this.tipoNombre = tipoNombre;
    }
    public Tipo(String tipoNombre, Set funcions) {
       this.tipoNombre = tipoNombre;
       this.funcions = funcions;
    }
   
    public Integer getIdTipo() {
        return this.idTipo;
    }
    
    public void setIdTipo(Integer idTipo) {
        this.idTipo = idTipo;
    }
    public String getTipoNombre() {
        return this.tipoNombre;
    }
    
    public void setTipoNombre(String tipoNombre) {
        this.tipoNombre = tipoNombre;
    }
    public Set getFuncions() {
        return this.funcions;
    }
    
    public void setFuncions(Set funcions) {
        this.funcions = funcions;
    }




}


