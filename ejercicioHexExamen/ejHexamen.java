package ejercicioHexExamen;

import java.util.*;

public class ejHexamen {

	public static void main(String[] args) {
		HexPila miHex = new HexPila();
		int numDec;
		Stack<Character> numHex = new Stack<Character>();
		
		System.out.println("Escriba un numero que convertir ");
		numDec = miHex.LeeNumero();
		
		numHex = miHex.GuardaPila(numDec);
		
		System.out.println(numDec + " = " + miHex.LeePila(numHex));
	}

}
