/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion.Hibrida;

import Presentacion.Consola.MostrarPersonasConsolaService;
import Presentacion.Consola.PreguntarTipoPersonaConsolaService;
import Presentacion.GUI.PedirPersona.PedirPersonaGUIService;
import Presentacion.GUI.PreguntarSiPedirOtraPreguntaGUIService;
import Presentacion.Interfaces.IManejadorPresentacionAbstractFactory;
import Presentacion.Interfaces.IMostrarPersonasService;
import Presentacion.Interfaces.IPedirPersonaService;
import Presentacion.Interfaces.IPreguntarSiPedirOtraPersonaService;
import Presentacion.Interfaces.IPreguntarTipoPersonaService;

/**
 *
 * @author LENOVO
 */
public class ManejadorPresentacionHibrida implements IManejadorPresentacionAbstractFactory{

    @Override
    public IPreguntarTipoPersonaService CrearPreguntarTipoPersonaService() {
        return new PreguntarTipoPersonaConsolaService();
    }

    @Override
    public IPedirPersonaService CrearPedirPersonaService() {
        return new PedirPersonaGUIService();
    }

    @Override
    public IPreguntarSiPedirOtraPersonaService CrearPreguntarSiPedirOtraPersonaService() {
        return new PreguntarSiPedirOtraPreguntaGUIService();
    }

    @Override
    public IMostrarPersonasService CrearMostrarPersonasService() {
        return new MostrarPersonasConsolaService();
    }
    
}
