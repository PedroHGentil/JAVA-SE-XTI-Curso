package br.com.xti.heran�a;

public class Cubo implements VolumeCalculavel, AreaCalculavel {

	double lado;
	
	public Cubo(double lado) {this.lado = lado;}
	
	public double calculaVolume() {
		
		return lado * lado * lado;
	}

	
	public double calculaArea() {
		
		return lado * lado;
	}

}
