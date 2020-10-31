/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion.Consola.PedirPersona;

import Models.Persona;
import Presentacion.Consola.PedirPersona.Factory.IPedirPersonaConsolaService;
import Presentacion.Consola.PedirPersona.Factory.IPedirPersonaConsolaServiceFactory;
import Presentacion.Consola.PedirPersona.Factory.PedirPersonaConsolaServiceFactory;
import Presentacion.Interfaces.IPedirPersonaService;

/**
 *
 * @author LENOVO
 */
public class PedirPersonaConsolaService implements IPedirPersonaService {

    @Override
    public Persona PedirPersona(String tipoPersona) {
        IPedirPersonaConsolaServiceFactory pedirPersonaConsolaServiceFactory = new PedirPersonaConsolaServiceFactory();
        IPedirPersonaConsolaService pedirPersonaConsolaService = pedirPersonaConsolaServiceFactory.Fabricar(tipoPersona);
        return pedirPersonaConsolaService.PedirPersona();
    }
    
}
