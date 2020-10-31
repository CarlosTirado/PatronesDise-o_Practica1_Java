/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion.GUI.PedirPersona.Factory;

import Models.EmpleadoOperario;
import Models.Persona;
import Presentacion.Consola.EntradaValorService;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class PedirPersonaGUIEmpleadoOperarioService implements IPedirPersonaGUIService {

    @Override
    public Persona PedirPersona() {
        
        JOptionPane.showMessageDialog(null, "Solicitando información de un Empleado Operario");
        
        EmpleadoOperario persona = new EmpleadoOperario();
        persona.SetIdentificacion(JOptionPane.showInputDialog("Digite Identificación: "));
        persona.SetNombre(JOptionPane.showInputDialog("Digite Nombre: "));
        
        String valorSalarioBase = JOptionPane.showInputDialog("Digite Salario base: ");
        persona.SetSalarioBase(Double.parseDouble(valorSalarioBase));
        
        String horasExtras = JOptionPane.showInputDialog("Digite Horas extras: ");
        persona.SetHorasExtras(Integer.parseInt(horasExtras));
        
        return persona; 
    }
    
}
