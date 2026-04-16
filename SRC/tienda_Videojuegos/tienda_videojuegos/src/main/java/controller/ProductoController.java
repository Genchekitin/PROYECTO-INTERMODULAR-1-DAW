package controller;

import dao.ProductoDAO;
import model.Producto;

public class ProductoController{
    private ProductoDAO dao = new ProductoDAO();

    public void mostrarProductos(){
        dao.mostrarProductos();
    }

    public void insertarProducto(Producto producto){
        dao.insertarProducto(producto);
    }

    public void buscarProducto(String nombre){
        dao.buscarProducto(nombre);
    }

    public void eliminarProducto(int id){
        dao.eliminarProducto(id);
    }

    public void actualizarProducto(int id, double nuevoPrecio, int nuevoStock){
        dao.actualizarProducto(id, nuevoPrecio, nuevoStock);
    }
}
