# Programación – Proyecto Bit-Love


##### Introducción

En esta parte del proyecto se ha desarrollado una aplicación en Java que permite gestionar una tienda de videojuegos mediante conexión a una base de datos.

El programa funciona a través de un menú en consola que permite interactuar con los datos almacenados en MySQL.



##### Funcionalidades

La aplicación permite realizar las siguientes operaciones:


* Mostrar todos los productos

* Insertar nuevos productos

* Buscar productos por nombre

* Eliminar productos por ID

* Actualizar precio y stock de un producto

Estas operaciones corresponden a un sistema CRUD (Create, Read, Update, Delete).


##### Conexión a base de datos

Se utiliza JDBC para conectar la aplicación con una base de datos MySQL.

La conexión se gestiona mediante la clase `Conexion`, que devuelve un objeto `Connection` utilizado por el resto de clases.



##### Estructura del código

El proyecto se ha organizado en varias capas:

* `conexion` → gestiona la conexión con la base de datos
* `dao` → contiene las consultas SQL
* `model` → define la clase `Producto`
* `controller` → conecta el menú con el acceso a datos
* `main` → contiene el menú y la interacción con el usuario

Esta estructura permite separar responsabilidades y mejorar la organización del código.



##### Uso de Programación Orientada a Objetos

Se ha creado la clase `Producto`, que representa los productos de la tienda.

Se trabaja con objetos en lugar de variables sueltas, lo que facilita la gestión de los datos y mejora la claridad del código.



##### Funcionamiento del programa

El programa utiliza un menú en consola que se repite mediante un bucle `do while`, permitiendo al usuario realizar varias operaciones hasta seleccionar la opción de salir.

El flujo del programa es el siguiente:

Usuario → Menú (Main) → Controller → DAO → Base de datos



##### Gestión de errores

Se ha implementado un manejo básico de errores mediante bloques `try-catch`, mostrando mensajes en consola en caso de fallo en la conexión o en las consultas.



##### Conclusión

La aplicación permite gestionar una tienda de videojuegos de forma básica, aplicando conceptos de Java, JDBC, SQL y programación orientada a objetos.

Además, el código está organizado en capas, lo que facilita su comprensión y mantenimiento.



