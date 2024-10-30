package com.facturacion.practicoUTN.persistence;

import java.util.List;

public interface IClienteDAO {
    List<ClienteDTO> listarClientes();
    ClienteDTO guardarCliente(ClienteDTO cliente);
    void eliminarCliente(Long id);
}



