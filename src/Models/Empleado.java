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
public abstract class Empleado extends Persona{
    
    protected double SalarioBase;
     
    public abstract String ToString();

    public void SetSalarioBase(Double salario) 
    {
        SalarioBase = salario;
    }

    protected double GetSalarioTotal()
    {
        return SalarioBase;
    }
}
