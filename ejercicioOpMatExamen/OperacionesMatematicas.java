package ejercicioOpMatExamen;

public class OperacionesMatematicas {
	//Metodo que calcula el factorial de un numero
	public int Factorial (int numero) {
		int factorial = -1;
		
		if(numero > 0) {
			factorial = numero;
			
			for(int i = 1; i < numero; i++) {
				factorial = factorial * (numero - i);	
			}		
		}
		else {
			if(numero == 0) {
				factorial = 0;
			}
		}
		
		return factorial;
	}
	
	public int Potencia (int base, int exponente) {
		int potencia = -1;
		
		if(exponente > 0) {
			potencia = base;
			
			for(int i = 1; i < exponente; i++) {
				potencia = potencia * base;
			}
		}
		else {
			if(exponente == 0) {
				potencia = 1;
			}
		}
		
		return potencia;
	}
}
