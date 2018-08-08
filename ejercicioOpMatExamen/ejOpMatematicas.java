package ejercicioOpMatExamen;

public class ejOpMatematicas {

	public static void main(String[] args) {
		int numero;
		int base;
		int exponente;
		OperacionesMatematicas op = new OperacionesMatematicas();
		
		System.out.println("Introduce un numero");
		numero = Teclado.entero();

		System.out.println("El factorial de " + numero + " es " + op.Factorial(numero));
		
		System.out.println("Introduce una base");
		base = Teclado.entero();
		System.out.println("Introduce un exponente");
		exponente = Teclado.entero();
		
		System.out.println(base + " elevado a " + exponente + " es igual a " + op.Potencia(base, exponente));
	}

}
