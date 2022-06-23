package br.com.xti.logica;
/**
*Apresentar conceitos de Variavel
*@author Pedro Henrique Gentil
*/
public class Variavel {
	
	public static void main(String[] args) {
			
			int idade = 24; // numero inteiro
			double preco = 12.45; // numero fracionado
			char sexo = 'M'; // uma letra apenas Unicode
			boolean casado = false; // true or false
			
			byte b = 127; // ate 127
			short s = 32767; // ate 32768
			int i = 2000000000; // 2 bilhoes
			long l = 9_000_000_000_000_000L; // 9 quintilhoes
			double d = 1.7976931348623157E+308; // ate 1.7976931348623157E+308 pela IEEE 754
			float f = 123f; // letra no final significa qual a variavel utilizada
			
			/*Numeros podem ser escritos na forma binaria*/
			byte bb = 0b01010101; // 0b significa formato binario / 8 bits/ 1byte
			short ss = 0b0101010101010101; //16bits / 2bytes
			int ii = 0b01010101010101010101010101010101; //32bits / 4 bytes
			
			i = s; // cast Implicito
			System.out.println(i);
			System.out.println(s);
			
			//i = l; //cast Explicito
			//System.out.println(l);
			//System.out.println(i);
	
	}
		
			

}