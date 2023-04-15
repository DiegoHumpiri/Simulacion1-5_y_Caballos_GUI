package threads.caballos;

import javax.swing.JProgressBar;
import javax.swing.JTextArea;

public class Caballo extends Thread {
	JProgressBar barraAvance;
	JTextArea estado;
	
	public Caballo(JProgressBar avance, JTextArea estado, String name) {
		super(name);
		this.barraAvance = avance;
		this.estado = estado;
	}
	
	public void run() {
		this.barraAvance.setValue( 0 );
		
		for(int i = 1; i <= 100; i++) {
			this.barraAvance.setValue(
				this.barraAvance.getValue() + 1);
			try {
				sleep( (int)(Math.random() * 500) );
				estado.setText(estado.getText() + 
					
					"- El caballo " + this.getName() + "descansa.\n" );
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		estado.setText(estado.getText() + 
				"------------------------------------------------------------------\n" + 
				"- Fin de la carrera para: " + this.getName() + ".\n" +
				"------------------------------------------------------------------\n");
	}
}
