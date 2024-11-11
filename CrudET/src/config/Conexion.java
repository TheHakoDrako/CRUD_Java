package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    Connection con;
    public Conexion(){
        try {
            // Cargar el controlador JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/registro_crud","root","");
            System.out.println("Conexion establecida exitosamente.");
        } catch (ClassNotFoundException e) {
            System.out.println("Error: No se encontro el controlador JDBC.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error: No se pudo establecer la conexión a la base de datos.");
            e.printStackTrace();
        }        
    }
    public Connection getConnection(){
        return con;
    }
  }
