package Ejemplo2;

public class Hilo2 {

	static Hilo1 h1;

	public static void main(String[] args) {
		String[] personas = { "zaide", "flora", "alicia", "kev", "alorcini", "alison", "benjamin", "brando", "emoli",
				"lila" };
		for (String p : personas) {
			Hilo1 h1 = new Hilo1(p);
			Thread t = new Thread(h1);
			t.start();
		}
	}

}