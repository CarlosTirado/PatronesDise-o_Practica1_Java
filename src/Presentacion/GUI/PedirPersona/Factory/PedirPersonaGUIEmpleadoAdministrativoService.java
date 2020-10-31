/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion.GUI.PedirPersona.Factory;

import Models.EmpleadoAdministrativo;
import Models.Persona;
import Presentacion.Consola.EntradaValorService;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class PedirPersonaGUIEmpleadoAdministrativoService implements IPedirPersonaGUIService {

    @Override
    public Persona PedirPersona() {
        
        JOptionPane.showMessageDialog(null, "Solicitando información de un Empleado Administrativo");
        
        EmpleadoAdministrativo persona = new EmpleadoAdministrativo();
        persona.SetIdentificacion(JOptionPane.showInputDialog("Digite Identificación: "));
        persona.SetNombre(JOptionPane.showInputDialog("Digite Nombre: "));
        
        String valorSalarioBase = JOptionPane.showInputDialog("Digite Salario base: ");
        persona.SetSalarioBase(Double.parseDouble(valorSalarioBase));

        return persona;
    }
    
}
