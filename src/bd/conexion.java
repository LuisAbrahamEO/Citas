
package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author laesp
 */
public class conexion {
    
    public Connection obtenerConexion(){
        Connection connection = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cita","root","");
            System.out.println("Conexion Exitosa");
            
        } catch (ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }
        return connection;
        }
    public static void main(String[] args){
        conexion con = new conexion();
        con.obtenerConexion();
    }
    
        
    
    
}

     