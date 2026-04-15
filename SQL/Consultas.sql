

1.Ver todos los clientes
SELECT * FROM cliente;

2.Ver pedidos con cliente.
SELECT p.Id_pedido, p.fecha , c.nombre, c.apellidos
FROM pedido p
JOIN cliente c ON p.Id_cliente = Id_cliente;

3.Ver pedidos con total
SELECT Id_pedido, total FROM pedido;

4.Buscar producto por nombre
SELECT * FROM producto WHERE nombre LIKE '%FIFA%';

5.Ver productos con poco stock
SELECT * FROM producto WHERE stock < 10;

6.Ver productos de un pedido
SELECT d.Id_pedido, pr.nombre, d.cantidad
FROM detalles_pedido d
JOIN producto pr ON d.Id_producto = pr.Id_producto;

7.Ver estado de envios
SELECT estado FROM envio;

8.Ver total gastado por cliente
SELECT c.nombre, SUM(p.total) AS total_gastado
FROM cliente c 
JOIN pedido p ON c.Id_cliente = p.Id_cliente
GROUP BY c.nombre;

9.Ver cliente con más gastado
SELECT pr.nombre, SUM(d.cantidad) AS vendidos
FROM detalles_pedido d
JOIN producto pr ON d.Id_producto = pr.Id_producto
GROUP BY pr.nombre;

10.Ver pedidos por fecha
SELECT * FROM pedido ORDER BY fecha DESC;

11.Ver productos aunue no se hayan vendidos
SELECT pr.nombre, d.cantidad
FROM producto pr
LEFT JOIN detalles_pedido d ON pr.Id_producto = d.Id_producto;

12.Ver pedido completo
SELECT p.Id_pedido, c.nombre, pr.nombre AS producto, d.cantidad
FROM pedido p
INNER JOIN cliente c ON p.Id_cliente = c.Id_cliente
INNER JOIN detalles_pedido d ON p.Id_pedido = d.Id_pedido
INNER JOIN producto pr ON d.Id_producto = pr.Id_producto;