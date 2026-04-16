package dao;

import conexion.Conexion;
import model.Producto;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ProductoDAO {

    public void mostrarProductos() {

        try {
            Connection conexion = Conexion.getConexion();
            Statement statement = conexion.createStatement();

            String sql = "SELECT * FROM producto";

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                Producto producto = new Producto(
                        resultSet.getInt("Id_producto"),
                                resultSet.getString("nombre"),
                                resultSet.getDouble("precio"),
                                resultSet.getInt("stock")
                        );
                System.out.println(producto);
            }

        } catch (Exception e) {
            System.out.println("Error al mostrar el producto");
        }
    }

    public void insertarProducto(Producto producto) {

        try {
            Connection connection = Conexion.getConexion();
            Statement statement = connection.createStatement();

            String sql = "INSERT INTO producto (nombre, precio, stock, Id_categoria) VALUES ('"
                    + producto.getNombre() + "', "
                    + producto.getPrecio() + ", "
                    + producto.getStock() + ", 1)";


            statement.executeUpdate(sql);

            System.out.println("Producto insertado correctamente");

        } catch (Exception e) {
            System.out.println("Error al insertar el producto");
        }
    }

    public void buscarProducto(String nombreBuscado) {

        try {
            Connection con = Conexion.getConexion();
            Statement statement = con.createStatement();

            String sql = "SELECT * FROM producto WHERE nombre = '" + nombreBuscado + "'";

            ResultSet resultSet = statement.executeQuery(sql);

            boolean encontrado = false;

            while (resultSet.next()) {
                encontrado = true;

                Producto producto = new Producto(
                        resultSet.getInt("Id_producto"),
                        resultSet.getString("nombre"),
                        resultSet.getDouble("precio"),
                        resultSet.getInt("stock")
                );

                System.out.println(producto);
            }

            if (!encontrado) {
                System.out.println("No se ha encontrado ningún producto con ese nombre");
            }

        } catch (Exception e) {
            System.out.println("Error al buscar el producto");
        }
    }

    public void eliminarProducto(int idProducto){
        try{
            Connection connection = Conexion.getConexion();
            Statement statement = connection.createStatement();

            String sql = "DELETE FROM producto WHERE Id_producto = " + idProducto;

            int filas = statement.executeUpdate(sql);

            if (filas > 0){
                System.out.println("Producto eliminado correctamente");
            } else {
                System.out.println("No existe un producto con ese ID");
            }

        } catch (Exception e) {
            System.out.println("Error al eliminar el producto");
        }
    }

    public void actualizarProducto(int idProducto, double nuevoPrecio, int nuevoStock) {

        try {
            Connection con = Conexion.getConexion();
            Statement st = con.createStatement();

            String sql = "UPDATE producto SET precio = " + nuevoPrecio +
                    ", stock = " + nuevoStock +
                    " WHERE Id_producto = " + idProducto;

            int filas = st.executeUpdate(sql);

            if (filas > 0) {
                System.out.println("Producto actualizado correctamente");
            } else {
                System.out.println("No existe ese producto");
            }

        } catch (Exception e) {
            System.out.println("Error al actualizar producto");
        }
    }
}

