import dao.ProductoDAO;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ProductoDAO dao = new ProductoDAO();

        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Ver productos");
            System.out.println("2. Insertar producto");
            System.out.println("3. Buscar producto");
            System.out.println("4. Salir");

            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {

                case 1:
                    dao.mostrarProductos();
                    break;

                case 2:
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Precio: ");
                    double precio = scanner.nextDouble();

                    System.out.print("Stock: ");
                    int stock = scanner.nextInt();

                    System.out.print("ID categoría: ");
                    int idCategoria = scanner.nextInt();
                    scanner.nextLine();

                    dao.insertarProducto(nombre, precio, stock, idCategoria);
                    break;

                case 3:
                    System.out.print("Nombre a buscar: ");
                    String nombreBuscado = scanner.nextLine();

                    dao.buscarProducto(nombreBuscado);
                    break;

                case 4:
                    System.out.println("ID del producto a eliminar: ");
                    int idEliminar = scanner.nextInt();
                    scanner.nextLine();

                    dao.eliminarProducto(idEliminar);
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida");
            }

        } while (opcion != 4);

        scanner.close();
    }


}

