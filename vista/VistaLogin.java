/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import modelo.Conexion;

public class VistaLogin extends JFrame{
   public Container contenedor;
   public JLabel label1,label2,label3;
   public JPanel panel1,panel2;
   public JTextField text1,text2;
   public JButton bingresar,bsalir;
   public FlowLayout flow1;
   public GridLayout grid1,grid2;
   public Conexion con;
    
    
    public VistaLogin(){
        super("Bienvenido");
        
        flow1 = new FlowLayout();
        contenedor = getContentPane();
        contenedor.setLayout(flow1);
        grid1 = new GridLayout(7,1,5,10);
        grid2 = new GridLayout(1,2,5,20);
        panel1 = new JPanel(grid1);
        panel2 = new JPanel(grid2);
        contenedor.setBackground(new Color(0x3578AF));  // el 0x es para que lo tome en rgb
        panel1.setBackground(new Color(0x3578AF));
        panel2.setBackground(new Color(0x3578AF));
        
        
        label1 = new JLabel("Farmacia Login");
        label2 = new JLabel("usuario");
        label3 = new JLabel("contraseña");
        
        
        // LETRA TITULO       
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("Arial", Font.BOLD, 24));
        
        
        //LETRA OTROS
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Arial", Font.BOLD, 18));

        
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("Arial", Font.BOLD, 18));

        
        
        
        text1 = new JTextField(15);  
        text2 = new JTextField(15);
        // BOTONES
        bingresar = new JButton("Ingresar");
        bsalir = new JButton("Salir");
        
     //   bingresar.addActionListener(this);
       // bsalir.addActionListener(this);
        
        ImageIcon logo = new ImageIcon(getClass().getResource("/images/logo.png"));//C:\Users\admincolombia\Desktop\actividad caso uso retiro cajero\miniproyecto
        JLabel EtiquetaImagen = new JLabel(logo);
        
      //  contenedor.add(titulo);
        contenedor.add(EtiquetaImagen);
        panel1.add(label1);
        panel1.add(label2);
        panel1.add(text1);
        panel1.add(label3);
        panel1.add(text2);
        panel2.add(bingresar);
        panel2.add(bsalir);
        contenedor.add(panel1);
        contenedor.add(panel2);
        setVisible(true);
        setSize(250,500);
        setLocationRelativeTo(null);
        setResizable(false);
        
        
        con = new Conexion();
        con.getConection();
    }
    
    /*
    @Override
    public void actionPerformed(ActionEvent evento)
    {
        if(evento.getSource() == bingresar){
            String user = text1.getText();
            String password = text2.getText(); 
            
            Statement st = 
        }
    
    }
*/
    
}
