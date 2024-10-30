package com.facturacion.practicoUTN.servicio;

import com.facturacion.practicoUTN.modelo.FacturaDetalle;
import com.facturacion.practicoUTN.repository.FacturaDetalleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturaDetalleService {
    @Autowired
    private FacturaDetalleRepository facturaDetalleRepository;
    public List<FacturaDetalle> listarFacturaDetalles() {
        return facturaDetalleRepository.findAll();
    }
    public FacturaDetalle guardarFacturaDetalle(FacturaDetalle facturaDetalle) {
        return facturaDetalleRepository.save(facturaDetalle);
    }
    public void eliminarFacturaDetalle(Long id) {
        facturaDetalleRepository.deleteById(id);
    }
}