package Dato;

import java.io.Serializable;

/**
 *
 * @author majo
 */
public class Cuenta implements Serializable {
    private Cliente elCliente;
    private String generarNumc;
    private double valor;

    public Cuenta(Cliente elCliente, double valor, String generarNumc) {
        this.elCliente=elCliente;
        this.valor=valor;
        this.generarNumc=generarNumc;
    }
    
    public double obValor()
    {
        return this.valor;
    }
    public Cliente obElCliente()
    {
        return this.elCliente;
    }

    public String generarNumc() 
    {
        return generarNumc;
    }
    
    public void modiValor(double valor)
    {
        this.valor = valor;
    }
    public void modiElCliente(Cliente elCliente)
    {
        this.elCliente = elCliente;
    }
     public void setGenerarNumc(String genCuenta) 
    {
        this.generarNumc = genCuenta;
    }
 @Override
    public String toString()
    {
        return "Numero de cuenta: "+generarNumc+" del cliente: "+elCliente+" con saldo: "+valor;
    }
       
}
    
    
    

