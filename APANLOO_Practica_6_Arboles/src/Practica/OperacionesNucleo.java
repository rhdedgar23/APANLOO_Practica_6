package Practica;

public class OperacionesNucleo {
	
	public static String getRaiz(NodoAR raiz) {
		return String.valueOf(raiz);
	}
	
	public static int getAltura(NodoAR raiz) {
		
		if(raiz== null) {
			
			return 0;
		}
		else {
			
			int alturaIzq= getAltura(raiz.izq);
			int alturaDer= getAltura(raiz.der);
			
			int altura= Math.max(alturaIzq, alturaDer)+1;
			
			return altura;
		}
	}
	
	public static int getNumNodos(NodoAR raiz) {
		
		if(raiz== null) {
			
			return 0;
		}
		else {
			
			int contadorIzq= getNumNodos(raiz.izq);
			int contadorDer= getNumNodos(raiz.der);
			
			int contador= contadorIzq + contadorDer +1;
			
			return contador;
		}
	}
	
	
}
