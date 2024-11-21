/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author admincolombia
 */
public class Rol {
    
    private int id_rol;
    private String rol;

    public Rol(int id_rol, String rol) {
        this.id_rol = id_rol;
        this.rol = rol;
    }

    public Rol() {
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    

    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public ArrayList<Rol> getRoles() {   
    
        ArrayList<Rol> roles = new ArrayList<>();
        String sql= "SELECT nombre_rol FROM roles";
          
        try{
            con = conectar.getConection();  
            ps = con.prepareStatement(sql); 
            rs = ps.executeQuery();    
            
            while(rs.next()){   
               Rol r = new Rol();
               r.setRol(rs.getString("nombre_rol"));
               
               

               roles.add(r);
            }  
        
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e.toString());
        }finally{
            try{
                if(con!=null){
                    con.close();
                }
            }catch(SQLException sqle){
                JOptionPane.showMessageDialog(null, sqle.toString());
            }
        }
        return roles;
    }
    
}
