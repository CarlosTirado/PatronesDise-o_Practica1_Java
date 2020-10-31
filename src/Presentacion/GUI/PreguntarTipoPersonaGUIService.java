/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion.GUI;

import Presentacion.Interfaces.IPreguntarTipoPersonaService;
import java.awt.Component;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class PreguntarTipoPersonaGUIService implements IPreguntarTipoPersonaService {

    @Override
    public String Preguntar() {
        
        String[] options = {"Cliente", "Empleado administrativo", "Empleado operario"};
        
        int ordenOpcionSeleccionada = JOptionPane.showOptionDialog(
                null, 
                "¿Qué tipo de persona desea crear?",
                "Seleccione una opción",
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        
        switch(ordenOpcionSeleccionada)
        {
            case 0: 
                return "CLIENTE";
            case 1: 
                return "EMPLEADO_ADMINISTRATIVO";
            case 2: 
                return "EMPLEADO_OPERARIO";
            default: 
                return ""; 
        }
    }
}
   