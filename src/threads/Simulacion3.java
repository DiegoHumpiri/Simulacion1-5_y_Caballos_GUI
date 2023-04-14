package threads;

public class Simulacion3 {
	
	public static void main(String[] args) {
		
		Demonio2 d1 = new Demonio2("Devil Jin");
		Demonio2 d2 = new Demonio2("True Ogre");
		
		d1.start();
		d2.start();
	}
}
