package estructuras;

import java.util.*;

public class estructura {

	public static void main(String[] args) {
		Stack<Persona> cola = new Stack<Persona>();
		int minimo = 0;
		int maximo = 50;
		int minimo2 = 5;
		int maximo2 = 75;
		float dinero = 0f;
		Persona personaActual;
		
		int cantidadGente = (int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
		
		for(int i = 0; i < cantidadGente; i++) {
			cola.push(new Persona((int)Math.floor(Math.random()*(minimo2-(maximo2+1))+(maximo2+1))));
		}
		
		while(!cola.empty()) {
			personaActual = cola.pop();
			
			if(personaActual.getEdad() < 11) {
				dinero += 1f;
			}
			else {
				if(personaActual.getEdad() > 10 && personaActual.getEdad() < 18) {
					dinero += 2.5f;
				}
				else {
					dinero += 3.5f;
				}
			}
		}
		
		System.out.println(dinero);
	}

}
