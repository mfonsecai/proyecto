/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operaciones;

/**
 *
 * @author majit
 */
public abstract class GestionDatosC {
    private String digitoGen;
    
    public abstract int[] construirAleatorio();
    
    public int generarAleatorio(){
        int g = (int) (Math.random()*(9-0+1)+0);
        return g;
    }
    
}
