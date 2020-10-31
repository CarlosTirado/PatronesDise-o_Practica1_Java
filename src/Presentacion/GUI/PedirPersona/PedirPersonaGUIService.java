/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion.GUI.PedirPersona;

import Models.Persona;
import Presentacion.GUI.PedirPersona.Factory.IPedirPersonaGUIService;
import Presentacion.GUI.PedirPersona.Factory.IPedirPersonaGUIServiceFactory;
import Presentacion.GUI.PedirPersona.Factory.PedirPersonaGUIServiceFactory;
import Presentacion.Interfaces.IPedirPersonaService;

/**
 *
 * @author LENOVO
 */
public class PedirPersonaGUIService implements IPedirPersonaService {

    @Override
    public Persona PedirPersona(String tipoPersona) {
        IPedirPersonaGUIServiceFactory pedirPersonaGUIServiceFactory = new PedirPersonaGUIServiceFactory();
        IPedirPersonaGUIService pedirPersonaGUIService = pedirPersonaGUIServiceFactory.Fabricar(tipoPersona);
        return pedirPersonaGUIService.PedirPersona();
    }
    
}
