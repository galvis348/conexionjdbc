/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conexionjdbc;

/**
 *
 * @author EQUIPO
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Conexionjdbc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
        String usuario = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/prueba";
        Connection conexion; 
        Statement statement; 
        Resultset rs;
                       
        try {
            Class.forName("com.mysql.cj.jdbc.driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexionjdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        conexion = DriverManager.getConnection(url,usuario,password);
        statement = conexion.createstatement();
        statement.executeUpdate("INSERT INTO USUARIO(USERNAME,USERPASSWORD) VALUES("ABC, ABC123)"); "
        rs  =  statement.executeQuery("SELECT * FROM USUARIO"); 
        res.next();
do{
    system.out.println(rs.getInt("userid") +" : "+ rs.getString(username));
     }while(rs.next());        
    }
    
}
