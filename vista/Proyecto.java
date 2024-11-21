/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import javax.swing.JFrame;
import modelo.Conexion;
import controlador.ControladorLogin;
//import fallos.Controlador;

public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Conexion con = new Conexion();
        //con.getConection();
       //VistaLogin log = new VistaLogin();
       //VistaDetMedicamentos log = new VistaDetMedicamentos();
       VistaCrearUser log = new VistaCrearUser();
      
      /*
       VistaLogin log = new VistaLogin();
       ControladorLogin c = new ControladorLogin(log);
       log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      */
       
       /*Controlador con = new Controlador(log);
       log.setVisible(true);
       log.setSize(250,500);
       log.setLocationRelativeTo(null);
       log.setResizable(false);
       */
       log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
