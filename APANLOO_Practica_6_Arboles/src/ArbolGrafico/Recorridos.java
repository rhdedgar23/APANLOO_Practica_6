package ArbolGrafico;

import java.util.LinkedList;

public class Recorridos {
	
	static String strPreorden="";
	static String strOrden="";
	static String strPostorden="";
	static String strNivel="";
	
	public static void preorden(NodoAr raiz) {
		
		if(raiz== null) {
			return;
		}
		else {
			System.out.print(raiz.dato + ",");
			strPreorden= strPreorden + raiz.dato + ",";
			preorden(raiz.izq);
			preorden(raiz.der);
		}
	}
	
	public static void orden(NodoAr raiz) {
		
		if(raiz== null) {
			return;
		}
		else {
			orden(raiz.izq);
			System.out.print(raiz.dato + ",");
			strOrden= strOrden + raiz.dato + ",";
			orden(raiz.der);
		}
	}
	
	public static void postorden(NodoAr raiz) {
		
		if(raiz== null) {
			return;
		}
		else {
			postorden(raiz.izq);
			postorden(raiz.der);
			System.out.print(raiz.dato + ",");
			strPostorden= strPostorden + raiz.dato + ",";
		}
	}
	
	public static void nivel(NodoAr raiz) {
		
		if(raiz== null) {
			return;
		}
		else {
			LinkedList<NodoAr> fila= new LinkedList<>();
			fila.add(raiz);
			
			while(fila.size()>0) {//mientras haya elementos en la fila para un nivel dado, tenemos que seguir sacando elementos de la fila(para imprimirlos)
				
				int count= fila.size();//inicializa un contador que cuente los nodos, en el nivel, que se agregan a la fila
				
				while(count>0) {//mientras haya nodos en el nivel (inicialmente habra 1 debido a la raiz)
					
					 NodoAr nodo= fila.getFirst();//asignamos el primer elemento en la fila a un nuevo nodo
					 fila.remove();//remueve ese mismo elemento de la fila(para dar paso a los demas elementos, o nodos, en el siguiente nivel)
					 System.out.print(nodo.dato + ",");
					 strNivel= strNivel + raiz.dato + ",";
					 
					 if(nodo.izq != null) {
						 fila.add(nodo.izq);
					 }
					 if(nodo.der != null) {
						 fila.add(nodo.der);
					 }
					 
					 count--;
				}
			}
		}
	}
	
	//Ordenamiento por nivel pero quiero ver si lo puedo simplificar un poco mas
	//Primero, checa si el objeto raiz tiene algun dato. Lo esperado es que si pero se pone el if por si acaso.
	//A continuacion, crea la fila en la que se iran poniendo los nodos y agrega la raiz a esa fila. Aqui, fila.size()==1. 
	//Luego, mientras la fila tenga nodos, se obtiene al nodo que se encuentra en la posicion 0, se imprime su dato. 
	//Despues,checa si ese nodo tiene descendientes izquierdo o derechos. En el caso de que si, se agregan a la fila
	//y se elimina de la fila. 
	//Se reinicia el ciclo dando paso a los nodos en la fila.
	public static void recorreNivel(NodoAr raiz) {
		
		if(raiz== null) {
			return;
		}
		else {
			
			LinkedList<NodoAr> fila= new LinkedList<>();
			fila.add(raiz);
			
			while(fila.size()>0) {
				
					 NodoAr nodo= fila.getFirst();
					 System.out.print(nodo.dato + ",");
					 
					 if(nodo.izq != null) {
						 fila.add(nodo.izq);
					 }
					 if(nodo.der != null) {
						 fila.add(nodo.der);
					 }
					 
					 fila.remove();
			}
		}
	}
	
	public static void resetStrings() {
		
		strPreorden="";
		strOrden="";
		strPostorden="";
		strNivel="";
	}
}
