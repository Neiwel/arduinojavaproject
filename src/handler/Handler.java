package handler;

import BO.MedicionesBO;

import UI.FramePrincipal;
import UI.PanelMediciones;

public class Handler {
	//Atributos
	private FramePrincipal frame;
	private MedicionesBO medicionesBO;
	
	//Constructor
	public Handler(){
		this.frame = new FramePrincipal("Mediciones 1.0",this);
		setMedicionesBO(new MedicionesBO());
	}
	
	//Metodos
	public void init() {
		frame.setVisible(true);
	}
	
	//Cambiar Frame
	public void consultaMediciones() {
		frame.cambiarPanel(new PanelMediciones(this));
	}
	
	
	public MedicionesBO getMedicionesBO() {
		return medicionesBO;
	}

	public void setMedicionesBO(MedicionesBO medicionesBO) {
		this.medicionesBO = medicionesBO;
	}
	
}
