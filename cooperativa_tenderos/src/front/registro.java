package front;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class registro extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtCedula;
	private JTextField txtCorreo;
	private JTextField txtTelefono;
	private JTextField txtCiudad;
	private JTextField txtDireccion;
	private JButton btnRegistrar;

	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registro frame = new registro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public registro() {
		setTitle("Registro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 697, 497);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre Completo:");
		lblNombre.setBounds(10, 84, 271, 34);
		lblNombre.setBackground(new Color(240, 240, 240));
		lblNombre.setFont(new Font("Arial Black", Font.PLAIN, 25));
		contentPane.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setHorizontalAlignment(SwingConstants.LEFT);
		txtNombre.setBackground(new Color(255, 255, 255));
		txtNombre.setForeground(new Color(0, 0, 0));
		txtNombre.setBounds(352, 84, 299, 31);
		contentPane.add(txtNombre);
		txtNombre.setColumns(25	);
		
		JLabel lblDocumento = new JLabel("Documento:");
		lblDocumento.setFont(new Font("Arial Black", Font.PLAIN, 25));
		lblDocumento.setBounds(20, 129, 189, 34);
		contentPane.add(lblDocumento);
		
		txtCedula = new JTextField();
		txtCedula.setHorizontalAlignment(SwingConstants.LEFT);
		txtCedula.setBounds(352, 136, 299, 33);
		contentPane.add(txtCedula);
		txtCedula.setColumns(10);
		
		JLabel lblCorreo_electronico = new JLabel("Correo Electronico:");
		lblCorreo_electronico.setFont(new Font("Arial Black", Font.PLAIN, 25));
		lblCorreo_electronico.setBounds(10, 174, 284, 34);
		contentPane.add(lblCorreo_electronico);
		
		txtCorreo = new JTextField();
		txtCorreo.setHorizontalAlignment(SwingConstants.LEFT);
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(352, 181, 299, 33);
		contentPane.add(txtCorreo);
		
		JLabel lblTelefono = new JLabel("Teléfono:");
		lblTelefono.setFont(new Font("Arial Black", Font.PLAIN, 25));
		lblTelefono.setBounds(10, 230, 284, 34);
		contentPane.add(lblTelefono);
		
		JLabel lblCiudad = new JLabel("Ciudad:");
		lblCiudad.setFont(new Font("Arial Black", Font.PLAIN, 25));
		lblCiudad.setBounds(10, 275, 284, 34);
		contentPane.add(lblCiudad);
		
		txtTelefono = new JTextField();
		txtTelefono.setHorizontalAlignment(SwingConstants.LEFT);
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(352, 231, 299, 33);
		contentPane.add(txtTelefono);
		
		txtCiudad = new JTextField();
		txtCiudad.setHorizontalAlignment(SwingConstants.LEFT);
		txtCiudad.setColumns(10);
		txtCiudad.setBounds(352, 276, 299, 33);
		contentPane.add(txtCiudad);
		
		JLabel lblNewLabel_3 = new JLabel("Registro de Usuario:");
		lblNewLabel_3.setFont(new Font("Broadway", Font.PLAIN, 30));
		lblNewLabel_3.setBounds(121, 11, 453, 27);
		contentPane.add(lblNewLabel_3);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(this);
		btnRegistrar.setFont(new Font("Stencil", Font.PLAIN, 25));
		btnRegistrar.setBounds(268, 389, 179, 39);
		contentPane.add(btnRegistrar);
		
		JLabel lblDireccion = new JLabel("Dirección");
		lblDireccion.setFont(new Font("Arial Black", Font.PLAIN, 25));
		lblDireccion.setBounds(10, 320, 284, 34);
		contentPane.add(lblDireccion);
		
		txtDireccion = new JTextField();
		txtDireccion.setHorizontalAlignment(SwingConstants.LEFT);
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(352, 320, 299, 33);
		contentPane.add(txtDireccion);
		
		JComboBox boxtipodc = new JComboBox();
		boxtipodc.setFont(new Font("Tahoma", Font.PLAIN, 20));
		boxtipodc.setModel(new DefaultComboBoxModel(new String[] {"[selec]", "C.C.", "T.I.", "R.C.", "C.E."}));
		boxtipodc.setBounds(219, 129, 103, 34);
		contentPane.add(boxtipodc);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnRegistrar) {
			handle_btnRegistrar_actionPerformed(e);
		}
	}
	 protected void handle_btnRegistrar_actionPerformed(ActionEvent e) {
	}
}
