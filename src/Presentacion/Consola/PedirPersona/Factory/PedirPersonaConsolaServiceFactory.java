/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion.Consola.PedirPersona.Factory;

import Models.Persona;

/** 
 *
 * @author LENOVO
 */
public class PedirPersonaConsolaServiceFactory implements IPedirPersonaConsolaServiceFactory{

    @Override
    public IPedirPersonaConsolaService Fabricar(String tipoPersona) {
        switch (tipoPersona)
        { 
            case "CLIENTE": 
                return new PedirPersonaConsolaClienteService();
            case "EMPLEADO_ADMINISTRATIVO": 
                return new PedirPersonaConsolaEmpleadoAdministrativoService();
            case "EMPLEADO_OPERARIO": 
                return new PedirPersonaConsolaEmpleadoOperarioService();
            default:
                return null;
        }
    }
}
 