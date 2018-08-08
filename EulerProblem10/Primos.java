package EulerProblem10;

public class Primos {
	//Metodo para saber si un numero es primo o no
	public boolean EsPrimo(int numero) {
		boolean respuesta = true;
		
		for(int i = 2; i < numero; i++) {
			if(numero % i == 0) {
				respuesta = false;
			}
		}
		
		return respuesta;
	}
}
