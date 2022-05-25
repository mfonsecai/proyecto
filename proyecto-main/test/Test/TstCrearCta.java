/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import junit.framework.Assert;
import org.junit.Test;
import utilidades.GArchivos;

/**
 *
 * @author majit
 */
public class TstCrearCta {  
     @Test
    public void guardarNull()
    {
        String abc = "majo";
        
        boolean rta = GArchivos.guardar(" ", abc);
        System.out.println(rta);
        Assert.assertEquals(rta,false);
    }
    @Test
    public void guardarNull2()
    {
        boolean rta = GArchivos.guardar(null, null);
        System.err.println(rta);
        Assert.assertEquals(rta, false);
    }
    @Test
    public void guardar()
    {
        boolean rta = GArchivos.guardar("Archivos.txt", null);
        System.out.println(rta);
        Assert.assertEquals(rta, false);
    }
    @Test
    public void leer()
    {
        String rta = (String)GArchivos.leer("Archivos.txt");
        Assert.assertNull(rta);
    }
}
