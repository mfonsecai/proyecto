/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operaciones;

import Dato.Cliente;
import Dato.Cuenta;
import Dato.Opciones;

/**
 *
 * @author majo
 */
public class GestorCuentas {
    public Cuenta crearCuentaAhorro (String nombre,String tidentificacion, int valorinicial){
        if (nombre == null || tidentificacion == null || valorinicial == 0
            || nombre.isEmpty() || tidentificacion.isEmpty() ){
        return null;
    }else{
            Cuenta cAhorro = this.crearCuentaAhorro(nombre, tidentificacion, valorinicial);
            Cuenta a = new Cuenta (cAhorro);
            return a;
        }
            
    }
}
