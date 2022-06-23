package br.com.xti.logica;
import java.util.ArrayList;
import java.util.Scanner;

public class Fluxo2{
	public static void main(String[] args){
	/* Fluxo de Repeticao */
	ArrayList<String> produtos = new ArrayList<String>();
	try (Scanner s = new Scanner(System.in)) {
		System.out.println("Liste seus produtos : Para sair digite FIM");
		
		String produto;
		while(!"FIM".equals(produto = s.nextLine())){
			produtos.add(produto);
		}
	}
	System.out.println(produtos.toString());
	}
}