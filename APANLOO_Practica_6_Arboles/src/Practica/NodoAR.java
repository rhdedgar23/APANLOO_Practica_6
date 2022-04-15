package Practica;

public class NodoAR {

		int dato;
		NodoAR izq;
		NodoAR der;
		
		//mi constructor
		public NodoAR(int dato) {
			this.dato= dato;
		}
		
		//metodo del profe
		public static NodoAR insertaEnArbol(int dato, NodoAR izq, NodoAR der) {
			
			NodoAR aux= new NodoAR();
			aux.dato= dato;
			aux.izq= izq;
			aux.der= der;
			
			return aux;
		}
		
		public NodoAR(){
			
		}
}
