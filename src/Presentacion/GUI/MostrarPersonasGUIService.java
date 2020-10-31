/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion.GUI;

import Models.Persona;
import Presentacion.Interfaces.IMostrarPersonasService;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class MostrarPersonasGUIService implements IMostrarPersonasService {

    @Override
    public void Mostrar(ArrayList<Persona> personas) {
        
        JOptionPane.showMessageDialog(null, "A continuación mostraremos las personas registradas");
        
        for (Persona persona : personas)
        { 
            JOptionPane.showMessageDialog(null, persona.ToString());
        }
    }
}
