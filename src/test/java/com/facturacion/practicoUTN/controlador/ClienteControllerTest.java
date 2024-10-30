package com.facturacion.practicoUTN.controlador;

import com.facturacion.practicoUTN.modelo.Cliente;
import com.facturacion.practicoUTN.repository.ClienteRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class ClienteControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ClienteRepository clienteRepository;

    @Test
    void testGetAllClientes() throws Exception {
        // Crear un cliente en la base de datos de prueba
        //Cliente cliente = new Cliente(null, "Cliente","Nuevo","Test", "correoElectronico@test.com", "12345678");
        //clienteRepository.save(cliente);

        // Hacer la solicitud GET y verificar el resultado
        mockMvc.perform(get("/clientes")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].nombre", is("Cliente Test")));
    }

    @Test
    void testCreateCliente() throws Exception {
        String usuarioJson = "{ \"nombre\": \"Nuevo Cliente\", \"correoElectronico\": \"nuevocliente@test.com\", \"telefono\": \"87654321\" }";

        mockMvc.perform(post("/usuarios")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(usuarioJson))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.nombre", is("Nuevo Usuario")))
                .andExpect(jsonPath("$.correoElectronico", is("nuevocliente@test.com")));
    }
}
