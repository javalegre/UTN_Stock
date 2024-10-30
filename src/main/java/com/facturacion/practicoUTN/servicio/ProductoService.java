package com.facturacion.practicoUTN.servicio;

import com.facturacion.practicoUTN.modelo.Producto;
import com.facturacion.practicoUTN.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository productoRepository;
    public List<Producto> listarProductos() {
        return productoRepository.findAll();
    }
    public Producto guardarProducto(Producto producto) {
        return productoRepository.save(producto);
    }
    public void eliminarProducto(Long id) {
        productoRepository.deleteById(id);
    }
}
