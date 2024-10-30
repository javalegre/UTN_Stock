package com.facturacion.practicoUTN.servicio.impl;

import com.facturacion.practicoUTN.persistence.ClienteDTO;
import com.facturacion.practicoUTN.persistence.IClienteDAO;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClienteDAOImpl implements IClienteDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<ClienteDTO> listarClientes() {
        // Implementación de la consulta a la base de datos
    }

    @Override
    public ClienteDTO guardarCliente(ClienteDTO cliente) {
        // Implementación de la inserción en la base de datos
    }

    @Override
    public void eliminarCliente(Long id) {
        // Implementación de la eliminación en la base de datos
    }
}
