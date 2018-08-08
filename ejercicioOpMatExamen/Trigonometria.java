package ejercicioOpMatExamen;

public class Trigonometria {
	final float PI = 3.1415926f;
	OperacionesMatematicas op = new OperacionesMatematicas();
	
	public float RadianesGrados(int radianes) {
		float grados;
		
		grados = (radianes * 180) / PI;
		
		return grados;
	}
	
	public float GradosRadianes(float grados) {
		float radianes;
		
		radianes = (grados * PI) / 180;
		
		return radianes;
	}
	
	public float AproxCoseno(int numero) {
		float numeroRad = this.GradosRadianes(numero);
		boolean sumar = false;
		int coseno = op.Potencia((int)numeroRad, 0) / op.Factorial(0);
		
		for(int i = 2; i < 15; i += 2) {
			if(sumar) {
				coseno += op.Potencia((int)numeroRad, i) / op.Factorial(i);
			}
			else {
				coseno -= op.Potencia((int)numeroRad, i) / op.Factorial(i);
			}
		}
		
		return coseno;
	}
}
