package threads.caballos;

import javax.swing.JProgressBar;
import java.time.LocalTime;
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
		
		
		
		System.out.print( "El Caballo " + this.getName() + " inicia carrera en el instante " );
		System.out.println( LocalTime.now()/*.getMinute() + ":" + 
		LocalTime.now().getSecond() + "." + LocalTime.now().getNano() */ );
		for(int i = 1; i <= 100; i+= 19) {
			System.out.print( "Caballo " + this.getName() + " corre en el instante: " );
			System.out.println( LocalTime.now() );
			this.barraAvance.setValue(
				this.barraAvance.getValue() + 10);
			try {
				int descansoTemp = (int)(1000 + Math.random() * 5000);
				descanso += descansoTemp;
				System.out.print( "Caballo " + this.getName() + " descansa en el instante: " );
				System.out.println( LocalTime.now() );
				sleep( descansoTemp );				
				estado.setText(estado.getText() + 				
					"- El caballo " + this.getName() + "descansa.\n" );
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println( "Caballo " + this.getName() + " termina la carrera en el instante " + LocalTime.now() );
		long fin = System.nanoTime();
		corriendoTotal = fin - start;
		
		estado.setText(estado.getText() + 
				"------------------------------------------------------------------\n" + 
				"- Fin de la carrera para: " + this.getName() + ".\n" +
				"------------------------------------------------------------------\n");
		//System.out.println( this.getName() + "\nDescanso: " + this.getDescanso() );
		//System.out.println( "Corrio: " + ( corriendoTotal - this.getDescanso() ) );
	}
	
	public long getDescanso() {
		return descanso;
	}
	public long getCorriendoTotal( ) {
		return corriendoTotal;
	}
}
