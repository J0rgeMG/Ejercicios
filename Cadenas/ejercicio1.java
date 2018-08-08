package Cadenas;

public class ejercicio1 {

	public static void main(String[] args) {
		Cadena miCadena = new Cadena();
		
		String frase = "Eres todo lo que tengo. _3-";
		String fraseSinEspacios;
		String fraseMinusculas;
		String fraseMayusculas;
		
		miCadena.InfoCadena(frase);
		
		fraseSinEspacios = miCadena.SuprimeEspaciosEnBlanco(frase);
		miCadena.InfoCadena(fraseSinEspacios);
		
		fraseMinusculas = miCadena.PasaMinusculas(frase);
		miCadena.InfoCadena(fraseMinusculas);
		
		fraseMayusculas = miCadena.PasaMayusculas(frase);
		miCadena.InfoCadena(fraseMayusculas);
		
		miCadena.InfoCadena(miCadena.EliminaAcentos("Ésto ÉSñ algo más"));
	}

	
}
