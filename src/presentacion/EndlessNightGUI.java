package presentacion;

import java.io.Serializable;
import javax.swing.JFrame;
import javax.swing.JPanel;
import Aplicacion.EndlessNight;

public class EndlessNightGUI extends JFrame implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private EndlessNight aplicacion; 
	private JPanel ventana; 
	
	
	public static void main(String[] args) {
		EndlessNightGUI duck = new EndlessNightGUI();
		duck.setResizable(false);
		duck.setVisible(true);
	}
	
		
	public EndlessNightGUI() {
		setSize(1200,700);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		prepareElementos();
	//	prepareElementosMenu();
	//	prepareAccionesMenu();
	}

	
	
	/**
     * Este metodo se encarga de inicilizar la interfaz de inicio del juego.
     */ 
	public void prepareElementos() {
		aplicacion = new EndlessNight(1200,700);
		ventana = new Inicio(this);
		setVentana(ventana);
	}
	
	
	public void setVentana(JPanel ventana) {
		//aplicacion.setVentana(ventana.toString());
		this.ventana = ventana;
		add(ventana);
		ventana.setVisible(true);
		ventana.setFocusable(true);
		ventana.requestFocus();
        ventana.requestFocusInWindow();
	}
	
	
	
	
	
}
