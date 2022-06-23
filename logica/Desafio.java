package br.com.xti.logica;
import java.util.ArrayList;

public class Desafio{
	
	public static void main(String[] args){
	ArrayList<Integer> Fibonacci = new ArrayList<Integer>();
	
	int A = 0;
	int B = 0;
	int C = 0;
	
	while(C <= 34){
		
		if((A == 0) && (B == 0)){
		C = A + B;
		A = B;
		B = C;	
		B++;
		Fibonacci.add(C);
		} else {
		C = A + B;
		A = B;
		B = C;	
		Fibonacci.add(C);
		}
	}
	System.out.println(Fibonacci);
		
	}
	
	
	

}
