# Sistema de Alquiler de Bicicletas y Venta de Productos

## Descripción

Este proyecto es un sistema completo para la gestión del alquiler de bicicletas y la venta de productos relacionados con bicicletas. El sistema permite a los usuarios alquilar bicicletas, comprar productos y gestionar sus transacciones. Los administradores pueden gestionar el inventario de bicicletas y productos, así como las transacciones de los usuarios.

## Tecnologías Utilizadas

- **Java 17**: Lenguaje de programación utilizado para el desarrollo del backend.
- **Spring Boot 3.2.5**: Framework utilizado para crear aplicaciones basadas en microservicios.
- **PostgreSQL**: Base de datos relacional utilizada para almacenar la información del sistema.
- **Gradle**: Herramienta de gestión de dependencias y construcción del proyecto.
- **Hibernate**: ORM utilizado para la interacción con la base de datos.
- **Thymeleaf**: Motor de plantillas utilizado para el desarrollo de la interfaz de usuario (opcional).
- **Spring Security**: Framework de seguridad utilizado para la autenticación y autorización de usuarios.

## Funcionalidades

### Usuarios

- Registro y autenticación de usuarios.
- Alquiler de bicicletas.
- Compra de productos.
- Gestión de transacciones y historial de alquileres/compras.

### Administradores

- Gestión del inventario de bicicletas y productos.
- Visualización y gestión de transacciones de usuarios.
- Gestión de usuarios.

## Requisitos Previos

- **Java 17**: Asegúrate de tener Java 17 instalado en tu máquina.
- **Gradle**: Asegúrate de tener Gradle instalado para gestionar las dependencias del proyecto.
- **PostgreSQL**: Asegúrate de tener una instancia de PostgreSQL en funcionamiento.

## Configuración del Entorno

1. Clona el repositorio del proyecto:
    ```bash
    git clone https://github.com/tu-usuario/tu-repositorio.git
    cd tu-repositorio
    ```

2. Configura la base de datos PostgreSQL:
    - Crea una base de datos en PostgreSQL.
    - Actualiza las credenciales de la base de datos en el archivo `application.properties` o `application.yml`:
      ```properties
      spring.datasource.url=jdbc:postgresql://localhost:5432/tu_base_de_datos
      spring.datasource.username=tu_usuario
      spring.datasource.password=tu_contraseña
      spring.jpa.hibernate.ddl-auto=update
      ```

3. Construye el proyecto con Gradle:
    ```bash
    ./gradlew build
    ```

4. Ejecuta la aplicación:
    ```bash
    ./gradlew bootRun
    ```

## Endpoints Principales

### Usuarios

- `POST /api/register`: Registro de nuevos usuarios.
- `POST /api/login`: Autenticación de usuarios.
- `GET /api/bikes`: Listado de bicicletas disponibles para alquiler.
- `POST /api/rent`: Alquiler de bicicletas.
- `GET /api/products`: Listado de productos disponibles para compra.
- `POST /api/purchase`: Compra de productos.

### Administradores

- `GET /api/admin/users`: Listado de usuarios registrados.
- `GET /api/admin/inventory`: Gestión del inventario de bicicletas y productos.
- `POST /api/admin/inventory/add`: Añadir nuevas bicicletas o productos al inventario.
- `DELETE /api/admin/inventory/remove/{id}`: Eliminar bicicletas o productos del inventario.

## Contribuciones

Las contribuciones son bienvenidas. Por favor, sigue los siguientes pasos:

1. Haz un fork del repositorio.
2. Crea una nueva rama para tu funcionalidad (`git checkout -b feature/nueva-funcionalidad`).
3. Realiza los cambios necesarios y haz commit (`git commit -am 'Añadir nueva funcionalidad'`).
4. Empuja tus cambios a la rama (`git push origin feature/nueva-funcionalidad`).
5. Abre un Pull Request.

## Licencia

Este proyecto está licenciado bajo la Licencia MIT. Consulta el archivo [LICENSE](LICENSE) para más detalles.
