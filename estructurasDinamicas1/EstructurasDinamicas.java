package estructurasDinamicas1;

import java.util.*;

public class EstructurasDinamicas {
	
	public void AListAñadirElemento(List<Integer> lista, int elemento) {
		lista.add(elemento);
	}
	public void AListInsertarElemento(List<Integer> lista, int elemento, int posicion) {
		lista.add(posicion, elemento);
	}
	public void AListEliminarElemento(List<Integer> lista, int posicion) {
		lista.remove(posicion);
	}
	public void AListMostrarElementos(List<Integer> lista) {
		for(int i = 0; i < lista.size(); i++) {
			System.out.print(lista.get(i) + " ");
		}
		System.out.println();
	}
	public int AListCuentaElemento(List<Integer> lista, int elemento) {
		int contador = 0;
		
		for(int i = 0; i < lista.size(); i++) {
			if(lista.get(i) == elemento) {
				contador++;
			}
		}
		
		return contador;
	}
}
