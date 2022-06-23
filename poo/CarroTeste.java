package br.com.xti.poo;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro ferrari = new Carro();
		ferrari.modelo = "Ferrari Enzo";
		ferrari.velocidadeMaxima = 349;
		ferrari.segundosZeroACem = 3.2;
		Motor v12 = new Motor();
		v12.tipo = "V12";
		v12.potencia = 660;
		ferrari.motor = v12;
	
		Carro k = new Carro("Koeningsegg CCXR", 430, 3.1);
		Motor v8 = new Motor("V8", 1018);
		k.motor = v8;
		
		Carro bugatti = new Carro("Bugatti Veyron", 340, 2.2, new Motor("W16", 1200));
			
			System.out.println(bugatti.motor.potencia);
			System.out.println(bugatti.modelo);
		
		
}
}
