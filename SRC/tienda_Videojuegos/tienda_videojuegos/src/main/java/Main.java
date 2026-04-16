import controller.ProductoController;
import dao.ProductoDAO;
import model.Producto;

import java.util.Scanner;
public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ProductoController controller = new ProductoController();

        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Ver productos");
            System.out.println("2. Insertar producto");
            System.out.println("3. Buscar producto");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Actualizar producto");
            System.out.println("6. Salir");

            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    controller.mostrarProductos();
                    break;


                case 2:
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Precio: ");
                    double precio = scanner.nextDouble();

                    System.out.print("Stock: ");
                    int stock = scanner.nextInt();
                    scanner.nextLine();

                    Producto producto = new Producto(0, nombre, precio, stock);
                    controller.insertarProducto(producto);
                    break;


                case 3:
                    System.out.print("Nombre a buscar: ");
                    String nombreBuscado = scanner.nextLine();

                    controller.buscarProducto(nombreBuscado);
                    break;


                case 4:
                    System.out.println("ID del producto a eliminar: ");
                    int idEliminar = scanner.nextInt();
                    scanner.nextLine();

                    controller.eliminarProducto(idEliminar);
                    break;


                case 5:
                    System.out.print("ID del producto: ");
                    int id = scanner.nextInt();

                    System.out.print("Nuevo precio: ");
                    double nuevoPrecio = scanner.nextDouble();

                    System.out.print("Nuevo stock: ");
                    int nuevoStock = scanner.nextInt();
                    scanner.nextLine();

                    controller.actualizarProducto(id, nuevoPrecio, nuevoStock);
                    break;


                case 6:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 6);

        scanner.close();
    }
}

