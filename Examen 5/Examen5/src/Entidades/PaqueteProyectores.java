package Entidades;

public class PaqueteProyectores {
private String destinatario;
private String destino;
private int CodigoPaqueteDeProyectores;
private float CostoEnvio;
private boolean enTransito;

    public PaqueteProyectores(String destinatario,float Costoenvio, String destino, int CodPaquete){
        this.destino = destino;
        this.destinatario=destinatario;
        this.CodigoPaqueteDeProyectores = CodPaquete;
        this.CostoEnvio=Costoenvio;
    }
    
    public void setCodPaquete (int codigo){
        
        this.CodigoPaqueteDeProyectores=codigo;
    
    }
    
    public int getCodPaquete (){
    
    return this.CodigoPaqueteDeProyectores;
        
    }
    
    public boolean getEntransito (){
    
        return this.enTransito;
        
    }
    
    public void setEnTransito (boolean entransito){
    
        this.enTransito=entransito;
        
    }
    
    public void setDestinatario (String destinatario){
    
        this.destinatario=destinatario;
        
    }

    @Override
    public String toString() {
    return "PaqueteProyectores{" + "destinatario=" +
    destinatario + ", destino=" + destino + ", CodigoPaqueteDeProyectores=" + 
    CodigoPaqueteDeProyectores + ", CostoEnvio=" + CostoEnvio + ", enTransito=" + enTransito + '}';
    }
    
    
    
    
}