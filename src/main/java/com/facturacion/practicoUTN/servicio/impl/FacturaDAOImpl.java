package com.facturacion.practicoUTN.servicio.impl;

import com.facturacion.practicoUTN.persistence.FacturaDTO;
import com.facturacion.practicoUTN.persistence.IFacturaDAO;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FacturaDAOImpl implements IFacturaDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<FacturaDTO> listarFacturas() {
        // Implementación de la consulta a la base de datos

        return List.of();
    }

    @Override
    public FacturaDTO guardarFactura(FacturaDTO factura) {
        // Implementación de la inserción en la base de datos
    }

    @Override
    public void eliminarFactura(Long id) {
        // Implementación de la eliminación en la base de datos
    }
}

