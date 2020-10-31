/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion.Consola.PedirPersona.Factory;

/**
 *
 * @author LENOVO
 */
public interface IPedirPersonaConsolaServiceFactory {
    IPedirPersonaConsolaService Fabricar(String tipoPersona);
}
