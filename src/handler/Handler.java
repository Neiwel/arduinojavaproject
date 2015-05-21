package handler;

import BO.MedicionesBO;
import UI.FramePrincipal;

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
	
	
	public MedicionesBO getMedicionesBO() {
		return medicionesBO;
	}

	public void setMedicionesBO(MedicionesBO medicionesBO) {
		this.medicionesBO = medicionesBO;
	}
	
}
