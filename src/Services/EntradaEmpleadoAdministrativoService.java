/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Models.Empleado;
import Models.EmpleadoAdministrativo;

/**
 *
 * @author LENOVO
 */
public class EntradaEmpleadoAdministrativoService { 
    public static Empleado PedirEmpleadoAdministrativo()
        {
            System.out.println("Solicitando informacion de Empleado Administrativo");
            EmpleadoAdministrativo persona = new EmpleadoAdministrativo();
            persona.SetIdentificacion(EntradaValorService.PedirValorTexto("Identificacion"));
            persona.SetNombre(EntradaValorService.PedirValorTexto("Nombre"));
            persona.SetSalario(EntradaValorService.PedirValorNumeroDecimal("Salario base"));
            System.out.println("");
            return persona;
        } 
}
