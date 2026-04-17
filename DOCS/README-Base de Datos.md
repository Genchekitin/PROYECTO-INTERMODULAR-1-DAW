# Base de Datos – Proyecto Bit-Love



#### Introducción

En este módulo se ha diseñado e implementado una base de datos relacional para gestionar la información de una tienda de videojuegos.

El objetivo ha sido modelar una estructura coherente que permita almacenar y relacionar datos reales del negocio, como productos, clientes y pedidos.






##### Modelo de datos

La base de datos `tienda_videojuegos` está compuesta por las siguientes tablas:

* `categoria`
* `producto`
* `cliente`
* `pedido`
* `detalles\_pedido`
* `envio`

Cada una de ellas representa una entidad del sistema y está relacionada mediante claves primarias y foráneas.







##### Descripción de las tablas


###### categoria

Almacena las categorías de los productos, incluyendo la plataforma y el género.

* Id\_categoria (PK)
* plataforma
* genero


###### producto

Contiene la información de los videojuegos disponibles en la tienda.

* Id\_producto (PK)
* nombre
* precio
* stock
* Id\_categoria (FK)

Relación: muchos productos pertenecen a una categoría.



###### cliente

Guarda los datos de los clientes de la tienda.

* Id\_cliente (PK)
* nombre
* apellidos
* direccion
* dni (único)
* telefono
* email (único)



###### pedido

Representa los pedidos realizados por los clientes.

* Id\_pedido (PK)
* fecha
* metodo\_pago
* Id\_cliente (FK)
* total

Relación: un cliente puede tener varios pedidos.



###### detalles\_pedido

Tabla intermedia que relaciona pedidos con productos.

* Id\_detalles (PK)
* cantidad
* precio
* Id\_producto (FK)
* Id\_pedido (FK)

Relación: un pedido puede contener varios productos.



###### envio

Contiene la información del envío de cada pedido.

* Id\_envio (PK)
* direccion
* fecha\_envio
* estado
* Id\_pedido (FK)

Relación: cada pedido tiene asociado un envío.




##### 



##### Relaciones

Las relaciones principales del modelo son:

* categoria 1 --- N producto
* cliente 1 --- N pedido
* pedido 1 --- N detalles\_pedido
* producto 1 --- N detalles\_pedido
* pedido 1 --- 1 envio

Estas relaciones permiten mantener la integridad de los datos mediante claves foráneas.



##### Integridad de datos

Se han aplicado restricciones para garantizar la coherencia:

* Claves primarias en todas las tablas
* Claves foráneas para definir relaciones
* Campos únicos en `dni` y `email` en la tabla cliente
* Tipos de datos adecuados (INT, VARCHAR, DATE, DECIMAL)




##### Organización de scripts

La base de datos se ha organizado en diferentes archivos:

* `create\_tables.sql` → creación de la estructura
* `insert\_data.sql` → inserción de datos
* `consultas.sql` → consultas realizadas
* `tienda\_videojuegos.sql` → export completo

Esta separación permite una mejor organización y mantenimiento del proyecto.


##### 





##### Conclusión

El diseño de la base de datos permite gestionar de forma estructurada la información de la tienda, facilitando la realización de consultas y operaciones sobre los datos.


Se ha priorizado la claridad, la coherencia y la correcta relación entre las entidades, siguiendo un modelo relacional adecuado para el tipo de aplicación desarrollada.





