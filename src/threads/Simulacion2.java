package threads;

public class Simulacion2 {
	public static void main(String[] args) {
		
		Demonio1 d1 = new Demonio1();
		Demonio1 d2 = new Demonio1();
		
		d1.start();
		d2.start();
	}
}
