/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion.Consola;

import Presentacion.Interfaces.IPreguntarTipoPersonaService;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class PreguntarTipoPersonaConsolaService implements IPreguntarTipoPersonaService{

    @Override
    public String Preguntar() {
        
        System.out.println("Solicitando informacion de Empleado Operario");
        System.out.println("¿Qué tipo de persona desea crear?");
        System.out.println("1. Cliente"); 
        System.out.println("2. Empleado administrativo");
        System.out.println("3. Empleado operario");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Seleccione una opción: ");
        String tipoPersonaACrear = scanner.nextLine();

        System.out.println("");
        
        if(tipoPersonaACrear.equals("1")) return "CLIENTE";
        if(tipoPersonaACrear.equals("2")) return "EMPLEADO_ADMINISTRATIVO";
        if(tipoPersonaACrear.equals("3")) return "EMPLEADO_OPERARIO";
        
        return ""; 
        
        
    }
} 
