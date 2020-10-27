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
public class EmpleadoOperario extends Empleado{
    
    private int HorasExtras;
    
    @Override
    public String MostrarPersona()
    {
        return "Identificación: " + Identificacion + " - Nombre: " + Nombre + " - Salario base: " + SalarioBase + " - Salario total: " + GetSalarioTotal() + " -> (Empleado) -> (EmpleadoOperario)";
    }
    
    public void SetHorasExtras(int horasExtras)
        {
            HorasExtras = horasExtras;
        }
        
    @Override
    protected double GetSalarioTotal()
    {
        return SalarioBase + (HorasExtras * 40000);
    }
}