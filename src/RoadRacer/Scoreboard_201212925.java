package RoadRacer;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/****************
*** @StormTK  ***
*****************/
public class Scoreboard_201212925 extends JPanel{
	private Image imgSb;
	public JLabel Lbl_Combustible; 
	public JLabel Lbl_Km;
	public JLabel Lbl_Score;
	JButton btn_Iniciar;
	JButton btn_Pausa;
	boolean Iniciounico = true;
	
	public Scoreboard_201212925(Image imgSb){
		this.imgSb = imgSb;
		Componentes();
	}
	
	@Override
	public void paintComponent (Graphics g){
		g.drawImage(imgSb,0,0, null);
	}
	
	public void Componentes(){
		Dimension Dmscore = new Dimension(imgSb.getWidth(null),imgSb.getHeight(null));
		this.setPreferredSize(Dmscore);
		this.setMaximumSize(Dmscore);
		this.setMaximumSize(Dmscore);
		this.setSize(Dmscore);
		this.setLayout(null);
		
		Lbl_Combustible = new JLabel();
		Lbl_Combustible.setBounds(20,187,160,40);
		Lbl_Combustible.setText("100");
		Lbl_Combustible.setHorizontalAlignment(JLabel.CENTER);
		Lbl_Combustible.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 20));
		Lbl_Combustible.setForeground(Color.BLACK);
		
		Lbl_Km = new JLabel();
		Lbl_Km.setBounds(20,317,160,40);
		Lbl_Km.setText("0");
		Lbl_Km.setHorizontalAlignment(JLabel.CENTER);
		Lbl_Km.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 20));
		Lbl_Km.setForeground(Color.BLACK);
		
		Lbl_Score = new JLabel();
		Lbl_Score.setBounds(20,450,160,40);
		Lbl_Score.setText("0");
		Lbl_Score.setHorizontalAlignment(JLabel.CENTER);
		Lbl_Score.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 20));
		Lbl_Score.setForeground(Color.BLACK);
		
		btn_Iniciar = new JButton();
		btn_Iniciar.setBounds(20,540,160,40);
		btn_Iniciar.setText("Iniciar");
		
		btn_Pausa = new JButton();
		btn_Pausa.setBounds(20,540,160,40);
		btn_Pausa.setText("Pausar");
		btn_Pausa.setVisible(false);
		
		this.add(Lbl_Combustible);
		this.add(Lbl_Km);
		this.add(Lbl_Score);
		this.add(btn_Iniciar);
		this.add(btn_Pausa);
		final StarGame_201212925 Startgm = new StarGame_201212925(Lbl_Combustible, Lbl_Km);
		
		btn_Iniciar.addActionListener(new ActionListener() {//Accion
            public void actionPerformed(ActionEvent e){	
				
				btn_Iniciar.setVisible(false);
				btn_Pausa.setVisible(true);
				
				if(Iniciounico == true){
					Startgm.start();
					Iniciounico = false;
				}else{
					StarGame_201212925 Otravez = new StarGame_201212925(Lbl_Combustible, Lbl_Km);
					Otravez.start();
				}
            }
        });
		
		btn_Pausa.addActionListener(new ActionListener() {//Accion ver puntajes
            public void actionPerformed(ActionEvent e){	
				
				btn_Pausa.setVisible(false);
				btn_Iniciar.setVisible(true);
				Startgm.Detener();
            }
        });
	}
	
}