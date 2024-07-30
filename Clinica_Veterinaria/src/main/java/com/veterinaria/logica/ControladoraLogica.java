
package com.veterinaria.logica;

import com.veterinaria.persistencia.ControladoraPersistencia;

public class ControladoraLogica {
    
    ControladoraPersistencia cp = new ControladoraPersistencia();

    public void agrgarCliente(String nombre, String apellido, int dni) {
        
        Cliente cli = new Cliente();
        cli.setNombre(nombre);
        cli.setApellido(apellido);
        cli.setDni(dni);
        cp.agregarCliente(cli);
    }

}
