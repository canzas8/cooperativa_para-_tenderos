package baseDatos;

import java.sql.*;
import javax.swing.*;

public class Mysql {

	public Connection conexion() {
		Connection conectar = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conectar = DriverManager.getConnection("jdbc:mysql://localhost/cooperativa", "root", "caz12345");
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error de conexión de base de datos");
		} catch (ClassNotFoundException ex) {

		}
		return conectar;
	}
}
