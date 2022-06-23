package br.com.xti.java;

import java.util.Calendar;
import java.util.Date;

public class Datas {

	public static void main(String[] args) {
		
		/* 01 de Janeiro 1970 */
		System.out.println(System.currentTimeMillis());
		
		Date agora = new Date();
		System.out.println(agora);
		
		Date data = new Date(1_000_000_000_000L);
		System.out.print(data.compareTo(agora));
		
		/* GregorianCalendar */
		Calendar c = Calendar.getInstance();
		c.set(1980, Calendar.FEBRUARY, 12);
		System.out.println(c.getTime());
		
		/* Altera */
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.getTime());
		
		c.clear(Calendar.MINUTE);
		c.clear(Calendar.SECOND);
		System.out.print(c.getTime());
		
		c.add(Calendar.DAY_OF_MONTH, 1);
		c.clear(Calendar.SECOND);
		System.out.println(c.getTime());
		
		c.roll(Calendar.DAY_OF_MONTH, 20); //nao altera unidade superior
		
		/* Saudação */
		Calendar c1 = Calendar.getInstance();
		int hora = c.get(Calendar.HOUR_OF_DAY);
		
		if(hora<=12){
			System.out.println("Bom Dia");
		} else if (hora>12&&hora<18) {
			System.out.println("Bom Tarde");
		} else {
			System.out.println("Boa Noite");
		}
		
			
		
		
		
	}

}
