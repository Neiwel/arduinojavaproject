package UI;

import java.awt.BorderLayout;

import handler.Handler;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class FramePrincipal extends JFrame {
	//Atributos
	private Handler handler;
	
	//Constructor
	public FramePrincipal(String title,Handler handler){
		super(title);
		this.handler = handler;
		createUI();
	}

	private void createUI(){
		setJMenuBar(createMenuBar());
		getContentPane().setLayout(new BorderLayout());
		setSize(800, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Mata el proceso cuando apreto la X
	}
	
	private JMenuBar createMenuBar(){
		JMenuBar menuBar = new JMenuBar();
		
		JMenuItem menuMediciones = new JMenuItem("Mediciones");
		JMenuItem menuMotor = new JMenuItem("Motor");
		JMenuItem menuGrafico = new JMenuItem("Grafico");
		
		JMenu fileMenu1 = new JMenu("Visualización");
		fileMenu1.add(menuMediciones);
		fileMenu1.add(menuMotor);
		fileMenu1.add(menuGrafico);
		menuBar.add(fileMenu1);
		
		return menuBar;
	}
	
}
