package Dato;

import java.io.Serializable;

/**
 *
 * @author Majo
 */
public class Cliente implements Serializable {
    private String nombre;
    private String identificacion;
    private String tipoId;
    
    public String obNombre()
    {
        return this.nombre;
    }
    public String obIdentificacion()
    {
        return this.identificacion;
    }
    public String obtipoId()
    {
        return this.tipoId;
    }

    public void modiNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public void modiIdentificacion(String identificacion)
    {
        this.identificacion = identificacion;
    }
     public void modiTipoId(String tipoId)
    {
        this.tipoId = tipoId;
    }

   @Override
    public String toString()
    {
        return "Cliente : "+this.nombre+" con identificación: "+this.identificacion +" tipo de identificacion: "+this.tipoId;
    }
}
