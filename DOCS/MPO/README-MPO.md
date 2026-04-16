# MPO – Ampliación de Programación



##### Introducción

En esta parte del proyecto se ha trabajado la mejora del código mediante la aplicación de conceptos básicos de programación orientada a objetos (POO), con el objetivo de mejorar la organización, claridad y mantenimiento de la aplicación.



##### Arquitectura del proyecto

El proyecto se ha organizado en diferentes paquetes para separar responsabilidades:

* `conexion` → gestión de la conexión a la base de datos

* `dao` → acceso a datos mediante consultas SQL

* `model` → clases del modelo (Producto)

* `controller` → lógica intermedia

* `main` → interacción con el usuario

Esta estructura permite una mejor organización del código y evita concentrar toda la lógica en una única clase.



##### Uso de Programación Orientada a Objetos

Se ha creado la clase `Producto`, que representa la entidad principal del sistema.


Esta clase incluye:

* atributos privados (id, nombre, precio y stock)

* constructor

* métodos getter

* método `toString()`

Gracias a esto, se trabaja con objetos en lugar de datos sueltos, facilitando la gestión de la información.



##### Encapsulación

Los atributos de la clase `Producto` se han definido como privados, accediendo a ellos mediante métodos getter.

Esto permite proteger los datos y aplicar correctamente el principio de encapsulación.



##### Uso del DAO

La clase `ProductoDAO` se encarga de gestionar el acceso a la base de datos.

En ella se implementan las operaciones principales:

* mostrar productos

* insertar productos

* buscar productos

* eliminar productos

* actualizar productos

Además, se ha adaptado el código para trabajar directamente con objetos `Producto`.



##### Uso del Controller

Se ha añadido una clase `ProductoController` para separar la lógica del programa de la interacción con el usuario.

El controller actúa como intermediario entre el `Main` y el `DAO`, mejorando la organización del código.



##### Mejora estructural realizada

La mejora principal realizada en este módulo ha sido la refactorización del código para aplicar una estructura por capas.



Antes:

* El código trabajaba con datos sueltos

* La lógica estaba menos organizada


Después:

* Se utilizan objetos (`Producto`)

* El código se divide en model, dao, controller y main

* Se mejora la claridad y mantenimiento del programa


Esta mejora permite que el proyecto se acerque más a una aplicación real.


##### Conclusión

Gracias a estas mejoras, el proyecto ha pasado de ser una aplicación básica a una aplicación más estructurada, aplicando principios de programación orientada a objetos y buenas prácticas de desarrollo.

Esto facilita su comprensión, mantenimiento y posible ampliación en el futuro.



