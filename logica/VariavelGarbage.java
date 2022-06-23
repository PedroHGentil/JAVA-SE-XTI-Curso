package br.com.xti.logica;
/**Garbage Collector coleta variaveis que nao estao sendo uteis e estao ocupando espaco na memoria*/
public class VariavelGarbage {
	
	public static void main (String[] args) {
		
		//Variavel Primitiva 
		int x = 7; // o numero 7 passa a nao existir
		x = 9;
		
		//Variavel de Referencia
		String y = "XTI"; // String é um objeto
		y = "www.xti.com.br"; // XTI continua na memoria sem ser utilizado
		y = null; //null limpa todo conteudo da variavel fazendo o garbage coletar conteudo
	
	System.out.println(y);
	System.out.println(x);
	
	}
	
	
}