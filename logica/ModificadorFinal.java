package br.com.xti.logica;
/**
	*Modificador Final e Nomenclatura
	*@author Pedro Henrique Gentil
*/
public class ModificadorFinal {
	public static void main (String [] args){
		
		int populacaoBrasileira = 203429773;
		
		final double PI = 3.141592653589; // final o valor do objeto constante.
	
	//Se o valor da variavel final for modificado, o complicador indicará erro.
		
		final double SEXO_MASCULINO = 'M';
		final double SEXO_FEMININO = 'F';
		
	//Variaveis utilizam da nomenclatura Kamiocase, ja a constante com letras maiuscula, se composto utilizacao do underline.
		
		System.out.println(PI);
	}
	
}