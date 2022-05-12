package Dato;

/**
 *
 * @author Majo
 */
public class Cliente {
    private String nombre;
    private String identificacion;
    private int valorinicial;
    
    public Cliente(String nombre, String identificacion, int valorinicial){
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.valorinicial= valorinicial;
    }
    public Cliente(String identificacion){ 
        this.identificacion = identificacion;
    }
    
    public String obtenerNombre(){
        return this.nombre;
    }
    public String obtenerIdentificacion(){
        return this.identificacion;
    }
    public int obtenerValorinicial(){
        return this.valorinicial;
    }
}
