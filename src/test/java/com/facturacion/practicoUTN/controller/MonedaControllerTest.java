package com.facturacion.practicoUTN.controller;

import com.facturacion.practicoUTN.model.Moneda;
import com.facturacion.practicoUTN.repository.MonedaRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class MonedaControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private MonedaRepository monedaRepository;

    @Test
    void testGetAllMonedas() throws Exception {
        // Crear una moneda en la base de datos de prueba
        Moneda moneda = new Moneda(null, "Dólar", "$", 1.0, true);
        monedaRepository.save(moneda);

        // Hacer la solicitud GET y verificar el resultado
        mockMvc.perform(get("/monedas")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[-1].moneda", is("Dólar")));
    }

   @Test
    void testCreateMoneda() throws Exception {
        String monedaJson = "{ \"moneda\": \"Euro\", \"simbolo\": \"€\", \"cotizacion\": 0.85, \"predeterminada\": false }";

        mockMvc.perform(post("/monedas")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(monedaJson))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.moneda", is("Euro")))
                .andExpect(jsonPath("$.simbolo", is("€")));

    }
}