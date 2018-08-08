package B4_7;

public class TablaO {
	public String EstaOrdenada(int[] tabla) {
		String respuesta = "ERROR";
		
		for(int i = 1; i < tabla.length; i++) {
			if(tabla[i] > tabla[i - 1] && (respuesta == "ERROR" || respuesta == "ORDENADA")) {
				respuesta = "ORDENADA";
			}
			else {
				if(tabla[i] < tabla[i - 1] && (respuesta == "ERROR" || respuesta == "INVERSA")) {
					respuesta = "INVERSA";
				}
				else {
					respuesta = "DESORDENADA";
				}
			}
		}
		
		return respuesta;
	}
	public void EscribirTabla(int[] tabla) {
		for(int i = 0; i < tabla.length; i++) {
			System.out.print(tabla[i] + " ");
		}
	}
}
