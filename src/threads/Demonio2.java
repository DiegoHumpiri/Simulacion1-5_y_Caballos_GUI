package threads;

public class Demonio2 extends Thread{
	String nombre;
	
	public Demonio2(String algo) {
		this.nombre = algo;
	}
	
	public void run() {
		for(int i = 1; i <= 5; i++) {
			System.out.println(this.nombre + ": Hola mundo");
		}
	}
}