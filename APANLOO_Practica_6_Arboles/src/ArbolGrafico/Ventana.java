package ArbolGrafico;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Ventana extends JFrame implements ActionListener, AdjustmentListener{
	
	JScrollPane scroll;
	
	JCheckBox raizC;
	JCheckBox nodosC;
	JCheckBox alturaC;
	JCheckBox preordenC;
	JCheckBox ordenC;
	JCheckBox postordenC;
	
	JTextField raizT;
	JTextField nodosT;
	JTextField alturaT;
	JTextField preordenT;
	JTextField ordenT;
	JTextField postordenT;
	
	ArrayList<JCheckBox> checkboxes= new ArrayList<>(6);
	
	int arbol;
	
	static NodoAr raiz;
	static NodoAr raiz2;
	static NodoAr raiz3;

	public Ventana() {
		
		super("Arboles Graficos");
		this.setSize(400, 800);
		
		//------JPanels------
		JPanel panelImagenes= new JPanel();
		JPanel panelCentral= new JPanel();
		
		panelImagenes.setBackground(Color.gray);
		panelCentral.setBackground(Color.DARK_GRAY);
		
		scroll= new JScrollPane(panelImagenes, JScrollPane.VERTICAL_SCROLLBAR_NEVER, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scroll.getHorizontalScrollBar().addAdjustmentListener(this);
	
		this.add(scroll, BorderLayout.NORTH);
		this.add(panelCentral, BorderLayout.CENTER);

		//------PanelImagenes------
		JLabel img1= new JLabel();
		JLabel img2= new JLabel();
		JLabel img3= new JLabel();
		ImageIcon icon1= new ImageIcon("arbol1.png");
		ImageIcon icon2= new ImageIcon("arbol2.png");
		ImageIcon icon3= new ImageIcon("arbol3.png");
		
		img1.setIcon(icon1);
		img2.setIcon(icon2);
		img3.setIcon(icon3);
		
		panelImagenes.add(img1);
		panelImagenes.add(img2);
		panelImagenes.add(img3);
		
		//------PanelCentral------
		panelCentral.setLayout(new GridLayout(6,2));
		
		raizC= new JCheckBox("Raiz");
		nodosC= new JCheckBox("Numero de Nodos");
		alturaC= new JCheckBox("Altura del arbol");
		preordenC= new JCheckBox("Preorden");
		ordenC= new JCheckBox("Orden");
		postordenC= new JCheckBox("Postorden");
		
		checkboxes.add(raizC);
		checkboxes.add(nodosC);
		checkboxes.add(alturaC);
		checkboxes.add(preordenC);
		checkboxes.add(ordenC);
		checkboxes.add(postordenC);
		
		raizT= new JTextField();
		nodosT= new JTextField();
		alturaT= new JTextField();
		preordenT= new JTextField();
		ordenT= new JTextField();
		postordenT= new JTextField();
		
		raizC.addActionListener(this);
		nodosC.addActionListener(this);
		alturaC.addActionListener(this);
		preordenC.addActionListener(this);
		ordenC.addActionListener(this);
		postordenC.addActionListener(this);
		
		panelCentral.add(raizC);
		panelCentral.add(raizT);
		panelCentral.add(nodosC);
		panelCentral.add(nodosT);
		panelCentral.add(alturaC);
		panelCentral.add(alturaT);
		panelCentral.add(preordenC);
		panelCentral.add(preordenT);
		panelCentral.add(ordenC);
		panelCentral.add(ordenT);
		panelCentral.add(postordenC);
		panelCentral.add(postordenT);
		
		//------Arboles------
		//Arbol 1
		raiz= new NodoAr(1);
				
		raiz.izq= new NodoAr(2);
		raiz.der= new NodoAr(3);
				
		raiz.izq.izq= new NodoAr(4);
		raiz.izq.der= new NodoAr(5);
				
		raiz.der.izq= new NodoAr(6);
		raiz.der.der= new NodoAr(7);
				
		//Arbol2
		raiz2= new NodoAr(1);
						
		raiz2.izq = new NodoAr(7);
		raiz2.der= new NodoAr(2);		
						
		raiz2.der.izq= new NodoAr(3);
		raiz2.der.der= new NodoAr(4);
				
		raiz2.der.izq.izq= new NodoAr(5);
		raiz2.der.izq.der= new NodoAr(6);
				
		raiz2.der.izq.izq.izq= new NodoAr(8);
				
		//Arbol3
		raiz3= new NodoAr(1);
						
		raiz3.izq= new NodoAr(2);
				
		raiz3.izq.izq= new NodoAr(4);
		raiz3.izq.der= new NodoAr(3);
				
		raiz3.izq.izq.der= new NodoAr(5);
				
		raiz3.izq.izq.der.izq= new NodoAr(6);
				
		raiz3.izq.izq.der.izq.der= new NodoAr(7);
				
		raiz3.izq.izq.der.izq.der.izq= new NodoAr(8);
		
		/*------Visibilidad del frame------*/
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent f) {
		
		if(f.getSource()==raizC) {
			
			if(raizC.isSelected()==true) {
				checaArbol_raiz();
			}
			else {
				raizT.setText("");
			}
		}
		
		if(f.getSource()==nodosC) {
			
			if (nodosC.isSelected()==true) {
				checaArbol_nodos();
			}
			else {
				nodosT.setText("");
			}
		}
		
		if(f.getSource()==alturaC) {
			
			if (alturaC.isSelected()==true) {
				checaArbol_altura();
			}
			else {
				alturaT.setText("");
			}
		}
		
		if(f.getSource()==preordenC) {
			
			if (preordenC.isSelected()==true) {
				checaArbol_preorden();
			}
			else {
				preordenT.setText("");
			}
		}
		
		
		if(f.getSource()==ordenC) {
			
			if (ordenC.isSelected()==true) {
				checaArbol_orden();
			}
			else {
				ordenT.setText("");
			}
		}
		
		if(f.getSource()==postordenC) {
			
			if (postordenC.isSelected()==true) {
				checaArbol_postorden();
			}
			else {
				postordenT.setText("");
			}
		}	
	}
	
	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		
		if(e.getSource()==scroll.getHorizontalScrollBar()) {
			
			//System.out.println(e.getValue());
			
			if(e.getValue()>=0 && e.getValue()<=205) {//selecciona arbol1
				//System.out.println("Arbol 1");
				arbol= 1;
			}
			if(e.getValue()>205 && e.getValue()<=634) {//selecciona arbol2
				//System.out.println("Arbol 2");
				arbol= 2;
			}
			if(e.getValue()>634) {//selecciona arbol3
				//System.out.println("Arbol 3");
				arbol= 3;
			}
		}
	}
	
	
	public void checaArbol_raiz() {
				
		switch(arbol) {
		case 1: raizT.setText(OperacionesNucleo.getRaiz(raiz));
		break;
		case 2: raizT.setText(OperacionesNucleo.getRaiz(raiz2));
		break;
		case 3: raizT.setText(OperacionesNucleo.getRaiz(raiz3));
		break;
		}
	}
	
	public void checaArbol_nodos() {
		
		switch(arbol) {
		case 1: nodosT.setText(String.valueOf(OperacionesNucleo.getNumNodos(raiz)));
		break;
		case 2: nodosT.setText(String.valueOf(OperacionesNucleo.getNumNodos(raiz2)));
		break;
		case 3: nodosT.setText(String.valueOf(OperacionesNucleo.getNumNodos(raiz3)));
		break;
		}
	}
	
	public void checaArbol_altura() {
		
		switch(arbol) {
		case 1: alturaT.setText(String.valueOf(OperacionesNucleo.getAltura(raiz)));
		break;
		case 2: alturaT.setText(String.valueOf(OperacionesNucleo.getAltura(raiz2)));
		break;
		case 3: alturaT.setText(String.valueOf(OperacionesNucleo.getAltura(raiz3)));
		break;
		}
	}
	
	public void checaArbol_preorden() {
		
		if(arbol==1) {
			Recorridos.resetStrings();
			Recorridos.preorden(raiz);
			preordenT.setText(Recorridos.strPreorden);
		}
		if(arbol==2) {
			Recorridos.resetStrings();
			Recorridos.preorden(raiz2);
			preordenT.setText(Recorridos.strPreorden);
		}
		if(arbol==3) {
			Recorridos.resetStrings();
			Recorridos.preorden(raiz3);
			preordenT.setText(Recorridos.strPreorden);
		}
	}
	
	public void checaArbol_orden() {
		
		switch(arbol) {
		case 1: 
			Recorridos.resetStrings();
			Recorridos.orden(raiz);
			ordenT.setText(Recorridos.strOrden);
		break;
		case 2: 
			Recorridos.resetStrings();
			Recorridos.orden(raiz2);
			ordenT.setText(Recorridos.strOrden);
		break;
		case 3: 
			Recorridos.resetStrings();
			Recorridos.orden(raiz3);
			ordenT.setText(Recorridos.strOrden);
		break;
		}
	}
	
	public void checaArbol_postorden() {
		
		switch(arbol) {
		case 1: 
			Recorridos.resetStrings();
			Recorridos.postorden(raiz);
			postordenT.setText(Recorridos.strPostorden);
		break;
		case 2: 
			Recorridos.resetStrings();
			Recorridos.postorden(raiz2);
			postordenT.setText(Recorridos.strPostorden);
		break;
		case 3: 
			Recorridos.resetStrings();
			Recorridos.postorden(raiz3);
			postordenT.setText(Recorridos.strPostorden);
		break;
		}
	}
}
