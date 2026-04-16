package conexion;

import java.sql.Connection;
import java.sql.DriverManager;



    public class Conexion {

        private static final String URL = "jdbc:mysql://localhost:3306/tienda_videojuegos";
        private static final String USER = "root";
        private static final String PASS = "";

        public static Connection getConexion() {
            Connection connection = null;

            try {
                connection = DriverManager.getConnection(URL, USER, PASS);
                System.out.println("Conexión correcta");
            } catch (Exception e) {
                System.out.println("Error en la conexión");
            }

            return connection;
        }
}
