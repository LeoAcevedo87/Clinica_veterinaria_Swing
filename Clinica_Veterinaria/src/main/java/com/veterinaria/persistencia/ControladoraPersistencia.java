
package com.veterinaria.persistencia;

import com.veterinaria.logica.Cliente;

public class ControladoraPersistencia {

    ClienteJpaController cliJpa = new ClienteJpaController();
    
    public void agregarCliente(Cliente cli) {
        cliJpa.create(cli);
    }

}
