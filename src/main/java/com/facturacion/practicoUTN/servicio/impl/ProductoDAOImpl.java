package com.facturacion.practicoUTN.servicio.impl;

import com.facturacion.practicoUTN.persistence.IProductoDAO;
import com.facturacion.practicoUTN.persistence.ProductoDTO;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class ProductoDAOImpl implements IProductoDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<ProductoDTO> listarProductos() {
        // Implementación de la consulta a la base de datos
    }

    @Override
    public ProductoDTO guardarProducto(ProductoDTO producto) {
        // Implementación de la inserción en la base de datos
    }

    @Override
    public void eliminarProducto(Long id) {
        // Implementación de la eliminación en la base de datos
    }
}
