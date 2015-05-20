package DAO;

import entidades.Mediciones;

public interface MedicionesDAO {
	
	public void insertarDatos(Mediciones mediciones);
	public void borrarDatos(Mediciones mediciones);
	public void actualizarDatos(Mediciones mediciones);
	
}
