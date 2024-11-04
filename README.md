# Sistema de Stock API

Permite generar facturas y manejar un stock basico.

## Tabla de Contenidos
- [Características](#características)
- [Requisitos](#requisitos)
- [Instalación](#instalación)
- [Uso](#uso)
- [Documentación de la API](#documentación-de-la-api)
- [Pruebas](#pruebas)
- [Contribuciones](#contribuciones)

## Características
- Documentación completa de la API con Swagger.

## Requisitos
- Java 17 o superior
- MySQL
- Maven

## Instalación

1. Clona el repositorio:
   ```bash
   git clone <URL-del-repositorio>
   ```
2. Configura la base de datos en src/main/resources/application.properties:
   ```bash
    spring.datasource.url=jdbc:mysql://localhost:3306/utn_stock?createDatabaseIfNotExist=true&useSSL=false&serverTimezone=UTC
    spring.datasource.username=tu_usuario_mysql
    spring.datasource.password=tu_contraseña_mysql
   ```
3. Compila y ejecuta la aplicación:
    ```bash
    ./mvnw spring-boot:run
    ```

## Uso
- La aplicación se ejecutará en http://localhost:8080.
- Accede a http://localhost:8080/swagger-ui/index.html para ver y probar la documentación de la API.

## Documentación de la API
- La documentación de la API está disponible en Swagger UI. Visita http://localhost:8080/swagger-ui/index.html para explorar los endpoints, ver sus parámetros y probar las solicitudes.

## Pruebas
- Pruebas unitarias con JUnit y Mockito.
- Pruebas de integración para verificar los endpoints REST.
- Ejecuta las pruebas con:
   ```bash
   ./mvnw test
   ```

## Contribuciones
- Javier Alegre
- Carlos Casasola
- Alejandro Lachowicz

