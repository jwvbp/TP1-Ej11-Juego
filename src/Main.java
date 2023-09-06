import ar.edu.unlu.juego.Juego;

public class Main {

	public static void main(String[] args) {

		Juego miJuego = new Juego();
		miJuego.agregaPalabra("gato");
		miJuego.agregaPalabra("perro");
		miJuego.agregaPalabra("conejo");
		miJuego.agregaPalabra("yacare");
		miJuego.agregaPalabra("kiwi");
		miJuego.agregaPalabra("mesa");
		miJuego.agregaPalabra("silla");
		miJuego.agregaPalabra("zorro");
		miJuego.agregaPalabra("zarigueya");
		miJuego.agregaPalabra("quirquincho");
		miJuego.agregaPalabra("vaca");
				
		miJuego.agregarJugador("Jose");
		miJuego.agregarJugador("Federico");
		
		miJuego.jugar();
	}
}
