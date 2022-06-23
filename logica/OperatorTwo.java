package br.com.xti.logica;
public class OperatorTwo {
	public static void main(String[] args) {
	int x = 6;
	System.out.println((x>=1) && (x<=10)); //comparacao entre valores
	System.out.println((x>=3) || (x<=5)); // comparacao OU
	System.out.println(!(x>=3) || (x<=5));// ! atributo de negacao inverte a resposta
	x += 3; // mesma coisa x = x + 3
	x -= 3; // mesma coisa x = x - 3
	x *= 3; // mesma coisa x = x * 3
	x /= 3; // mesma coisa x = x / 3
	x %= 3; // mesma coisa x = x % 3
	}
}