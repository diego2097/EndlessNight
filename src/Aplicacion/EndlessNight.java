package Aplicacion;

import java.io.Serializable;

public class EndlessNight  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static int anchoVentana,altoVentana;
	
	/**
     * El constructor inicializa las variables y crea el nivel.
     */ 
	public EndlessNight ( int width,int height){
		setAnchoVentana(width);
		setAltoVentana(height);
	}
	
	
	
	
	
	
	
	
	
	
	public static int getAnchoVentana() {
		return anchoVentana;
	}

	public static void setAnchoVentana(int anchoVentana) {
		EndlessNight.anchoVentana = anchoVentana;
	}

	public static int getAltoVentana() {
		return altoVentana;
	}

	public static void setAltoVentana(int altoVentana) {
		EndlessNight.altoVentana = altoVentana;
	}
	
}
