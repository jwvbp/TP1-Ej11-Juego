package ar.edu.unlu.juego;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {

	private ArrayList<Jugador> misJugadores = new ArrayList<Jugador>();
	private ArrayList<String> misPalabras = new ArrayList<String>();

	public void agregaPalabra(String palabra) {
		misPalabras.add(palabra);
	}

	public void agregarJugador(String nombre) {
		Jugador miJugador = new Jugador(nombre);
		misJugadores.add(miJugador);
	}

	public int buscaPalabra(String palabra) {
		int puntos = 0;
		boolean existe = misPalabras.contains(palabra);
		if (existe) {
			puntos = calcularPuntaje(palabra);
			System.out.println("Acerto! " + puntos + " puntos");
		} else {
			System.out.println("Incorrecto");
			puntos = 0;
		}
		return puntos;
	}

	public int calcularPuntaje(String palabra) {
		int p = palabra.length();
		p = p + contarCaracteres(palabra, 'k');
		p = p + contarCaracteres(palabra, 'z');
		p = p + contarCaracteres(palabra, 'x');
		p = p + contarCaracteres(palabra, 'y');
		p = p + contarCaracteres(palabra, 'w');
		p = p + contarCaracteres(palabra, 'q');
		return p;
	}

	public int contarCaracteres(String palabra, char caracter) {
		int posicion, contador = 0;
		posicion = palabra.indexOf(caracter);
		while (posicion != -1) {
			contador++;
			posicion = palabra.indexOf(caracter, posicion + 1);
		}
		return contador;
	}

	public void jugar() {
		for (int i = 0; i < misJugadores.size(); i++) {
			Jugador jugador = misJugadores.get(i);
			System.out.println("---------------------------");
			System.out.println(jugador.getNombre() + "  Jugando...");
			int puntajeParcial = 0;
			for (int j = 0; j < 5; j++) {
				System.out.print("Ingrese una palabra: ");
				Scanner sc = new Scanner(System.in);
				String nombre = sc.nextLine();
				int puntaje = buscaPalabra(nombre);
				puntajeParcial = puntajeParcial + puntaje;
			}
			jugador.setPuntaje(puntajeParcial);
		}
		for (int i = 0; i < misJugadores.size(); i++) {
			Jugador jugador = misJugadores.get(i);
			System.out.println("---------------------------");
			System.out.println(jugador.getNombre() + "   " + jugador.getPuntaje() + " puntos");
		}
	}
}