package br.com.xti.logica;

/**
*Aula Arrays
*@author Pedro Henrique Gentil
*/
public class Arrays{
	public static void main (String[] args){
		String[] paises = {"Brasil", "Russia", "India", "China"};//definindo array
		System.out.println(paises[0]); //conteudo desejado idicado pela posicao
		paises[0] = "BRAZIL"; //mudando o conteudo idicando a posicao do mesmo
		System.out.println(paises[0]);
		int[] impares = new int[5]; //chamando o array pelo numero de posicoes(5) usando new
		impares[0]= 1;
		impares[1]= 3;
		impares[2]= 5;
		impares[3]= 7;
		impares[4]= 9;
		System.out.println(paises.length);//achar numeros de posicoes do array
	//	System.out.println(Arrays.toString(paises)); //apresentao conteudo do array
	//	Arrays.binarySearch(paises, "Russia"); //pesquina dentro do array entragando a posicao
	//	int posicao = Arrays.binarySearch (paises, "Russia"); // colocando a posicao em uma classe
	//	System.out.println(posicao);
	//	Array.sort(paises, 0, paises.length); // ordenacao do conteudo dentro do array
	//	System.out.println(Arrays.toString(paises));
	//	Double[] valores = {12.35, 123.232}; // acessar metodo do abjeto dentro do array
	//	System.out.println(valores [0].doubleValue());
		
	
	
	}	
	
	
}