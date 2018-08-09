package estructurasDinamicas2;

import java.util.*;

public class Dinamicas {
	public String PasaBinario(int numero) {
		StringBuilder sb = new StringBuilder();
		Stack<Integer> pila = new Stack<Integer>();
		
		while(numero >= 2) {
			pila.push(numero % 2);
			
			System.out.println(numero);
			
			numero = numero / 2;
		}
		
		pila.push(1);
		
		while(!pila.isEmpty()) {
			sb.append(pila.pop());
		}
		
		return sb.toString();
	}
}
