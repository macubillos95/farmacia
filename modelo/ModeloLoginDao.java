/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ModeloLoginDao {
    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public boolean validarIngreso(ModeloLogin modlog) {
        String sql = "SELECT * FROM usuarios WHERE username = ? AND password = ?";

        try {
            con = conectar.getConection(); // Obtén conexión
            ps = con.prepareStatement(sql); // Prepara la consulta
            ps.setString(1, modlog.getUsername()); // Asigna el primer parámetro
            ps.setString(2, modlog.getPassword()); // Asigna el segundo parámetro

            rs = ps.executeQuery(); // Ejecuta la consulta SELECT

            // Valida si hay resultados
            if (rs.next()) {
                return true; // Credenciales válidas
            } else {
                return false; // Credenciales no válidas
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString()); // Muestra errores
            return false;
        } finally {
            try {
                if (con != null) {
                    con.close(); // Cierra la conexión
                }
            } catch (SQLException sqle) {
                JOptionPane.showMessageDialog(null, sqle.toString());
            }
        }
    }
}
