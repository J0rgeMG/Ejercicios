package Cadenas;

public class Cadena {
	//Tabla con todas las vocales, acentos incluidos
	char[] Vocales = {'A', 'E', 'I', 'O', 'U', 'Á', 'É', 'Í', 'Ó', 'Ú', 'a', 'e', 'i', 'o', 'u', 'á', 'é', 'í', 'ó', 'ú'};
	//Tabla con solo acentos
	char[] vocalesAcentos = {'Á', 'É', 'Í', 'Ó', 'Ú', 'á', 'é', 'í', 'ó', 'ú'};
	//Tabla con vocales SIN acentos
	char[] vocalesSinAcentos = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};
	
	//métodos publicos
	//Devuelve la cantidad de vocales que tiene una cadena
		public int CuentaVocales(String cadena) {
			int contador = 0;
			
			for(int i = 0; i < cadena.length(); i++) {
				if(this.esVocal(cadena.charAt(i))) {
					contador++;
				}
			}
			
			return contador;
		}
		
		//Devuelve la cantidad de espacios en blancos que tiene una cadena
		public int CuentaEspaciosEnBlanco(String cadena) {
			int contador = 0;
			
			for(int i = 0; i < cadena.length(); i++) {
				if(cadena.charAt(i) == ' ') {
					contador++;
				}
			}
			
			return contador;
		}
		
		//Devuelve una cadena recibida sin espacios
		public String SuprimeEspaciosEnBlanco(String cadena) {
			StringBuilder sb = new StringBuilder();
			
			for(int i = 0; i < cadena.length(); i++) {
				if(cadena.charAt(i) != ' ') {
					sb.append(cadena.charAt(i));
				}
			}
			
			return sb.toString();
		}
		
		//Devuelve una cadena recibida en minusculas
		public String PasaMinusculas(String cadena) {
			return cadena.toLowerCase();
		}
		
		//Devuelve una cadena recibida en mayusculas
		public String PasaMayusculas(String cadena) {
			return cadena.toUpperCase();
		}
		
		//Devuelve una cdena recibida pero sin acentos
		public String EliminaAcentos(String cadena) {
			StringBuilder sb = new StringBuilder();
			
			for(int i = 0; i < cadena.length(); i++) {
				sb.append(this.CambiaAcento(cadena.charAt(i)));
			}
			
			return sb.toString();
		}
		//Escribe informacion de la cadena recibida
		public void InfoCadena(String cadena) {			
			System.out.println(cadena);
			System.out.println("Cantidad de vocales: " + this.CuentaVocales(cadena));
			System.out.println("Cantidad de espacios en blanco: " + this.CuentaEspaciosEnBlanco(cadena));
		}
	//
	//metodos privados
		//Devuelve un valor logico indicando si una letra es vocal o no
		private boolean esVocal(char letra) {
			boolean respuesta = false;
			
			for(int i = 0; i < Vocales.length; i++) {
				if(letra == Vocales[i]) {
					respuesta = true;
				}
			}
			
			return respuesta;
		}
		private char CambiaAcento(char letra) {	
			char letraRespuesta = letra;
			
			for(int i = 0; i < vocalesAcentos.length; i++) {
				if(letraRespuesta == vocalesAcentos[i]) {
					letraRespuesta = vocalesSinAcentos[i];
				}
			}
				
			return letraRespuesta;
		}
	//
}