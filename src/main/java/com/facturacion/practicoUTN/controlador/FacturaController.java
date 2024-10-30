package com.facturacion.practicoUTN.controlador;

import com.facturacion.practicoUTN.modelo.Factura;
import com.facturacion.practicoUTN.servicio.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/facturas")
public class FacturaController {
    @Autowired
    private FacturaService facturaService;
    @GetMapping
    public List<Factura> listarFacturas() {
        return facturaService.listarFacturas();
    }
    @PostMapping
    public Factura guardarFactura(@RequestBody Factura factura) {
        return facturaService.guardarFactura(factura);
    }
    @DeleteMapping("/{id}")
    public void eliminarFactura(@PathVariable Long id) {
        facturaService.eliminarFactura(id);
    }
}