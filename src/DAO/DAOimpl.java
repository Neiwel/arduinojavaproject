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
		String sql = "INSERT INTO mediciones (nombre, tipo, valor) VALUES ('" + mediciones.getNombre() + "', '" + mediciones.getTipo() + "', '" + mediciones.getValor() + "')";
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
	public void borrarDatos(Mediciones mediciones) throws MedicionesException {
		String sql = "DELETE FROM mediciones WHERE nombre = '" + mediciones.getNombre() + "'";
		Connection c = DBManager.connect();
		try {
			Statement s = c.createStatement();
			s.executeUpdate(sql);
			c.commit();
		} catch (SQLException e) {
			try {
				c.rollback();
				e.printStackTrace();	// Tirar el error para arriba
			} catch (SQLException e1) {
				e1.printStackTrace();
				throw new MedicionesException("Error al borrar medicion...");
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
	public void actualizarDatos(Mediciones mediciones) throws MedicionesException {
		String sql = "UPDATE mediciones set nombre = '" + mediciones.getNombre() + "', tipo = '" + mediciones.getTipo() + "' WHERE valor = '" + mediciones.getValor() + "'";
		Connection c = DBManager.connect();
		try {
			Statement s = c.createStatement();
			s.executeUpdate(sql);
			c.commit();
		} catch (SQLException e) {
			try {
				c.rollback();
				e.printStackTrace();
			} catch (SQLException e1) {
				e1.printStackTrace();
				throw new MedicionesException("Error al actualizar datos.");
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


}