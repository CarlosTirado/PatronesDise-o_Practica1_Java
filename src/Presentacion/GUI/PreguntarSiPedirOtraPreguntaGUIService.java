/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion.GUI;

import Presentacion.Interfaces.IPreguntarSiPedirOtraPersonaService;
import Presentacion.Interfaces.IPreguntarTipoPersonaService;
import java.awt.Component;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class PreguntarSiPedirOtraPreguntaGUIService implements IPreguntarSiPedirOtraPersonaService {

    @Override
    public Boolean Preguntar() {
        
        String[] options = {"SI", "NO"};
        
        int ordenOpcionSeleccionada = JOptionPane.showOptionDialog(
                null, 
                "¿Desea crear otra persona?",
                "Seleccione una opción",
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        
        switch(ordenOpcionSeleccionada)
        {
            case 0: 
                return true;
            case 1: 
                return false;
            default: 
                return false; 
        }
    }
}