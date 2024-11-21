package vista;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import modelo.Rol;


public class VistaCrearUser extends JFrame {

    public Container contenedor;
    public JLabel luser, ltitulo, lnombre, lNombreCompleto, lNombreUser, lpassword, lrol;
    public JPanel panel1, panel2, panel3,panel4;
    public JTextField tNombreCompleto, tNombreUser, tpassword, trol;
    public JButton bcrear, bsalir, binventario, baddpresen, bventas, badduser,bIngresarUser;
    public JComboBox<String> combo;
    

    public VistaCrearUser() {
        super("Crear usuario");

        // Configurar el contenedor principal con BorderLayout
        contenedor = getContentPane();
        contenedor.setLayout(new BorderLayout(10, 10));

        // PANEL 1 - Cabecera
        GridLayout grid1 = new GridLayout(1, 4, 75, 100);
        panel1 = new JPanel(grid1);
        luser = new JLabel("Usuario");
        ltitulo = new JLabel("DETALLE MEDICAMENTO");
        lnombre = new JLabel("Farmacia nombre");
        ImageIcon logo = new ImageIcon(getClass().getResource("/images/logo.png"));
        JLabel etiquetaImagen = new JLabel(logo);
        panel1.setBackground(new Color(0x3578AF));
        panel1.add(luser);
        panel1.add(ltitulo);
        panel1.add(lnombre);
        panel1.add(etiquetaImagen);

        // PANEL 2 - Botones
        GridLayout grid2 = new GridLayout(1, 5, 5, 10);
        panel2 = new JPanel(grid2);
        panel2.setBorder(new EmptyBorder(10, 10, 10, 10));
        bsalir = new JButton("Salir");
        binventario = new JButton("Inventario");
        baddpresen = new JButton("Agregar Presentación");
        bventas = new JButton("Ventas");
        badduser = new JButton("Agregar Usuario");
        panel2.add(bsalir);
        panel2.add(binventario);
        panel2.add(baddpresen);
        panel2.add(bventas);
        panel2.add(badduser);

        // PANEL 3 - Formulario
        panel3 = new JPanel();
        panel3.setBorder(new EmptyBorder(10, 10, 10, 10));
        panel3.setLayout(new GridLayout(4, 2, 10, 10));

        // Crear y configurar componentes
        lNombreCompleto = new JLabel("Nombre completo:");
        tNombreCompleto = new JTextField();
        tNombreCompleto.setPreferredSize(new Dimension(200, 30));

        lNombreUser = new JLabel("Nombre de usuario:");
        tNombreUser = new JTextField();
        tNombreUser.setPreferredSize(new Dimension(200, 30));

        lpassword = new JLabel("Contraseña nueva:");
        tpassword = new JTextField();
        tpassword.setPreferredSize(new Dimension(200, 30));

        lrol = new JLabel("Rol:");
        trol = new JTextField();
        trol.setPreferredSize(new Dimension(200, 30));
        

        // AGREGAR Los roles de la BD
        combo = new JComboBox<>();
        Rol rolObj = new Rol(); 
        ArrayList<Rol> roles = rolObj.getRoles(); 
        for (Rol rol : roles) 
        { combo.addItem(
            rol.getRol());
        }
        

        // Agregar componentes a panel5
        panel3.add(lNombreCompleto);
        panel3.add(tNombreCompleto);
        panel3.add(lNombreUser);
        panel3.add(tNombreUser);
        panel3.add(lpassword);
        panel3.add(tpassword);
        panel3.add(lrol);
        //panel3.add(trol);
        panel3.add(combo);
        
        
        //PANEL 4
        
        panel4 = new JPanel();
        panel4.setBorder(new EmptyBorder(10, 10, 10, 10));
        panel4.setLayout(new GridLayout(4, 2, 10, 10));
        bIngresarUser = new JButton("Ingresar");
        panel4.add(bIngresarUser);
        

        
        

        // Agregar paneles al contenedor principal
        contenedor.add(panel1, BorderLayout.NORTH);
        contenedor.add(panel2, BorderLayout.SOUTH);
        contenedor.add(panel3, BorderLayout.CENTER);
        contenedor.add(panel4, BorderLayout.WEST);
        
        

        // Configuración de la ventana
        setTitle("Vista Detalle Medicamentos");
        setSize(600, 400); // Tamaño reducido
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new VistaCrearUser();
    }
}
