package br.com.xti.java;

public class StringToken {

	public static void main(String[] args) {
		
		String s = "XHTML; CSS; JavaScript; jQuery; Java";
		s = "Vem ja trabalhar na XTI";
		String[] tokens = s.split(" ");
		//System.out.println(tokens.length + tokens);
		for (String token : tokens) {System.out.println(token);}
		
		
	}
}
