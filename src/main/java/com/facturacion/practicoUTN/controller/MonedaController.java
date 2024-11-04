package com.facturacion.practicoUTN.controller;

import com.facturacion.practicoUTN.model.Moneda;
import com.facturacion.practicoUTN.service.MonedaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/monedas")
public class MonedaController {

    private final MonedaService monedaService;

    @Autowired
    public MonedaController(MonedaService monedaService) {
        this.monedaService = monedaService;
    }

    @Operation(summary = "Obtiene una lista de todas las monedas",
               description = "Devuelve una lista con todas las monedas disponibles en el sistema y su cotización actual")
    @ApiResponse(responseCode = "200", description = "Lista de monedas recuperada")
    @GetMapping
    public ResponseEntity<Iterable<Moneda>> getAllMonedas() {
        List<Moneda> monedas = monedaService.getAllMonedas();
        return ResponseEntity.ok(monedas);
    }

    @Operation(summary = "Crea una moneda nueva")
    @PostMapping
    public ResponseEntity<Moneda> createMoneda(@Valid @RequestBody Moneda moneda) {
        System.out.println("Intentando crear moneda con datos: " + moneda);
        return new ResponseEntity<>(monedaService.createMoneda(moneda), HttpStatus.CREATED);
    }

    @Operation(summary = "Modifica una moneda")
    @PutMapping("/{id}")
    public ResponseEntity<Moneda> updateMoneda(@PathVariable Long id, @Valid @RequestBody Moneda monedaDetails) {
        try {
            return ResponseEntity.ok(monedaService.updateMoneda(id, monedaDetails));
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @Operation(summary = "Elimina una moneda")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMoneda(@PathVariable Long id) {
        monedaService.deleteMoneda(id);
        return ResponseEntity.noContent().build();
    }
}
