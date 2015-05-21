package UI;

import handler.Handler;

import java.awt.GridLayout;
import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelMediciones extends JPanel {

	//Atributos
	private Handler handler;
	
	//Constructor
	public PanelMediciones(Handler handler){
		setHandler(handler);
		createUI();
	}
	
	private void createUI() {
		setLayout(new GridLayout(2,3));
		add(new JLabel("Temperatura PT100 A:"));
		JTextField PT100A = new JTextField(20);
		add(new JTextField());
	}
	
	//Metodos
	public void setHandler(Handler handler) {
		this.handler = handler;
	}

	public Handler getHandler() {
		return this.handler;
	}
}
