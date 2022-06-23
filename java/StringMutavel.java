package br.com.xti.java;

public class StringMutavel {

	public static void main(String[] args) {
		
		StringBuffer s0 = new StringBuffer();
		StringBuilder s1 = new StringBuilder();
		
		s1.toString(); //Convers�o para String
		s1.length(); // Tamanho em posi��es
		s1.capacity(); // Capacidade em tamanho
		
		s1.reverse();//Inverte ordem dos caracteres
		
		s1.append(" Trabalhando "); // Append � o metodo de concatenar Strings quantas vezes necessario
		char[] c = {'c', 'o', 'm'};
		s1.append(c).append(" textos.");
		System.out.println(s1);
		
		String url = new StringBuilder("www.xti.com.br").delete(0, 4).toString();
		System.out.println(url);

		//.delete informa a posi��o dentro da string que almeja ser deletada. 

		//O metodo toString � necessario para conversao em string depois de criar a variavel.
	}

}
