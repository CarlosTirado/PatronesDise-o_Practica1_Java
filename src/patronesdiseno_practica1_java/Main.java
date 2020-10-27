/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronesdiseno_practica1_java;

import Models.Persona;
import Services.EntradaClienteService;
import Services.EntradaEmpleadoAdministrativoService;
import Services.EntradaEmpleadoOperarioService;
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
         int indexPersonas = 0;
        String pedirPersona = "";
        ArrayList<Persona> personas = new ArrayList();
        
        do
        {
            indexPersonas++;

            System.out.println("Persona " + indexPersonas);
            String tipoPersona = PreguntarTipoPersona();
            System.out.println(); 

            switch (tipoPersona)
            { 
                case "1": 
                    Persona cliente = EntradaClienteService.PedirCliente();
                    personas.add(cliente);
                    break;
                case "2": 
                    Persona empleadoAdministrativo = EntradaEmpleadoAdministrativoService.PedirEmpleadoAdministrativo();
                    personas.add(empleadoAdministrativo);
                    break;
                case "3": 
                    Persona empleadoOperario = EntradaEmpleadoOperarioService.PedirEmpleadoOperario();
                    personas.add(empleadoOperario); 
                    break;
                default:
                    System.out.println("Opción no valida");
                    break;
            } 

            pedirPersona = PreguntarDeseaPedirOtraPersona();

        } while (pedirPersona.toUpperCase().equals("S"));



        System.out.println("Resultado ---->");
        for (Persona persona : personas)
        { 
            System.out.println(persona.MostrarPersona());
        }
    }
    
    
        private static String PreguntarTipoPersona()
    {
        System.out.println("Solicitando informacion de Empleado Operario");
        System.out.println("¿Qué tipo de persona desea crear?");
        System.out.println("1. Cliente"); 
        System.out.println("2. Empleado administrativo");
        System.out.println("3. Empleado operario");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Seleccione una opción: ");
        String tipoPersonaACrear = scanner.nextLine();

        System.out.println("");
        return tipoPersonaACrear; 
    }

    private static String PreguntarDeseaPedirOtraPersona()
    {
        System.out.print("¿Desea pedir otra persona? (S/N) --> ");
        
        Scanner scanner = new Scanner(System.in);
        String crearOtraPersona = scanner.nextLine(); 
        
        System.out.println("");

        return crearOtraPersona;
    }
}
