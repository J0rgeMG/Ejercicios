package ejercicioHexExamen;

import java.util.*;

public class HexPila {
	//Metodoque pregunta por un numero entero y lo devuelve (devuelve -1 en caso de que no sea valido)
	public int LeeNumero() {
		int numero;
		
		numero = Teclado.entero();
		if(numero < 0) {
			numero = -1;
		}
		
		return numero;
	}
	
	public Stack<Character> GuardaPila(int numeroDec) {
		Stack<Character> numeroHex = new Stack<Character>();
		int cociente, dividendo, divisor, resto;
		dividendo = numeroDec;
		divisor = 16;
		char hex = ' ';
		
		if(numeroDec >= 0) {
			if(numeroDec > 15) {
				cociente = dividendo / divisor;
				resto = dividendo % divisor;
				
				switch (resto) {
				case 0: hex = '0';
				break;
				case 1: hex = '1';
				break;
				case 2: hex = '2';
				break;
				case 3: hex = '3';
				break;
				case 4: hex = '4';
				break;
				case 5: hex = '5';
				break;
				case 6: hex = '6';
				break;
				case 7: hex = '7';
				break;
				case 8: hex = '8';
				break;
				case 9: hex = '9';
				break;
				case 10: hex = 'A';
				break;
				case 11: hex = 'B';
				break;
				case 12: hex = 'C';
				break;
				case 13: hex = 'D';
				break;
				case 14: hex = 'E';
				break;
				case 15: hex = 'F';
				break;
				}
				
				numeroHex.push(hex);
				
				dividendo = cociente;
				
				while(cociente > divisor) {
					cociente = dividendo / divisor;
					resto = dividendo % divisor;
					
					switch (resto) {
					case 0: hex = '0';
					break;
					case 1: hex = '1';
					break;
					case 2: hex = '2';
					break;
					case 3: hex = '3';
					break;
					case 4: hex = '4';
					break;
					case 5: hex = '5';
					break;
					case 6: hex = '6';
					break;
					case 7: hex = '7';
					break;
					case 8: hex = '8';
					break;
					case 9: hex = '9';
					break;
					case 10: hex = 'A';
					break;
					case 11: hex = 'B';
					break;
					case 12: hex = 'C';
					break;
					case 13: hex = 'D';
					break;
					case 14: hex = 'E';
					break;
					case 15: hex = 'F';
					break;
					}
					
					numeroHex.push(hex);
					
					dividendo = cociente;
				}
				
				switch (cociente) {
				case 0: hex = '0';
				break;
				case 1: hex = '1';
				break;
				case 2: hex = '2';
				break;
				case 3: hex = '3';
				break;
				case 4: hex = '4';
				break;
				case 5: hex = '5';
				break;
				case 6: hex = '6';
				break;
				case 7: hex = '7';
				break;
				case 8: hex = '8';
				break;
				case 9: hex = '9';
				break;
				case 10: hex = 'A';
				break;
				case 11: hex = 'B';
				break;
				case 12: hex = 'C';
				break;
				case 13: hex = 'D';
				break;
				case 14: hex = 'E';
				break;
				case 15: hex = 'F';
				break;
				}
				
				numeroHex.push(hex);
			}
			else {
				switch (numeroDec) {
				case 0: hex = '0';
				break;
				case 1: hex = '1';
				break;
				case 2: hex = '2';
				break;
				case 3: hex = '3';
				break;
				case 4: hex = '4';
				break;
				case 5: hex = '5';
				break;
				case 6: hex = '6';
				break;
				case 7: hex = '7';
				break;
				case 8: hex = '8';
				break;
				case 9: hex = '9';
				break;
				case 10: hex = 'A';
				break;
				case 11: hex = 'B';
				break;
				case 12: hex = 'C';
				break;
				case 13: hex = 'D';
				break;
				case 14: hex = 'E';
				break;
				case 15: hex = 'F';
				break;
				}
				
				numeroHex.push(hex);
			}
		}
		
		return numeroHex;
	}
	
	public String LeePila(Stack<Character> numeroHex) {
		StringBuilder resultado = new StringBuilder();
		
		while(!numeroHex.empty()) {
			resultado.append(numeroHex.pop());
		}
		
		return resultado.toString();
	}
}
