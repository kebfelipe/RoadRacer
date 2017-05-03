package RoadRacer;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
/****************
*** @StormTK  ***
*****************/
public class Score_201212925 extends JPanel{
    private JLabel Lbl_Score;//Titulo
  
    public Score_201212925() {
        Componentes();
    }
    
	public void Componentes(){
		Lbl_Score = new JLabel();//Jlabel titulo
		Lbl_Score.setText("TOP 10: CORREDORES");
		Lbl_Score.setBounds(240,40,120,40);
		Lbl_Score.setHorizontalAlignment(JLabel.CENTER);
		Lbl_Score.setFont(new Font("Verdana", Font.BOLD, 20));
		Lbl_Score.setForeground(Color.BLACK);
		this.add(Lbl_Score);
	}
}