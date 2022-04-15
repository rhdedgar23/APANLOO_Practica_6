package ArbolGrafico;

public class NodoAr {

	int dato;
	NodoAr izq;
	NodoAr der;
	
	public NodoAr(int dato) {
		this.dato= dato;
	}
	
	public NodoAr(int dato, NodoAr izq, NodoAr der) {
		this.dato= dato;
		this.izq= izq;
		this.der= der;
	}
}
