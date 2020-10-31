/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion.GUI;

import Models.Persona;
import Presentacion.Consola.MostrarPersonasConsolaService;
import Presentacion.Consola.PedirPersona.PedirPersonaConsolaService;
import Presentacion.Consola.PreguntarSiPedirOtraPersonaConsolaService;
import Presentacion.Consola.PreguntarTipoPersonaConsolaService;
import Presentacion.Interfaces.IManejadorPresentacionAbstractFactory;
import Presentacion.Interfaces.IMostrarPersonasService;
import Presentacion.Interfaces.IPedirPersonaService;
import Presentacion.Interfaces.IPreguntarSiPedirOtraPersonaService;
import Presentacion.Interfaces.IPreguntarTipoPersonaService;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class ManejadorPresentacionGUI implements IManejadorPresentacionAbstractFactory {

    @Override
    public IPreguntarTipoPersonaService CrearPreguntarTipoPersonaService() {
        return new PreguntarTipoPersonaGUIService();
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
