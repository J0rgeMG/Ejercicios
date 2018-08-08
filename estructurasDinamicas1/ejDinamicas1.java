package estructurasDinamicas1;

import java.util.*;

public class ejDinamicas1 {	
	public static void main(String[] args) {
		List<Integer> miLista = new ArrayList<Integer>();
		EstructurasDinamicas EsDi = new EstructurasDinamicas();
		
		EsDi.AListAņadirElemento(miLista, 1);
		EsDi.AListMostrarElementos(miLista);
		
		EsDi.AListAņadirElemento(miLista, 2);
		EsDi.AListMostrarElementos(miLista);
		
		EsDi.AListAņadirElemento(miLista, 4);
		EsDi.AListMostrarElementos(miLista);
		
		EsDi.AListInsertarElemento(miLista, 3, 2);
		EsDi.AListMostrarElementos(miLista);
		
		EsDi.AListEliminarElemento(miLista, 0);
		EsDi.AListMostrarElementos(miLista);
		
		System.out.println(EsDi.AListCuentaElemento(miLista, 1));
		System.out.println(EsDi.AListCuentaElemento(miLista, 4));
	}
}
