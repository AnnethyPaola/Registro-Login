
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

    public static PreparedStatement prepareStatement(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private final String base = "usuarios"; 
    private final String user = "root"; 
    private final String password = "annethy2514"; 
    private final String url = "jdbc:mysql://localhost:3306/" + base; 
    public Connection con = null;

    public Connection getConexion()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con; 
    }

    public class getConexion {

        public getConexion() {
        }
    }
}
