package RoadRacer;

import java.awt.Color;

import javax.swing.JLabel;
/****************
*** @StormTK  ***
*****************/
public class StarGame_201212925 extends Thread{
	JLabel combustible = new JLabel();
	JLabel km = new JLabel();
	boolean IniciarRun = true;
	
	public StarGame_201212925( JLabel combustible, JLabel km){
		this.km = km;
		this.combustible = combustible;
	}
	
	public void Detener(){
      IniciarRun = false;
	}
   
	public void Continuar(){
      IniciarRun = true;
	}
	
	@Override
	public void run(){
		do{
			String StgTanque = combustible.getText();
			int intTanque = Integer.parseInt(StgTanque);
			intTanque = intTanque - 1;
			String Tanque = String.valueOf(intTanque);
			combustible.setText(Tanque);
			
			String StgKm = km.getText();
			int ftKM = Integer.parseInt(StgKm);
			ftKM = ftKM + 1;
			String StKM =  String.valueOf(ftKM);
			km.setText(StKM);
			
			if(intTanque < 16){
				combustible.setForeground(Color.RED);
			}
			
			if(intTanque == 0){
				IniciarRun = false;
			}
		try{
			Thread.sleep(2000);
		}
		catch(InterruptedException ie){
			System.out.println("thread interrupted! " + ie);
		}
		}while(IniciarRun);
	}
}
