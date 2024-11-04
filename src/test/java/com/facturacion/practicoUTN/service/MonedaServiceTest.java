package com.facturacion.practicoUTN.service;

import com.facturacion.practicoUTN.model.Moneda;
import com.facturacion.practicoUTN.repository.MonedaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class MonedaServiceTest {

    @Mock
    private MonedaRepository monedaRepository;

    @InjectMocks
    private MonedaService monedaService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetMonedaById() {
        Moneda moneda = new Moneda(1L, "Dólar", "$", 1.0, true);
        when(monedaRepository.findById(1L)).thenReturn(Optional.of(moneda));

        // Llamar al método getMonedaById
        Optional<Moneda> result = monedaService.getMonedaById(1L);

        assertTrue(result.isPresent());
        assertEquals("Dólar", result.get().getMoneda());
    }

    @Test
    void testCreateMoneda() {
        Moneda moneda = new Moneda(null, "Euro", "€", 0.85, false);
        when(monedaRepository.save(moneda)).thenReturn(new Moneda(1L, "Euro", "€", 0.85, false));

        Moneda result = monedaService.createMoneda(moneda);
        assertNotNull(result.getId());
        assertEquals("Euro", result.getMoneda());
    }
}