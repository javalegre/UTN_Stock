package com.facturacion.practicoUTN.persistence;

import java.util.List;

public interface IProductoDAO {
    List<ProductoDTO> listarProductos();
    ProductoDTO guardarProducto(ProductoDTO producto);
    void eliminarProducto(Long id);
}

