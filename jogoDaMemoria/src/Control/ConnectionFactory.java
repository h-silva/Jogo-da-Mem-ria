/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author richard
 */
public class ConnectionFactory {
    
    public static Connection getConnection() throws SQLException {
        String driver = "org.postgresql.Driver";
        String dbURL = "jdbc:postgresql://localhost:5432/jogodavelha";
        String username = "postgres";
        String password = "heitor";
        
        try
        {
            Class.forName(driver);
            Connection con = null;
            con = (Connection) DriverManager.getConnection(dbURL, username, password);
            System.out.println("Conexão realizada com sucesso.");
            return con;
        }
        catch (ClassNotFoundException ex)
        {
            System.err.print(ex.getMessage());
            return null;
        } 
    }
}
