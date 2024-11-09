package com.facturacion.practicoUTN.service;

import com.facturacion.practicoUTN.model.Mercaderias;
import com.facturacion.practicoUTN.repository.MercaderiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MercaderiaService {

    private final MercaderiaRepository mercaderiaRepository;

    @Autowired
    public MercaderiaService(MercaderiaRepository mercaderiaRepository) {
        this.mercaderiaRepository = mercaderiaRepository;
    }

    // Método para obtener una mercadería por su id
    public Optional<Mercaderias> getMercaderiaById(Long id) {
        return mercaderiaRepository.findById(id);
    }

    // Método para obtener todas las mercaderías
    public List<Mercaderias> getAllMercaderias() {
        return (List<Mercaderias>) mercaderiaRepository.findAll();
    }

    // Método para guardar una nueva mercadería
    public Mercaderias saveMercaderia(Mercaderias mercaderia) {
        // Si no se asigna un valor al campo 'created', se le asigna la fecha actual
        if (mercaderia.getCreated() == null) {
            mercaderia.setCreated(java.time.LocalDateTime.now());
        }
        // También se asigna la fecha de modificación al guardar
        mercaderia.setModified(java.time.LocalDateTime.now());
        return mercaderiaRepository.save(mercaderia);
    }

    // Método para actualizar una mercadería
    public Mercaderias updateMercaderia(Long id, Mercaderias mercaderia) {
        if (mercaderiaRepository.existsById(id)) {
            mercaderia.setId(id);  // Asegura que el ID no cambie
            mercaderia.setModified(java.time.LocalDateTime.now()); // Actualiza la fecha de modificación
            return mercaderiaRepository.save(mercaderia);
        }
        return null;
    }

    // Método para eliminar una mercadería
    public void deleteMercaderia(Long id) {
        mercaderiaRepository.deleteById(id);
    }

    // Método para obtener mercaderías por nombre (ejemplo de consulta personalizada)
    public List<Mercaderias> getMercaderiasByNombre(String nombre) {
        return mercaderiaRepository.findByNombre(nombre);
    }
}
