package B4_7;
/*
 * Leer por teclado una serie de 10 numeros enteros. La aplicacion debe indicarnos si los numeros estan
 * ordenados de forma creciente, decreciente, o si estan desordenados.
 * Autor: Jose Jorge Garcia Ramos
 * Fecha: 04/08/2018
 */
public class ejercicio7 {

	public static void main(String[] args) {
		int[] tablaOrdenada = {5, 4, 3, 2, 1};
		int[] tablaInvertida = {1, 2, 3, 4, 5};
		int[] tablaDesordenada = {5, 4, 1, 2, 3};
		
		TablaO Obj = new TablaO();
		
		Obj.EscribirTabla(tablaOrdenada);
		System.out.println(" " + Obj.EstaOrdenada(tablaOrdenada));
		
		Obj.EscribirTabla(tablaInvertida);
		System.out.println(" " + Obj.EstaOrdenada(tablaInvertida));
		
		Obj.EscribirTabla(tablaDesordenada);
		System.out.println(" " + Obj.EstaOrdenada(tablaDesordenada));

	}

}
