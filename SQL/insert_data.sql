-- =====================
-- TABLA CATEGORIA
-- =====================
INSERT INTO categoria (Id_categoria, plataforma, genero) VALUES
(1, 'PC', 'Acción'),
(2, 'PC', 'Deportes'),
(3, 'PC', 'RPG'),
(4, 'PC', 'Terror'),
(5, 'PC', 'Estrategia'),
(6, 'PlayStation', 'Acción'),
(7, 'PlayStation', 'Deportes'),
(8, 'PlayStation', 'RPG'),
(9, 'PlayStation', 'Terror'),
(10, 'PlayStation', 'Estrategia'),
(11, 'Xbox', 'Acción'),
(12, 'Xbox', 'Deportes'),
(13, 'Xbox', 'RPG'),
(14, 'Xbox', 'Terror'),
(15, 'Xbox', 'Estrategia');

-- =====================
-- TABLA CLIENTE
-- =====================
INSERT INTO cliente (Id_cliente, nombre, apellidos, direccion, dni, telefono, email) VALUES
(1, 'Juan', 'Pérez', 'Calle A 123', '12345678A', '600123456', 'juan@gmail.com'),
(2, 'Ana', 'García', 'Calle B 45', '87654321B', '611987654', 'ana@gmail.com'),
(3, 'Luis', 'Martín', 'Calle C 78', '11223344C', NULL, 'luis@gmail.com'),
(4, 'Marta', 'López', 'Calle D 10', '22334455D', '622334455', 'marta@gmail.com');

-- =====================
-- TABLA PEDIDO
-- =====================
INSERT INTO pedido (Id_pedido, fecha, metodo_pago, Id_cliente, total) VALUES
(1, '2026-03-20', 'Tarjeta', 1, 109.98),
(2, '2026-03-21', 'Contrareembolso', 2, 69.99),
(3, '2026-03-22', 'Tarjeta', 3, 119.97);

-- =====================
-- TABLA PRODUCTO
-- =====================
INSERT INTO producto (Id_producto, nombre, precio, stock, Id_categoria) VALUES
(1, 'FIFA 24', 59.99, 10, 2),
(2, 'Resident Evil 4', 49.99, 5, 3),
(3, 'Call of Duty', 69.99, 8, 1),
(4, 'Civilization VI', 39.99, 6, 4);

-- =====================
-- TABLA DETALLES_PEDIDO
-- =====================
INSERT INTO detalles_pedido (Id_detalles, cantidad, precio, Id_producto, Id_pedido) VALUES
(1, 1, 59.99, 1, 1),
(2, 2, 49.99, 2, 1),
(3, 1, 69.99, 3, 2),
(4, 3, 39.99, 4, 3);

-- =====================
-- TABLA ENVIO
-- =====================
INSERT INTO envio (Id_envio, direccion, fecha_envio, estado, Id_pedido) VALUES
(1, 'Calle A 123', '2026-03-21', 'En camino', 1),
(2, 'Calle B 45', '2026-03-22', 'Entregado', 2),
(3, 'Calle C 78', '2026-03-23', 'Pendiente', 3);