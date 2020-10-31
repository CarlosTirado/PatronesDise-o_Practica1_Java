/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronesdiseno_practica1_java;

import Models.Persona;
import Presentacion.Consola.ManejadorPresentacionConsola;
import Presentacion.GUI.ManejadorPresentacionGUI;
import Presentacion.Interfaces.IManejadorPresentacionAbstractFactory;
import Presentacion.Interfaces.IMostrarPersonasService;
import Presentacion.Interfaces.IPedirPersonaService;
import Presentacion.Interfaces.IPreguntarSiPedirOtraPersonaService;
import Presentacion.Interfaces.IPreguntarTipoPersonaService;
import java.util.ArrayList;
import java.util.Scanner;

/** 
 *
 * @author LENOVO 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Boolean pedirOtraPersona = false;
        ArrayList<Persona> personas = new ArrayList();
        IManejadorPresentacionAbstractFactory manejadorPresentacionAbstractFactory = new ManejadorPresentacionGUI();
          
        do
        {

            IPreguntarTipoPersonaService preguntarTipoPersonaService = manejadorPresentacionAbstractFactory.CrearPreguntarTipoPersonaService();
            String tipoPersona = preguntarTipoPersonaService.Preguntar();

            IPedirPersonaService pedirPersonaService = manejadorPresentacionAbstractFactory.CrearPedirPersonaService();
            Persona persona = pedirPersonaService.PedirPersona(tipoPersona);
            
            personas.add(persona);
            
            IPreguntarSiPedirOtraPersonaService preguntarSiPedirOtraPersonaService = manejadorPresentacionAbstractFactory.CrearPreguntarSiPedirOtraPersonaService();
            pedirOtraPersona = preguntarSiPedirOtraPersonaService.Preguntar();
            

        } while (pedirOtraPersona);

        IMostrarPersonasService mostrarPersonasService = manejadorPresentacionAbstractFactory.CrearMostrarPersonasService();
        mostrarPersonasService.Mostrar(personas);
    }
}
 