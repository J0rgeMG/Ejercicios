package ejercicioOperaciones;

public class division {
	public boolean Division(int dividendo, int divisor) {
		boolean puede = true;
		int contador = 0;
		int resto;
		int nDividendo = dividendo;
		
		if(nDividendo >= 0 || divisor > 0) {
			while(nDividendo >= divisor) {
				nDividendo -= divisor;
				
				contador++;
			}
			
			resto = nDividendo;
			
			System.out.println(dividendo + " " + divisor + " | " + contador + " " + resto);
		}
		else {
			puede = false;
		}
		
		return puede;
	}
}
