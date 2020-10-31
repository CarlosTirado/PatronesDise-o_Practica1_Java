/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion.GUI.PedirPersona.Factory;

import Models.Cliente;
import Models.Persona;
import Presentacion.Consola.EntradaValorService;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class PedirPersonaGUIClienteService implements IPedirPersonaGUIService {

    @Override
    public Persona PedirPersona() {
        
        JOptionPane.showMessageDialog(null, "Solicitando información de un Cliente");
        
        Cliente persona = new Cliente();
        persona.SetIdentificacion(JOptionPane.showInputDialog("Digite Identificación: "));
        persona.SetNombre(JOptionPane.showInputDialog("Digite Nombre: "));

        return persona;
    }
}
 