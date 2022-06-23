package br.com.xti.erros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {

	public static void dividir(Scanner p) throws InputMismatchException, ArithmeticException {
		
		
		System.out.print("Numero: ");
		int a = p.nextInt();
		System.out.print("Divisor: ");
		int b = p.nextInt();
		System.out.println(a/b);
		
	}
	
	public static void main(String[] args) {
		
		Scanner p = new Scanner(System.in);
		boolean continua = true;
		
		do {
			
			try {
				
				
				continua = false;
	    
			} catch(InputMismatchException | ArithmeticException e1) {
				System.err.println("Numero Invalido!");
				p.nextLine();
			} 
				
			} 
		while(continua);
	} //getMessage resgata erros em string.
	
}