package br.com.xti.herança;

public class Cachorro extends Animal {

	public Cachorro() {super(30, "Carne"); 
	super.dormir();
	}
	
	
	void fazerBarulho(){
		System.out.println("Au, Au");
		}
	
	
}
