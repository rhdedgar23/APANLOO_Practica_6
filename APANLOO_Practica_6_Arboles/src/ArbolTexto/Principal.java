package ArbolTexto;

import java.util.ArrayList;

public class Principal{
	
	static ArrayList<NodoAr> arboles= new ArrayList<>(3); 
	
	public static void main(String[] args){
		
		//Arbol 1
		NodoAr raiz= new NodoAr(1);
		
		raiz.izq= new NodoAr(2);
		raiz.der= new NodoAr(3);
		
		raiz.izq.izq= new NodoAr(4);
		raiz.izq.der= new NodoAr(5);
		
		raiz.der.izq= new NodoAr(6);
		raiz.der.der= new NodoAr(7);
		
		//Arbol2
		NodoAr raiz2= new NodoAr(1);
				
		raiz2.izq = new NodoAr(7);
		raiz2.der= new NodoAr(2);		
				
		raiz2.der.izq= new NodoAr(3);
		raiz2.der.der= new NodoAr(4);
		
		raiz2.der.izq.izq= new NodoAr(5);
		raiz2.der.izq.der= new NodoAr(6);
		
		raiz2.der.izq.izq.izq= new NodoAr(8);
		
		//Arbol3
		NodoAr raiz3= new NodoAr(1);
				
		raiz3.izq= new NodoAr(2);
		
		raiz3.izq.izq= new NodoAr(4);
		raiz3.izq.der= new NodoAr(3);
		
		raiz3.izq.izq.der= new NodoAr(5);
		
		raiz3.izq.izq.der.izq= new NodoAr(6);
		
		raiz3.izq.izq.der.izq.der= new NodoAr(7);
		
		raiz3.izq.izq.der.izq.der.izq= new NodoAr(8);
		
		//Impresion de datos
		arboles.add(raiz);
		arboles.add(raiz2);
		arboles.add(raiz3);
		
		desplegarInfo();
	}
	
	public static void desplegarInfo() {
		
		int j;
		
		for(int i=0; i<arboles.size(); i++) {
			
			j=i+1;
			
			System.out.println("Arbol " + j + " -->");
			System.out.println("Nodo raiz: " + OperacionesNucleo.getRaiz(arboles.get(i)));
			System.out.println("Numero de nodos: " + OperacionesNucleo.getNumNodos(arboles.get(i)));
			System.out.println("Altura del arbol (con raiz en nivel 1): " + OperacionesNucleo.getAltura(arboles.get(i)));
			System.out.println("Recorrido en preorden: ");
			Recorridos.preorden(arboles.get(i));
			System.out.println("\nRecorrido en orden: ");
			Recorridos.orden(arboles.get(i));
			System.out.println("\nRecorrido en postorden: ");
			Recorridos.postorden(arboles.get(i));
			System.out.println("\n");
		}
	}
}
