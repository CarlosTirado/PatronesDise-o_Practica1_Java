/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author LENOVO
 */
public abstract class Persona {
    protected String Identificacion;
    protected String Nombre;
    
     public abstract String ToString();
        
    public final void SetNombre(String nombre) {
        this.Nombre = nombre.toUpperCase();
    }

    public final void SetIdentificacion(String identificacion) {
        this.Identificacion = identificacion;
    }
}
 