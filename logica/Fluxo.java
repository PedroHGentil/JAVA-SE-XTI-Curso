package br.com.xti.logica;
public class Fluxo {
	
	public static void main(String[] args) {
	
	int idade = 31;
	if(idade <= 11) {
		System.out.println("Crianca");
	} else if (idade > 11 && idade <= 18) {
		System.out.println("Adolescente");
	} else if (idade > 18 && idade <= 60) {
		System.out.println("Adulto");
	} else {
		System.out.println("Melhor Idade");
	}
	
	int nota = 8;
	if(nota >= 7){
		System.out.println("Passou");
	} else {
		System.out.println("Reprovou");
		if(nota>= 6) {
			System.out.println("Mas pode tentar de novo");
		}
	}
	
	}
	
}
