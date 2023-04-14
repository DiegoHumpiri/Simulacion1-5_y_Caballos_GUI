package threads;

import javax.swing.JTextArea;

public class Demonio4 extends Thread{
	
	JTextArea text;
	public Demonio4(String algo, JTextArea text) {
		super(algo);
		this.text = text;
	}
	
	public void run() {
		for(;;) {
			System.out.println(this.getName() + ": Hola mundo");
			this.text.setText( this.text.getText() + this.getName() + ": Hola mundo\n");
			try {
				sleep((int)(Math.random() * 2000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
