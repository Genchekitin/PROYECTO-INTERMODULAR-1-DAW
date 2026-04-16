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
                System.out.println(
                        resultSet.getInt("Id_producto") + " - " +
                                resultSet.getString("nombre") + " - " +
                                resultSet.getDouble("precio") + " - Stock: " +
                                resultSet.getInt("stock")
                );
            }

        } catch (Exception e) {
            System.out.println("Error al mostrar el producto");
        }
    }

    public void insertarProducto(String nombre, double precio, int stock, int idCategoria) {

        try {
            Connection connection = Conexion.getConexion();

            Statement statement = connection.createStatement();

            String sql = "INSERT INTO producto (nombre, precio, stock, Id_categoria) VALUES ('"
                    + nombre + "', " + precio + ", " + stock + ", " + idCategoria + ")";

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
            System.out.println("error al eliminar el producto");
        }
    }
}

