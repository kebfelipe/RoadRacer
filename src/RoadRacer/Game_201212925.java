package RoadRacer;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import java.awt.Image;
import javax.swing.ImageIcon;

/****************
*** @StormTK  ***
*****************/
public class Game_201212925 extends JFrame{
	
	public Game_201212925(){
		Componentes();
	}
	
	public void Componentes(){
		Image Icono = new ImageIcon(getClass().getResource("/Imagenes/RR.png")).getImage();
        this.setIconImage(Icono);//Icono del Jframe
		this.setTitle("Road Racer by Kebyn Felipe");
		this.setSize(806,626);//El tamaño es de 800x600
		this.setResizable(false);//No permite cambiar el tamaño de la pantalla 
		this.setLocationRelativeTo(null);//Lo coloca en el centro de la pantalla
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);//Poder cerrar la aplicacion
		
	}
}