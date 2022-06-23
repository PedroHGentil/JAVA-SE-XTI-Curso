package br.com.xti.erros;

import java.util.Scanner;

public class Assertions {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Entre um numero de 0 a 10");
		int n = s.nextInt();
		assert (n>=0 && n<=10): "Numero Invalido!";
		System.out.println("Voce entrou " + n);
		
		
		
		
		

	}

}
