package br.com.xti.colecao;

import java.util.ArrayList;
import java.util.List;

public class Colecaolist {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList();
		list.add("Futebol");
		list.add("Volei");
		list.add("Basquete");
		list.add("Natação");
		list.add("Tenis");
		list.add("Boxe");
		list.add("Hockey");
		list.add("Futebol");
		System.out.print(list);
		
		for(int i=0; i < list.size(); i++) {
			String letra = list.get(i);
			list.set(i, letra.toUpperCase());
			}
		System.out.print(list);
		System.out.print(list.indexOf("BOXE"));
		System.out.print(list.subList(2, 4));
		list.subList(2, 4).clear();
		

	}

}
