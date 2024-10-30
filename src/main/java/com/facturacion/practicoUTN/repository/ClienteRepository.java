package com.facturacion.practicoUTN.repository;

import com.facturacion.practicoUTN.modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}