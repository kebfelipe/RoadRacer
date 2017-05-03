package RoadRacer;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.Graphics;
/****************
*** @StormTK  ***
*****************/

public class Tablero_201212925 extends JPanel{
	
	Image imgTablero[][] = new Image[5][5];
	ImageIcon Carretera_cnt = new ImageIcon(this.getClass().getResource("/Imagenes/CarreteraCt.png"));
	ImageIcon Carretera_drc = new ImageIcon(this.getClass().getResource("/Imagenes/CarreteraDr.png"));
	ImageIcon Carretera_izq = new ImageIcon(this.getClass().getResource("/Imagenes/CarreteraIz.png"));
	ImageIcon Carretera_off = new ImageIcon(this.getClass().getResource("/Imagenes/Cesped.png"));
	
	int coordenada_X = 260;
	//private Image imgTable;
	private Image imgAuto;
	
	public Tablero_201212925(Image imgAuto){
		this.imgAuto = imgAuto;
		//this.imgTable = imgTable;
		
		Componentes();
	}
	
	public Tablero_201212925(int coordenada_X){
		this.coordenada_X = 260;
	}
	
	@Override
	public void paintComponent (Graphics g){
		
		g.drawImage(imgTablero[0][0],0,0, null);
		g.drawImage(imgTablero[1][0],0,170, null);
		g.drawImage(imgTablero[2][0],0,340, null);
		g.drawImage(imgTablero[3][0],0,510, null);
		g.drawImage(imgTablero[0][1],120,0, null);
		g.drawImage(imgTablero[1][1],120,170, null);
		g.drawImage(imgTablero[2][1],120,340, null);
		g.drawImage(imgTablero[3][1],120,510, null);
		g.drawImage(imgTablero[0][2],240,0, null);
		g.drawImage(imgTablero[1][2],240,170, null);
		g.drawImage(imgTablero[2][2],240,340, null);
		g.drawImage(imgTablero[3][2],240,510, null);
		g.drawImage(imgTablero[0][3],360,0, null);
		g.drawImage(imgTablero[1][3],360,170, null);
		g.drawImage(imgTablero[2][3],360,340, null);
		g.drawImage(imgTablero[3][3],360,510, null);
		g.drawImage(imgTablero[0][4],480,0, null);
		g.drawImage(imgTablero[1][4],480,170, null);
		g.drawImage(imgTablero[2][4],480,340, null);
		g.drawImage(imgTablero[2][4],480,510, null);
		g.drawImage(imgAuto,coordenada_X,420, this);
	}
	
	public void Componentes(){
		imgTablero[0][0] = Carretera_off.getImage();//Cesped
		imgTablero[1][0] = Carretera_off.getImage();
		imgTablero[2][0] = Carretera_off.getImage();
		imgTablero[3][0] = Carretera_off.getImage();
		imgTablero[0][1] = Carretera_izq.getImage();
		imgTablero[1][1] = Carretera_izq.getImage();
		imgTablero[2][1] = Carretera_izq.getImage();
		imgTablero[3][1] = Carretera_izq.getImage();
		imgTablero[0][2] = Carretera_cnt.getImage();
		imgTablero[1][2] = Carretera_cnt.getImage();
		imgTablero[2][2] = Carretera_cnt.getImage();
		imgTablero[3][2] = Carretera_cnt.getImage();
		imgTablero[0][3] = Carretera_drc.getImage();
		imgTablero[1][3] = Carretera_drc.getImage();
		imgTablero[2][3] = Carretera_drc.getImage();
		imgTablero[3][3] = Carretera_drc.getImage();
		imgTablero[0][4] = Carretera_off.getImage();
		imgTablero[1][4] = Carretera_off.getImage();
		imgTablero[2][4] = Carretera_off.getImage();
		imgTablero[3][4] = Carretera_off.getImage();
		
		Dimension DmAuto = new Dimension(imgAuto.getWidth(null),imgAuto.getHeight(null));
		this.setPreferredSize(DmAuto);
		this.setMaximumSize(DmAuto);
		this.setMaximumSize(DmAuto);
		this.setSize(DmAuto);
		this.setLayout(null);
	}
	
}