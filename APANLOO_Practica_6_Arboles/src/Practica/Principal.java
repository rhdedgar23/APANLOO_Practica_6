package Practica;

public class Principal extends Recorridos{

	public static void main(String[] args) {
		
		/*
		//Creacion manual de un arbol
		NodoAR p= new NodoAR();
		NodoAR q= new NodoAR();
		NodoAR r= new NodoAR();
		
		p.dato= 5;
		q.dato= 4;
		r.dato= 6;
		
		p.izq= q;
		p.der= r;
		
		q.izq= null;
		q.der= null;
		
		r.izq= null;
		r.der= null;
		
		System.out.println("El dato del objeto P es: " + p.dato);
		System.out.println("El dato del objeto Q es: " + p.izq.dato);
		System.out.println("El dato del objeto R es: " + p.der.dato);
		
		//Creacion con metodos
		NodoAR a, b, c;
		
		b= NodoAR.insertaEnArbol(4, null, null);
		c= NodoAR.insertaEnArbol(6, null, null);
		a= NodoAR.insertaEnArbol(5, b, c);
		
		System.out.println("El dato del objeto A es: " + a.dato);
		System.out.println("El dato del objeto B es: " + a.izq.dato);
		System.out.println("El dato del objeto C es: " + a.der.dato);
		*/
		
		//mis metodos
		NodoAR raiz= new NodoAR(1);
		
		raiz.izq= new NodoAR(2);
		raiz.der= new NodoAR(3);
		
		raiz.izq.izq= new NodoAR(4);
		raiz.izq.der= new NodoAR(5);
		
		raiz.der.izq= new NodoAR(6);
		raiz.der.der= new NodoAR(7);
		
		System.out.println("Arbol 1 en preorden: ");
		preorden(raiz);
		
		System.out.println("\nArbol 1 en orden: ");
		orden(raiz);
		
		System.out.println("\nArbol 1 en postorden: ");
		postorden(raiz);
		
		System.out.println("\nArbol 1 en orden por nivel: ");
		nivel(raiz);
		
		System.out.println("\nArbol 1 en orden por nivel(codigo reducido): ");
		recorreNivel(raiz);
		
		System.out.println("\nEl numero de nodos en el Arbol 1 es de: " + String.valueOf(OperacionesNucleo.getNumNodos(raiz)));
		
		
		//arbol2
		NodoAR raiz2= new NodoAR(1);
		
		raiz2.izq = new NodoAR(2);
		
		
		raiz2.izq.der= new NodoAR(3);
		raiz2.izq.izq= new NodoAR(4);
		
		raiz2.izq.izq.der= new NodoAR(5);
		
		raiz2.izq.izq.izq= new NodoAR(6);
		
		raiz2.izq.izq.izq.der= new NodoAR(7);
		
		raiz2.izq.izq.izq.der.izq= new NodoAR(8);
		
		System.out.println("El numero de nodos en el Arbol 2 es de: " + String.valueOf(OperacionesNucleo.getNumNodos(raiz2)));
		
		//arbol3
		NodoAR raiz3= new NodoAR(1);
		
		raiz3.izq= new NodoAR(7);
		raiz3.der= new NodoAR(2);
		
		raiz3.der.izq= new NodoAR(3);
		raiz3.der.der=  new NodoAR(4);
		
		raiz3.der.izq.izq= new NodoAR(5);
		raiz3.der.izq.der= new NodoAR(6);
		
		raiz3.der.izq.izq.izq= new NodoAR(8);
		
		System.out.println("El numero de nodos en el Arbol 3 es de: " + String.valueOf(OperacionesNucleo.getNumNodos(raiz3)));
		
		
	}
	

}
