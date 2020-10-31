/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion.Consola;

import Presentacion.Interfaces.IPreguntarSiPedirOtraPersonaService;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class PreguntarSiPedirOtraPersonaConsolaService implements IPreguntarSiPedirOtraPersonaService {

    @Override
    public Boolean Preguntar() {
        System.out.print("¿Desea pedir otra persona? (S/N) --> ");
        
        Scanner scanner = new Scanner(System.in);
        String crearOtraPersona = scanner.nextLine(); 
        
        System.out.println("");

        return crearOtraPersona.toUpperCase().equals("S");
    }
    
}
 