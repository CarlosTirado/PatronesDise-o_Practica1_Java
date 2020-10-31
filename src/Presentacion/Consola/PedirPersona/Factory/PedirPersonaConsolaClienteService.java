/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion.Consola.PedirPersona.Factory;

import Models.Cliente;
import Models.EmpleadoAdministrativo;
import Models.EmpleadoOperario;
import Models.Persona;
import Presentacion.Consola.EntradaValorService;

/**
 *
 * @author LENOVO
 */
public class PedirPersonaConsolaClienteService implements IPedirPersonaConsolaService {

    @Override
    public Persona PedirPersona() {
        System.out.println("Solicitando informacion de Cliente");
        Cliente persona = new Cliente();
        persona.SetIdentificacion(EntradaValorService.PedirValorTexto("Identificacion"));
        persona.SetNombre(EntradaValorService.PedirValorTexto("Nombre"));
        System.out.println("");

        return persona;
    }
}
