package br.com.xti.logica;
public class Operator {
	public static void main(String[] args) {
		//2 + 3 Operador Binario
		// -2 Operador Unario
		//true? "sim": não operador ternário
		String x = "9" + "4";
		System.out.println(x);
		double y = (7 - 4 + 3) * 2;
		System.out.println(y);
		double z = 7 % 3;
		System.out.println(z);
		int w = 6;
		int k = ++w; // significa pré o incremento; 
		int p = w++; // significa pos incremento
/**Existe tambem o operador pré e pós decremento como exemplo --w e w-- */
		// Operador de comparacao
		int l = 6;
		// l==6; retorna valor boolean true or false
		System.out.println(l==6); // comparacao
		System.out.println(l!=7); // diferente
		System.out.println(l>10); // maior
		System.out.println(l<=5); // menor ou igual
		Integer j = 12; 
		System.out.println(j instanceof Integer); // Orientacao apenas a tipos de dados objeto
		}

}