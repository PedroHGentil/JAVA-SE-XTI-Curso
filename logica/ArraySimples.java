package br.com.xti.logica;
import java.util.ArrayList;

public class ArraySimples{
	
	public static void main(String[] args){
	
	ArrayList<String> cores = new ArrayList<>(); //Criando um ArrayList
	
	cores.add("Branco"); //Adicionando conteudo
	cores.add(0, "Vermelho"); //Adicionando conteudo informando tambem a posicao
	cores.add("Amarelo");
	cores.add("Azul");
	System.out.println(cores.toString()); //Representacao em texto do conteudo do Arraylist
	
	System.out.println("Tamanho=" + cores.size()); //Representacao do tamanho e da quantidado do array
	System.out.println("Elemento2=" + cores.get(2)); // Buscando o conteudo pela posicao
	System.out.println("Indice Branco=" + cores.indexOf("Branco")); // Buscando a posicao pelo objeto
	
	cores.remove("Branco"); // Removendo um elemento do Array
	
	System.out.println("Tem Amarelo ? " + cores.contains("Amarelo")); //Pesquisa da existencia do conteudo especifico
	System.out.println("Tem Cinza ? " + cores.contains("Cinza"));
	}
	
	
}