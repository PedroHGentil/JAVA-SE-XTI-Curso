package br.com.xti.heran�a;

public class Quadrado implements AreaCalculavel {

	double lado;
	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	public double calculaArea(){return lado *lado;}
}
