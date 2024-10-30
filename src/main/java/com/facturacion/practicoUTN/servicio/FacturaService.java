package com.facturacion.practicoUTN.servicio;

import com.facturacion.practicoUTN.modelo.Factura;
import com.facturacion.practicoUTN.repository.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturaService {
    @Autowired
    private FacturaRepository facturaRepository;
    public List<Factura> listarFacturas() {
        return facturaRepository.findAll();
    }
    public Factura guardarFactura(Factura factura) {
        return facturaRepository.save(factura);
    }
    public void eliminarFactura(Long id) {
        facturaRepository.deleteById(id);
    }
}
