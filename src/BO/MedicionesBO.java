package BO;

import entidades.Mediciones;
import DAO.DAOimpl;
import DAO.MedicionesDAO;

public class MedicionesBO {
	private MedicionesDAO dao;
	
	//Constructor
	public MedicionesBO(){
		setDao(new DAOimpl());
	}
	
	//Metodos
	public void setDao(MedicionesDAO dao){
		this.dao = dao;
	}
	public MedicionesDAO getDao(){
		return this.dao;
	}
	
}
