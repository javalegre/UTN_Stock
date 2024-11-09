package com.facturacion.practicoUTN.repository;

import com.facturacion.practicoUTN.model.StockEntradaDetalle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StockEntradaDetalleRepository extends CrudRepository<StockEntradaDetalle, Long> {
    // Aquí puedes agregar consultas personalizadas si las necesitas
    List<StockEntradaDetalle> findByStockEntradaId(Long stockEntradaId);
    List<StockEntradaDetalle> findByMercaderiaId(Long mercaderiaId);

}
