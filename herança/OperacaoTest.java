package br.com.xti.herança;

public class OperacaoTest {

	public static void calcule(OperaçaoMatematica o, double x, double y) {
		System.out.println(o.calcular(x,y));
	}
	
	public static void main(String[] args) {
	
		calcule(new Soma(), 5, 5);
		calcule(new Multiplicacao(), 5, 5);
		
		//Sobrescrever Condicoes normais por polimorfismo
		
	}

}
