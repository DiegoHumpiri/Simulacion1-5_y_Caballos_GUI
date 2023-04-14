package threads;

public class Demonio1 extends Thread{
	
	public void run() {
		for(int i = 1; i <= 5; i++) {
			System.out.println("Hola mundo");
		}
	}
}
