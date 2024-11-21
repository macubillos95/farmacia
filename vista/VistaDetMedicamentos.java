package vista;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class VistaDetMedicamentos extends JFrame {

    private Container contenedor;
    private JLabel luser, ltitulo, lnombre, lpresentacion, lconcentracion, lfechaVenc, llote, lprecio, lcantidad;
    private JButton beditar, bliminar, bsalir, binventario, baddpresen, bventas, badduser, bcambiarImagen;
    private JPanel panel1, panel2, panel3, panel4, panel5;
    private JTextField tpresentacion, tconcentracion, tfechaVenc, tlote, tprecio, tcantidad;

    public VistaDetMedicamentos() {
        // Configurar el contenedor principal con BorderLayout
        contenedor = getContentPane();
        contenedor.setLayout(new BorderLayout(10, 10));

        // **Panel Superior (Cabecera)**
        panel1 = new JPanel(new GridLayout(1, 4, 10, 10));
        panel1.setBackground(new Color(0x3578AF));

        // Componentes del panel1
        luser = new JLabel("Usuario");
        ltitulo = new JLabel("DETALLE MEDICAMENTO", JLabel.CENTER);
        ltitulo.setFont(new Font("Arial", Font.BOLD, 16));
        lnombre = new JLabel("Farmacia nombre");
        ImageIcon logo = new ImageIcon(getClass().getResource("/images/logo.png"));
        JLabel etiquetaImagen = new JLabel(logo);

        // Agregar componentes al panel1
        panel1.add(luser);
        panel1.add(ltitulo);
        panel1.add(lnombre);
        panel1.add(etiquetaImagen);

        // **Panel Inferior (Botones de navegación)**
        panel2 = new JPanel(new GridLayout(1, 5, 10, 10));
        panel2.setBorder(new EmptyBorder(10, 10, 10, 10));

        bsalir = new JButton("Salir");
        binventario = new JButton("Inventario");
        baddpresen = new JButton("Agregar Presentación");
        bventas = new JButton("Ventas");
        badduser = new JButton("Agregar Usuario");

        // Agregar botones al panel2
        panel2.add(bsalir);
        panel2.add(binventario);
        panel2.add(baddpresen);
        panel2.add(bventas);
        panel2.add(badduser);

        // **Panel Lateral Izquierdo (Opciones)**
        panel3 = new JPanel(new GridLayout(4, 1, 10, 10));
        panel3.setBorder(new EmptyBorder(10, 10, 10, 10));

        bcambiarImagen = new JButton("Cambiar Imagen");
        beditar = new JButton("Editar");
        bliminar = new JButton("Eliminar");

        // Agregar botones al panel3
        panel3.add(bcambiarImagen);
        panel3.add(beditar);
        panel3.add(bliminar);

        // **Panel Central (Imagen del Medicamento)**
        panel4 = new JPanel();
        ImageIcon logoMedicamento = new ImageIcon(getClass().getResource("/images/acetaminofen2.png"));
        JLabel etiquetaImagenMedicamento = new JLabel(logoMedicamento);

        // Agregar imagen al panel4
        panel4.add(etiquetaImagenMedicamento);

        // **Panel Lateral Derecho (Detalles del Medicamento)**
        panel5 = new JPanel(new GridLayout(6, 2, 10, 10));
        panel5.setBorder(new EmptyBorder(10, 10, 10, 10));

        // Etiquetas y campos de texto
        lpresentacion = new JLabel("Presentación:");
        tpresentacion = new JTextField();
        lpresentacion.setLabelFor(tpresentacion);

        lconcentracion = new JLabel("Concentración:");
        tconcentracion = new JTextField();
        lconcentracion.setLabelFor(tconcentracion);

        lfechaVenc = new JLabel("Fecha Vencimiento:");
        tfechaVenc = new JTextField();
        lfechaVenc.setLabelFor(tfechaVenc);

        llote = new JLabel("Lote:");
        tlote = new JTextField();
        llote.setLabelFor(tlote);

        lprecio = new JLabel("Precio:");
        tprecio = new JTextField();
        lprecio.setLabelFor(tprecio);

        lcantidad = new JLabel("Cantidad:");
        tcantidad = new JTextField();
        lcantidad.setLabelFor(tcantidad);

        // Agregar componentes al panel5
        panel5.add(lpresentacion);
        panel5.add(tpresentacion);
        panel5.add(lconcentracion);
        panel5.add(tconcentracion);
        panel5.add(lfechaVenc);
        panel5.add(tfechaVenc);
        panel5.add(llote);
        panel5.add(tlote);
        panel5.add(lprecio);
        panel5.add(tprecio);
        panel5.add(lcantidad);
        panel5.add(tcantidad);

        // **Agregar paneles al contenedor**
        contenedor.add(panel1, BorderLayout.NORTH);
        contenedor.add(panel2, BorderLayout.SOUTH);
        contenedor.add(panel3, BorderLayout.WEST);
        contenedor.add(panel4, BorderLayout.CENTER);
        contenedor.add(panel5, BorderLayout.EAST);

        // Configuración de la ventana
        setTitle("Vista Detalle Medicamentos");
        setSize(800, 600); // Tamaño compacto
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new VistaDetMedicamentos();
    }
}
