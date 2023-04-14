package threads;

public class Simulacion4 {
	
	public static void main(String[] args) {
		
		Demonio3 d1 = new Demonio3("Devil Jin");
		Demonio3 d2 = new Demonio3("True Ogre");
		
		d1.start();
		d2.start();
	}
}