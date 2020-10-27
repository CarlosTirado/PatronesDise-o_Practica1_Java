/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Models.Cliente;

/**
 *
 * @author LENOVO
 */
public class EntradaClienteService {
    public static Cliente PedirCliente()
    {
        System.out.println("Solicitando informacion de Cliente");
        Cliente persona = new Cliente();
        persona.SetIdentificacion(EntradaValorService.PedirValorTexto("Identificacion"));
        persona.SetNombre(EntradaValorService.PedirValorTexto("Nombre"));
        System.out.println("");

        return persona;
    }
}

