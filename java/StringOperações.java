package br.com.xti.java;

public class StringOperações {

	public static void main(String[] args) {
		
		String s1 = "Write Once"; // Literal String
		String s2 = s1 + "Run AnyWhere"; // Concatenação
		String s3 = new String("Java Virtual Machine"); // Metodo Construtor
		
		char[] array = {'J', 'a','v','a'};
		String s4 = new String (array);
		
		//OPERAÇÕES 
		int tamanho = s1.length(); // Quantidade de caracteres
		char letra = s1.charAt(0); // Letra naquela posição
		String texto = s1.toString(); // Representação em texto
		
		//LOCALIZAÇÃO
		int posicao = s3.indexOf("Virtual"); // posicao que comeca a palavra
		int ultima = s3.lastIndexOf('a'); // retorna a posicao da ultima char
		boolean vazia = s3.isEmpty(); // Questionando se a string esta vazia
		
		//COMPARAÇÃO
		String xti = "XTI";
		boolean x = xti.equals("xti"); //Compara o valores de duas strings
		boolean y = xti.equalsIgnoreCase("xti"); // Ignora letras maiusculas e minusculas
		boolean z = xti.startsWith("XT"); // Questiona se o conteudo se comeca
		boolean p = xti.endsWith("TI"); // Questiona se o conteudo se termina
		
		int c = "amor".compareTo("bola"); //prioridade em ordem alfabetica -1, 0 ,1
		int b = "123".compareTo("234"); // Qual numero é maior do que outro no formato String
		
		String so = "Olhe, olhe!";
		so.regionMatches(true, 6, "Olhe", 0, 4); // coordenadas para identificar o termo desejado
		
		//EXTRAÇÃO
		String l = "O Brasil é lindo";		
		String sl = l.substring(11); // Retira apenas um pedaço da string, em outra string a partir da posição
		sl = l.substring(2, 8);// Retira um pedaço da string entre as coordenadas inicial e final
		
		//MODIFICAÇÃO
		sl = l.concat(" que Maravilha");// Metodo Concat
		sl += "que Maravilha"; // Equivalente a Concat
		sl = l.replace('s', 'z'); //Trocar Caracteres
		sl = l.replaceFirst(" ", "X"); //Troca o primeiro espaço em branco por X
		sl = l.replaceAll(" ", "X"); // Troca todos espaços em bracom por X
		
		//CONVERÇÃO
		sl = l.toUpperCase();// Em letra Maiuscula
		sl = l.toLowerCase();// Em letra Minuscula
		System.out.println("   espaços   ".trim());//Remove espacos em braco da String, mas nao do meio da String
	}

}
