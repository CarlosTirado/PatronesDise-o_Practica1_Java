/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion.Interfaces;

/**
 *
 * @author LENOVO
 */
public interface IManejadorPresentacionAbstractFactory {
    IPreguntarTipoPersonaService CrearPreguntarTipoPersonaService();
    IPedirPersonaService CrearPedirPersonaService();
    IPreguntarSiPedirOtraPersonaService CrearPreguntarSiPedirOtraPersonaService();
    IMostrarPersonasService CrearMostrarPersonasService();
}
 