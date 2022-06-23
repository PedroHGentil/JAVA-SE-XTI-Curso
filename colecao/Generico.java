package br.com.xti.colecao;

import java.util.ArrayList;

public class Generico <E>{
	
	Object elemento;
	
	public void setElemento(Object element) {
		this.elemento = elemento;
	}
	
	public E getElemento() {
		return (E) elemento;
	}
	 
	public double soma(ArrayList<? extends Number> list) {
		double total = 0;
		Number[] lista = null;
		for (Number number : lista) {
			total += number.doubleValue();
		}	return total;	
	}

	public static void main(String[] args) {
		
		Generico<String> g = new Generico<>();
		g.setElemento("Lago Paranoá");
		String e = (String) g.getElemento();
		((String) g.getElemento()).toUpperCase();
		
		

	}

}
