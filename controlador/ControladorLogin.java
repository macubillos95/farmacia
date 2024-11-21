/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.ModeloLogin;
import modelo.ModeloLoginDao;
import vista.VistaDetMedicamentos;
import vista.VistaLogin;

public class ControladorLogin implements ActionListener {
    private ModeloLoginDao dao;
    private ModeloLogin modlog;
    private VistaLogin vista;

    public ControladorLogin(VistaLogin v) {
        this.vista = v;
        this.dao = new ModeloLoginDao();
        this.modlog = new ModeloLogin();

        // Asignar listeners a los botones
        this.vista.bingresar.addActionListener(this);
        this.vista.bsalir.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == vista.bingresar) {
            // Captura los datos de la vista
            String username = vista.text1.getText();
            String password = vista.text2.getText(); // Contraseñas deben ser char[] o String

            // Asigna valores al modelo
            modlog.setUsername(username);
            modlog.setPassword(password);

            // Valida credenciales
            boolean loginValido = dao.validarIngreso(modlog);

            if (loginValido) {
                JOptionPane.showMessageDialog(vista, "¡Ingreso exitoso!");
                VistaDetMedicamentos dt = new VistaDetMedicamentos();
                dt.setVisible(true);
                // Aquí podrías redirigir a otra ventana o funcionalidad
            } else {
                JOptionPane.showMessageDialog(vista, "Usuario o contraseña incorrectos.");
            }
        }

        if (ae.getSource() == vista.bsalir) {
            System.exit(0); // Cierra la aplicación
        }
    }
}
