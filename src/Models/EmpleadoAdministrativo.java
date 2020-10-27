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
public class EmpleadoAdministrativo extends Empleado{
    
    @Override
    public String MostrarPersona()
    {
        return "Identificación: " + Identificacion + " - Nombre: " + Nombre + " - Salario base: " + SalarioBase + " - Salario total: " + GetSalarioTotal() + " -> (Empleado) -> (EmpleadoAdministrativo)";
    }
}
