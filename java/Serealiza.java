package br.com.xti.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import br.com.xti.poo.Conta;

public class Serealiza {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		String[] nomes = {"Ricardo", "Beatriz", "Sandra"};
		
		Conta conta1 = new Conta("XTI", 111_222_33);
		Conta conta2 = new Conta("XTP", 111_222_33);
		
		/*ESCRITA DE OBJETO*/
		FileOutputStream fos = new FileOutputStream("C:/xti/files/objeto.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(conta1);
		oos.writeObject(conta2);
		oos.close();
		
		/*LEITURA DE OBJETO*/
		FileInputStream fis = new FileInputStream("C:/xti/files/objeto.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Conta c1 = (Conta) ois.readObject();
		Conta c2 = (Conta) ois.readObject();
		ois.close();
		
		c1.exibeSaldo();
		c2.exibeSaldo();
		
		
	}

}
