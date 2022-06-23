package br.com.xti.poo;

public class Galinha {

	public static double ovosDaGranja; // Global
	
	public double ovos; // Total de ovos da granja
	
	public Galinha botar() {
		this.ovos++;
		Galinha.ovosDaGranja++;
		return this;
		}
	
	public static double mediaDeOvos (int galinhas) {
		return Galinha.ovosDaGranja / galinhas;
		
	}
}
