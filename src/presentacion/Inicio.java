package presentacion;

import java.awt.Dimension;
import java.awt.Graphics;
import java.io.Serializable;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Inicio extends JPanel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private EndlessNightGUI gui;
	private int ancho,alto;
	private ImageIcon fondo,ijugar,icargar,iopciones;
	private JButton jugar,cargar,opciones;
	
	public Inicio(EndlessNightGUI gui) {
		this.gui = gui;
		fondo =  new ImageIcon(getClass().getResource("/resources/fondo_provisional.jpg"));
		setSize(fondo.getIconWidth(),fondo.getIconHeight());
		prepareElementos();
		
	}
	
	public void prepareElementos() {
		//ijugar= new ImageIcon(getClass().getResource("/Resources/Player1.PNG"));
		//icargar= new ImageIcon(getClass().getResource("/Resources/MultiPlayer.png"));
		//iopciones= new ImageIcon(getClass().getResource("/Resources/Maquina.png"));	
		jugar= new JButton();		
		cargar= new JButton();
		opciones= new JButton ();
		add(jugar);
		add(cargar);
		add(opciones);
	}
	
	public void paint(Graphics g) {
		Dimension d= getSize();
		g.drawImage(fondo.getImage(),0,0,d.width,d.height,null);
		this.setOpaque(false);
		int dim= (int) Math.floor(d.height*0.25);
		int dimx= (int) Math.floor(d.width*0.4);
		//System.out.println(d.width+ " "+d.height+ " "+dim+ " "+dimx);
		jugar.setBounds(dimx,dim,d.width/6,d.height/12);
		cargar.setBounds(dimx,(int)(dim+dim*0.6),d.width/6,d.height/12);	
		opciones.setBounds(dimx,(int)(dim*2+dim*0.2),d.width/6,d.height/12);
		super.paint(g);
	}	
}