package Ejemplo2;

public class Hilo1 extends Thread {
	private String p;

	public Hilo1(String p) {
		this.p = p;

	}

	public void run() {
		for (int x = 1; x <= 3; x++) {
			System.out.println(p + " come un " + x + " sandwich ");
		}
		System.out.printf("%s termino\n", p);
	}

}
