//package threads.caballos;

import javax.swing.JProgressBar;
import javax.swing.JTextArea;

public class Caballo extends Thread {
	JProgressBar barraAvance;
	JTextArea estado;
	long descanso;
	long corriendoTotal;
	
	public Caballo(JProgressBar avance, JTextArea estado, String name) {
		super(name);
		this.barraAvance = avance;
		this.estado = estado;
	}
	
	public void run() {
		this.barraAvance.setValue( 0 );
		descanso = corriendoTotal = 0;
		
		long start = System.nanoTime();
		
		for(int i = 1; i <= 100; i++) {
			this.barraAvance.setValue(
				this.barraAvance.getValue() + 1);
			try {
				int descansoTemp = (int)(Math.random() * 500);
				descanso += descansoTemp;
				sleep( descansoTemp );

				estado.setText(estado.getText() + 				
					"- El caballo " + this.getName() + "descansa.\n" );
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		long fin = System.nanoTime();
		corriendoTotal = fin - start;
		
		estado.setText(estado.getText() + 
				"------------------------------------------------------------------\n" + 
				"- Fin de la carrera para: " + this.getName() + ".\n" +
				"------------------------------------------------------------------\n");
		System.out.println( this.getName() + "\nDescansó: " + this.getDescanso() + "\n" );
		System.out.println( "Corrió: " + ( corriendoTotal - this.getDescanso() ) + "\n" );
	}
	
	public long getDescanso() {
		return descanso;
	}
	public long getCorriendoTotal( ) {
		return corriendoTotal;
	}
}
