package EulerProblem10;

//La suma de todos los numeros primos hasta el numero 2 millones
//Autor: Jose Jorge Garcia Ramos
//Fecha: 04/08/2018

public class ejercicio10 {

	public static void main(String[] args) {
		int acumulador = 0;
		int maximo = 2000000;
		Primos obj = new Primos();
		
		for(int i = 2; i <= maximo; i++) {
			if(obj.EsPrimo(i)) {
				acumulador += i;
				System.out.print(i + ".");
			}
		}
		
		System.out.println(acumulador);
	}

}
