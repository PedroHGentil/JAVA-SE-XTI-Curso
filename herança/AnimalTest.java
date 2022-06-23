package br.com.xti.herança;

public class AnimalTest {

	public static void barulho(Animal animal) {
		animal.fazerBarulho();
		
	}
	
	public static void main(String[] args) {
		
		Animal generico = new Animal(0, null);
		
		Cachorro toto = new Cachorro();
		toto.comida = "Carne";
		toto.dormir();
		
		Galinha carijo = new Galinha();
		carijo.dormir();
		
		System.out.println(toto instanceof Cachorro);
		System.out.println(toto instanceof Animal);
	
		toto.equals(carijo); //comparacao de igualdade entre objetos com retorno booleano
		toto.getClass(); //retorna o tipo da classe
		toto.hashCode(); //retorna estrutura de colecao como array
		toto.toString(); //retorna representacao em texto do objeto
	
	/* Todo programa tem herança como super classe object */
		
		generico.fazerBarulho();
		toto.fazerBarulho();
		carijo.fazerBarulho();
		
		barulho(toto);
		barulho(carijo);
	}

}
