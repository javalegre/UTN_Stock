package com.facturacion.practicoUTN.controller;

import com.facturacion.practicoUTN.model.Mercaderias;
import com.facturacion.practicoUTN.service.MercaderiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/mercaderias")
public class MercaderiaController {

    private final MercaderiaService mercaderiaService;

    @Autowired
    public MercaderiaController(MercaderiaService mercaderiaService) {
        this.mercaderiaService = mercaderiaService;
    }

    // Endpoint para obtener todas las mercaderías
    @GetMapping
    public List<Mercaderias> getAllMercaderias() {
        return mercaderiaService.getAllMercaderias();
    }

    // Endpoint para obtener una mercadería por id
    @GetMapping("/{id}")
    public ResponseEntity<Mercaderias> getMercaderiaById(@PathVariable Long id) {
        Optional<Mercaderias> mercaderia = mercaderiaService.getMercaderiaById(id);
        return mercaderia.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Endpoint para crear una nueva mercadería
    @PostMapping
    public Mercaderias createMercaderia(@RequestBody Mercaderias mercaderia) {
        return mercaderiaService.saveMercaderia(mercaderia);
    }

    // Endpoint para actualizar una mercadería
    @PutMapping("/{id}")
    public ResponseEntity<Mercaderias> updateMercaderia(@PathVariable Long id, @RequestBody Mercaderias mercaderia) {
        Mercaderias updatedMercaderia = mercaderiaService.updateMercaderia(id, mercaderia);
        return updatedMercaderia != null ? ResponseEntity.ok(updatedMercaderia) : ResponseEntity.notFound().build();
    }

    // Endpoint para eliminar una mercadería
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMercaderia(@PathVariable Long id) {
        mercaderiaService.deleteMercaderia(id);
        return ResponseEntity.noContent().build();
    }

    // Endpoint para obtener mercaderías por nombre
    @GetMapping("/nombre/{nombre}")
    public List<Mercaderias> getMercaderiasByNombre(@PathVariable String nombre) {
        return mercaderiaService.getMercaderiasByNombre(nombre);
    }
}

