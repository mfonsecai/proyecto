/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operaciones;

import Dato.Cliente;
import Dato.Cuenta;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import utilidades.GPersistencia;

/**
 *
 * @author majo
 */
public class GestionDatos extends GestionDatosC implements Serializable{
   public Map<String, Cuenta> ListaCuentas;
    public GestionDatos()
    {
        if(ListaCuentas == null)
        {
            ListaCuentas = (Map<String, Cuenta>) GPersistencia.recuperar();
            if(ListaCuentas == null)
            {
                ListaCuentas = new HashMap<>();
            }
        }
        
    }
   private Cliente crearCliente(String nombre, String identificacion, String tipoId)
    {
        Cliente m = new Cliente();
        m.modiNombre(nombre);
        m.modiIdentificacion(identificacion);
        m.modiTipoId(tipoId);
        return m;
    }
    
    public Cuenta crearCuenta(String nombre, String identificacion, String tipoId, double valor)
    {
        if(nombre == null || identificacion == null || nombre.isEmpty() || identificacion.isEmpty())
        {
            return null;
        }
        else
        {
            Cliente elCliente = this.crearCliente(nombre, identificacion, tipoId);
            Cuenta c = new Cuenta(elCliente, valor, extraerDigitoId(identificacion));
            ListaCuentas.put(c.generarNumc(),c);
            GPersistencia.guardar(ListaCuentas);
            return c;
        }
    }
   /* public Cuenta modificarValor(double valor)
    {
        if(valor == -1)
        {
           return null;
        }
        else 
        {
            Cuenta obValor = this.modificarValor(valor);
            Cuenta p = new Cuenta();
            p.modiValor(valor);
            
            return p;
        }
    }*/
    public String extraerDigitoId(String identificacion){
       if (identificacion.length()>4){
           char num1 = identificacion.charAt(identificacion.length()-1);
           char num2 = identificacion.charAt(identificacion.length()-2);
           char num3 = identificacion.charAt(identificacion.length()-3);
           char num4 = identificacion.charAt(identificacion.length()-4);
           
           String Digitos = (Character.toString(num1)+Character.toString(num2)+Character.toString(num3)+Character.toString(num4));
           
           int[] n = construirAleatorio();
           String numeroCuenta ="03"+"19"+Digitos+Arrays.toString(n).format("","");
           toString();
           return numeroCuenta;
       }   
       else
       {
            return null;
       }
    } 
    
    @Override
    public int[] construirAleatorio() {
        {
        int numero[] = new int [4];
        
        int num1 = generarAleatorio();
        numero [0]=num1;
        int posicion=1;
        while(posicion<4)
        {
           int num2 = generarAleatorio();
           boolean existe=false;
           for(int i=0; i<posicion; i++){
               if (numero[i]==num2)
               {
                   existe=true;
               }
           }
           if(!existe )
           {
               numero [posicion++]=num2;
           }
        }
        return numero;
        }
    }
    @Override
    public String toString()
    {
        return "El numero es: "+this.construirAleatorio();
    }
    
    public Map<String, Cuenta> obtenerLista(){
        return (Map<String, Cuenta>) this.ListaCuentas;
    }
}
