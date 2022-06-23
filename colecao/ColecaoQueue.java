package br.com.xti.colecao;

import java.util.LinkedList;
import java.util.Queue;

public class ColecaoQueue {

	public static void main(String[] args) {
		
		//FIFO
		Queue<String> fila = new LinkedList<>();
		fila.add("Ricardo");
		fila.add("Sandra");
		fila.add("Beatriz");
		System.out.println(fila);
		
		System.out.println(fila.peek());
		System.out.println(fila.poll());//remove o elemento do inicio da fila
		
		/*Outros Metodos disponiveis em linkedlist*/
		
		LinkedList<String> f= (LinkedList<String>) fila;
		f.addFirst("Caio"); // colocado no inicio da fila
		f.addLast("Beatriz"); // coloca no fim da fila
		f.peekFirst();
		f.peekLast();
		
		System.out.println(f.peekFirst());
		System.out.println(f.peekLast());
	}

}
