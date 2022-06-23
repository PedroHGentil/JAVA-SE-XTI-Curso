package br.com.xti.logica;
import java.util.Random;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Game {
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		System.out.println("Qual e o seu palpite?");
		int palpite = s.nextInt();
		
		Random n = new Random();
		int dado = n.nextInt(6)+1; //0-5
	
	System.out.println("Palpite = " + palpite);
	System.out.println("dado = " + dado);
		
		if(palpite == dado){
		System.out.println("Acertou");
		} else{ 
		System.out.println("Voce errou");
		
		}
	}
}