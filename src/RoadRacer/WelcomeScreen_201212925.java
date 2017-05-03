package RoadRacer;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

/****************
*** @StormTK  ***
*****************/

public class WelcomeScreen_201212925 extends JPanel{
	
	private Image img;//Imagen
	
	public WelcomeScreen_201212925(Image img){//Constructor
		this.img = img; //usar imagen
		Componentes();	
	}

	@Override
	public void paintComponent (Graphics g){
		g.drawImage(img,0,0, null); 
	}
	
	public void Componentes(){
		Dimension dimension = new Dimension(img.getWidth(null),img.getHeight(null));//Que el jpanel tenga las dimesiones de la imagen
		this.setPreferredSize(dimension);//Que el jpanel tenga las dimesiones de la imagen
		this.setMaximumSize(dimension);//Que el jpanel tenga las dimesiones de la imagen
		this.setMaximumSize(dimension);//Que el jpanel tenga las dimesiones de la imagen
		this.setSize(dimension);//Que el jpanel tenga las dimesiones de la imagen
		this.setLayout(null);//Se trabaje en coordenadas
	}
}