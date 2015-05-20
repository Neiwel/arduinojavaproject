package DAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import Exceptions.MedicionesException;
import entidades.Mediciones;
import utils.DBManager;


public class DAOimpl implements MedicionesDAO {

	@Override
	public void insertarDatos(Mediciones mediciones) throws MedicionesException {
		String sql = "INSERT INTO usuarios (user, email, pass) VALUES ('" + mediciones.getNombre() + "', '" + mediciones.getTipo() + "', '" + mediciones.getValor() + "')";
		Connection c = DBManager.connect();
		try {
			Statement s = c.createStatement();
			s.executeUpdate(sql);
			c.commit();
		} catch (SQLException e) {
			try {
				c.rollback();
				e.printStackTrace();
				throw new MedicionesException("Error al insertar medicion.");
			} catch (SQLException e1) {
				e1.printStackTrace();
				throw new MedicionesException("Error al intentar hacer rollback.");
			}
		} finally {
			try {
				c.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
				throw new MedicionesException("Error al cerrar base de datos...");
			}
		}
		
	}

	@Override
	public void borrarDatos(Mediciones mediciones) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizarDatos(Mediciones mediciones) {
		// TODO Auto-generated method stub
		
	}


}
