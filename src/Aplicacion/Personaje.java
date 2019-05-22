package Aplicacion;

public abstract class Personaje {
	int salud;
	int espoints;
	int defensa;
	int ataque;
	int dinero;
	int exp;
	
	public int getSalud() {
		return salud;
	}
	
	public void setSalud(int salud) {
		this.salud = salud;
	}
	
	public int getEspoints() {
		return espoints;
	}
	
	public void setEspoints(int espoints) {
		this.espoints = espoints;
	}
	
	public int getDefensa() {
		return defensa;
	}
	
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	
	public int getAtaque() {
		return ataque;
	}
	
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	
	public int getDinero() {
		return dinero;
	}
	
	public void setDinero(int dinero) {
		this.dinero = dinero;
	}
	
	public int getExp() {
		return exp;
	}
	
	public void setExp(int exp) {
		this.exp = exp;
	}
	
}
