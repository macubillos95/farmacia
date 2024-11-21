/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Aprendiz
 */
import java.sql.Connection;// permite la conexion
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
    Connection con;
    String url ="jdbc:mysql://localhost:3307/farmacia";
    String pass="";
    String user="root";
    
    
    public Connection getConection(){
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,user,pass);
            //JOptionPane.showMessageDialog(null,"Conexion exitosa");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Problemas de conexion"+e.toString());
        }
        
        return con;
    }
    
    
}
