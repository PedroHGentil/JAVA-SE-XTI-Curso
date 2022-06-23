package br.com.xti.java;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Numero {

	public static void main(String[] args) throws ParseException {
		
		double saldo = 123_456.789;
		NumberFormat f = NumberFormat.getInstance();
		System.out.println(f.format(saldo)); //Gen�ricos
		
		f = NumberFormat.getIntegerInstance();
		System.out.println(f.format(saldo)); //Inteiros
		
		f = NumberFormat.getPercentInstance();
		System.out.println(f.format(0.25)); //Percentual
		
		f = NumberFormat.getCurrencyInstance();
		System.out.println(f.format(saldo)); //Moeda
		
		f.setMaximumFractionDigits(1);
		
		/* Internacionaliza��o */
		
		f = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(f.format(saldo));
		
		f = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		System.out.println(f.format(saldo));
		
		/* Convers�o de valores */
		f = NumberFormat.getCurrencyInstance();
		System.out.println(f.parse("R$ 1.100,25"));
		

	}

}
