/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion.Consola.PedirPersona.Factory;

import Models.EmpleadoAdministrativo;
import Models.Persona;
import Presentacion.Consola.EntradaValorService;

/**
 *
 * @author LENOVO
 */
public class PedirPersonaConsolaEmpleadoAdministrativoService implements IPedirPersonaConsolaService {

    @Override
    public Persona PedirPersona() {
        System.out.println("Solicitando informacion de Empleado Administrativo");
        EmpleadoAdministrativo persona = new EmpleadoAdministrativo();
        persona.SetIdentificacion(EntradaValorService.PedirValorTexto("Identificacion"));
        persona.SetNombre(EntradaValorService.PedirValorTexto("Nombre"));
        persona.SetSalarioBase(EntradaValorService.PedirValorNumeroDecimal("Salario base"));
        System.out.println("");
        return persona;
    }
    
}
