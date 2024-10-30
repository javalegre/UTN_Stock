package com.facturacion.practicoUTN.servicio.impl;

import com.facturacion.practicoUTN.persistence.FacturaDetalleDTO;
import com.facturacion.practicoUTN.persistence.IFacturaDetalleDAO;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FacturaDetalleDAOImpl implements IFacturaDetalleDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<FacturaDetalleDTO> listarFacturaDetalles() {
        // Implementación de la consulta a la base de datos
        return List.of();
    }

    @Override
    public FacturaDetalleDTO guardarFacturaDetalle(FacturaDetalleDTO facturaDetalle) {
        // Implementación de la inserción en la base de datos
    }

    @Override
    public void eliminarFacturaDetalle(Long id) {
        // Implementación de la eliminación en la base de datos
    }
}


