package br.com.xti.logica;
import java.util.Scanner;
public class OperatorSpecial {
	
	public static void main(String[] args){
	
	Scanner s = new Scanner(System.in);
	System.out.println("Informe o raio");
	double raio = s.nextDouble();
	
	//int idade = 6;
	//String x = (idade >= 18) ? "Maior de Idade" : "Menor de idade"; // Operador Ternário ?:
	//System.out.println(x);
	//String sexo = "M", pais = "Brasil"; // Virgula para separacao de expressoes
	
	//Diametro : 2r
	//double raio = 10;
	double diametro = 2 * raio;
	System.out.println("Diametro="+diametro);
	//Circunferencia : 2 PI r
	double pi = Math.PI;
	double circunferencia = 2 * pi * raio;
	System.out.println("Circunferencia="+circunferencia);
	//Area : PI r2
	double area = pi * (raio * raio);
	System.out.println("Area="+area);
	}
}