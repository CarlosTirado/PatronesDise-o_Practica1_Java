/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class EntradaValorService {
    public static String PedirValorTexto(String nombreCampo)
    {
        String value = PedirValor(nombreCampo);
        return value;
    }

    public static double PedirValorNumeroDecimal(String nombreCampo)
    {
        String value = PedirValor(nombreCampo);
        return Double.parseDouble(value);
    }

    public static int PedirValorNumeroEntero(String nombreCampo)
    {
       String value = PedirValor(nombreCampo); 
        return Integer.parseInt(value);
    }

    private static String PedirValor(String nombreCampo)
    {
        System.out.print("Digite " +  nombreCampo + ": ");
        
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine(); 
        
        return value;
    }
}
