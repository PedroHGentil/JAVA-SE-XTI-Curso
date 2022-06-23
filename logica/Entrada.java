package br.com.xti.logica;
import java.util.Scanner;
public class Entrada {
	public static void main(String[] args){
		//Chamada do programa
		//System.out.println(args[0]);
		
		try (//Interagindo com o Usuario
	Scanner S = new Scanner(System.in)) {
		System.out.println("Qual e o seu nome");
	String nome = S.nextLine();
		System.out.println("Bem vindo " + nome);
	}
		
	}


}