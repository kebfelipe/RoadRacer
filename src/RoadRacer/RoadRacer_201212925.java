package RoadRacer;

import javax.swing.JFrame;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/****************
*** @StormTK  ***
*****************/

public class RoadRacer_201212925 extends JFrame{
	
	public JButton btn_Score;
	public JButton btn_Jugar;
	
	public RoadRacer_201212925(){
		Componentes();
	}
	
	public void Componentes(){
		ImageIcon Screen = new ImageIcon(this.getClass().getResource("/Imagenes/Carreradeautos.png"));//Buscar la imagen de Bienvenida
		final WelcomeScreen_201212925 Presentar = new WelcomeScreen_201212925(Screen.getImage()); //Instancia
		this.getContentPane().add(Presentar);//Agregarlo al Frame
	
		Image Icono = new ImageIcon(getClass().getResource("/Imagenes/RR.png")).getImage();//Buscar la imagen RR
        this.setIconImage(Icono);

		this.setTitle("Road Racer by Kebyn Felipe");
		this.setSize(806,626);//El tamaño es de 800x600
		this.setResizable(false);//No permite cambiar el tamaño de la pantalla 
		this.setLocationRelativeTo(null);//Lo coloca en el centro de la pantalla
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);//Poder cerrar la aplicacion

		btn_Jugar = new JButton();//Crear boton para jugar
		btn_Jugar.setText("Jugar");//nombrarlo
		btn_Jugar.setBounds(540,400,150,40);//Posicion y tamaño
		Presentar.add(btn_Jugar);//Agregarlo al Panel
		
		btn_Jugar.addActionListener(new ActionListener() {//Accion
            public void actionPerformed(ActionEvent e){	
				setVisible(false);//Ocultar el Frame
				PJname_201212925 Pj_player = new PJname_201212925();
				Pj_player.setVisible(true);//Escribir el nombre de jugador
            }
        });
		
		btn_Score = new JButton();//Crear boton para ver puntajes
		btn_Score.setText("Puntuaciones");//nombre
		btn_Score.setBounds(540,450,150,40);//posicion y tamaño
		Presentar.add(btn_Score);//agregarlo
		
		btn_Score.addActionListener(new ActionListener() {//Accion ver puntajes
            public void actionPerformed(ActionEvent e){			
				Presentar.setVisible(false);
				Score_201212925 Puntaje = new Score_201212925();
				Puntaje.setVisible(true);//ver puntajes
				add(Puntaje);//Agregarlo al Frame
            }
        });
	}
	
}