package com.facturacion.practicoUTN.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                title = "API Stock",
                description = "API para gestión básica de un sistema de stock realizado para el curso de UTN Java Spring boot",
                termsOfService = "www.sistemastock.com/terminos_y_servicios",
                version = "1.0.0",
                contact = @Contact(
                        name = "Javier Alegre",
                        url = "www.linkedin.com/in/javier-feliciano-alegre",
                        email = "javier_alegre@itrsa.com.ar"
                ),
                license = @License(
                        name = "API desarrollada para ser utilizada como ejemplos",
                        url = "www.sistemastock.com/licence"
                )
        ),
        servers = {
                @Server(
                        description = "Servidor Desarrollo",
                        url = "http://localhost:8080"
                ),
                @Server(
                        description = "Servidor Produccion",
                        url = "http://localhost:8080"
                )
        }
)
public class SwaggerConfig {
}
