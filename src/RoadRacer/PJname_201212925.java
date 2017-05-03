package RoadRacer;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;

/****************
*** @StormTK  ***
*****************/

public class PJname_201212925 extends JFrame{
   
	private JLabel Lbl_nombre;
	private JTextField Tfl_nombre;
	private JPanel Pnl_nombre;
	private JButton Btn_aceptar;
	private JLabel Lbl_playername;
	
	public PJname_201212925(){
		Image Icono = new ImageIcon(getClass().getResource("/Imagenes/RR.png")).getImage();
        this.setIconImage(Icono);
		
		this.setSize(400,200);//El tamaño es de 800x600
		this.setResizable(false);//No permite cambiar el tamaño de la pantalla 
		this.setLocationRelativeTo(null);//Lo coloca en el centro de la pantalla
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);//Poder cerrar la aplicacion
		
		Btn_aceptar = new JButton();	
        Lbl_nombre = new JLabel(); 
		Tfl_nombre = new JTextField();
		Pnl_nombre = new JPanel();
		Lbl_playername = new JLabel();
		Pnl_nombre.setLayout(null);
              
		Btn_aceptar.setText("Aceptar");
		Btn_aceptar.setBounds(300,110,80,30);
		
        Lbl_nombre.setText("Ingrese su nombre:");
		Lbl_nombre.setBounds(100, 20, 180, 40);
        Lbl_nombre.setHorizontalAlignment(JLabel.CENTER);
		Lbl_nombre.setFont(new Font("Verdana", Font.BOLD, 15));
		Lbl_nombre.setForeground(Color.BLACK);
                
        Tfl_nombre.setText("");
		Tfl_nombre.setBounds(20,60,350,30);
        Tfl_nombre.setHorizontalAlignment(JTextField.CENTER);
        Tfl_nombre.setForeground(Color.BLACK);
        Tfl_nombre.setBackground(Color.WHITE);
		
		this.add(Pnl_nombre);
		Pnl_nombre.add(Tfl_nombre);
		Pnl_nombre.add(Lbl_nombre);
		Pnl_nombre.add(Btn_aceptar);
		
		Btn_aceptar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
				String Nombre_PJ = Tfl_nombre.getText();
				
				if(Nombre_PJ.equals("")){
					JOptionPane.showMessageDialog(null, "No has escrito ningun Nombre", "Error!", JOptionPane.WARNING_MESSAGE);
				}
				else{
					ImageIcon HUD = new ImageIcon(this.getClass().getResource("/Imagenes/HUD.png"));
					
					Gameplay_201212925 game_play = new Gameplay_201212925();
					game_play.setVisible(true);
					
					Scoreboard_201212925 Scoreboard = new Scoreboard_201212925(HUD.getImage());
					Scoreboard.setVisible(true);
			
					setVisible(false);
						
					Game_201212925 frm_Jugar = new Game_201212925();
					frm_Jugar.setVisible(true);
					
					Lbl_playername.setText(Nombre_PJ);
					Lbl_playername.setBounds(20,25,160,40);
					Lbl_playername.setHorizontalAlignment(JLabel.CENTER);
					Lbl_playername.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 20));
					Lbl_playername.setForeground(Color.WHITE);
					Scoreboard.add(Lbl_playername);
					
					//ImageIcon PJTable = new ImageIcon(this.getClass().getResource("/Imagenes/Mapa.png"));
					ImageIcon PJauto = new ImageIcon(this.getClass().getResource("/Imagenes/autoPJ.png"));
					Tablero_201212925 Pjcarro = new Tablero_201212925(PJauto.getImage());
					Pjcarro.setBounds(200, 0, 600, 600);
					
					frm_Jugar.getContentPane().add(Pjcarro);
					frm_Jugar.getContentPane().add(Scoreboard);
					
				}
			}
		});

	}
}