package DAO;

import Exceptions.MedicionesException;
import entidades.Mediciones;

public interface MedicionesDAO {
	
	public void insertarDatos(Mediciones mediciones) throws MedicionesException;
	public void borrarDatos(Mediciones mediciones);
	public void actualizarDatos(Mediciones mediciones);
}
