package br.com.xti.heran�a;

public class Animal {

	protected int serial;
	double peso;
	String comida;
	
	public Animal(double peso, String comida) {
	this.peso = peso; 
	this.comida = comida;
	}
	
	void dormir() {System.out.println("ZzZzzZz...");}
	void fazerBarulho() {System.out.println("Fazer Barulho");}

	
		
	}

