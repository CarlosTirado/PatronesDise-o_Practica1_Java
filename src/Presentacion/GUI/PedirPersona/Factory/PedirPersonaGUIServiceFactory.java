/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion.GUI.PedirPersona.Factory;


/** 
 *
 * @author LENOVO
 */
public class PedirPersonaGUIServiceFactory implements IPedirPersonaGUIServiceFactory{

    @Override
    public IPedirPersonaGUIService Fabricar(String tipoPersona) {
        switch (tipoPersona)
        { 
            case "CLIENTE": 
                return new PedirPersonaGUIClienteService();
            case "EMPLEADO_ADMINISTRATIVO": 
                return new PedirPersonaGUIEmpleadoAdministrativoService();
            case "EMPLEADO_OPERARIO": 
                return new PedirPersonaGUIEmpleadoOperarioService();
            default:
                return null;
        }
    }
}
 