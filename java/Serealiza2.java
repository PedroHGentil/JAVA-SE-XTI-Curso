package br.com.xti.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import br.com.xti.poo.Conta;

public class Serealiza2 {
	
	public void armazenarContas(ArrayList<Conta> contas) throws Exception {
		
		try(FileOutputStream fos = new FileOutputStream("C:/xti/files/contas.ser")){
			try(ObjectOutputStream oos = new ObjectOutputStream(fos)){
				oos.writeObject(contas);
			    }	
		}
}		
	
	public ArrayList<Conta> recuperarContas() throws Exception {
	try(FileInputStream fis = new FileInputStream("C:/xti/files/contas.ser")){
		try(ObjectInputStream ois = new ObjectInputStream(fis)){
			return (ArrayList<Conta>) ois.readObject();
		    }	
		} 
		//return Contas;
	} 

	
	
	public static void main(String[] args) throws Exception  {
		
		ArrayList<Conta> contas = new ArrayList<>();
		
		contas.add(new Conta("Ricardo", 10500.50));
		contas.add(new Conta("João", 15000.70));
		contas.add(new Conta("Pedro", 12000.30));
		contas.add(new Conta("David", 18500.10));
		contas.add(new Conta("Vinicius", 7500.40));
		contas.add(new Conta("Marcelo", 23500.90));
		
		Serealiza2 operação = new Serealiza2();
		operação.armazenarContas(contas);
		

	}

} 
