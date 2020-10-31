/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion.Consola;

import Models.Persona;
import Presentacion.Interfaces.IMostrarPersonasService;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class MostrarPersonasConsolaService implements IMostrarPersonasService {

    @Override
    public void Mostrar(ArrayList<Persona> personas) {
        
        
        System.out.println("Resultado ---->");
        
        for (Persona persona : personas)
        { 
            System.out.println(persona.MostrarPersona());
        }
        
    }
    
}
