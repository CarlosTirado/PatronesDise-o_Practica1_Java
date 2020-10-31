/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion.Consola;

import Presentacion.Consola.PedirPersona.PedirPersonaConsolaService;
import Presentacion.Interfaces.IMostrarPersonasService;
import Presentacion.Interfaces.IPedirPersonaService;
import Presentacion.Interfaces.IPreguntarSiPedirOtraPersonaService;
import Presentacion.Interfaces.IPreguntarTipoPersonaService;
import Presentacion.Interfaces.IManejadorPresentacionAbstractFactory;

/**
 *
 * @author LENOVO
 */
public class ManejadorPresentacionConsola implements IManejadorPresentacionAbstractFactory {

    @Override
    public IPreguntarTipoPersonaService CrearPreguntarTipoPersonaService() {
        return new PreguntarTipoPersonaConsolaService();
    }


    @Override
    public IPedirPersonaService CrearPedirPersonaService() {
        return new PedirPersonaConsolaService();
    }

    @Override
    public IPreguntarSiPedirOtraPersonaService CrearPreguntarSiPedirOtraPersonaService() {
        return new PreguntarSiPedirOtraPersonaConsolaService();
    }

    @Override
    public IMostrarPersonasService CrearMostrarPersonasService() {
        return new MostrarPersonasConsolaService();
    }
}
