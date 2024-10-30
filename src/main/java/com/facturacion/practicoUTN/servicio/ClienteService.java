package com.facturacion.practicoUTN.servicio;

import com.facturacion.practicoUTN.modelo.Cliente;
import com.facturacion.practicoUTN.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;
    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }
    public Cliente guardarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }
    public void eliminarCliente(Long id) {
        clienteRepository.deleteById(id);
    }
}
