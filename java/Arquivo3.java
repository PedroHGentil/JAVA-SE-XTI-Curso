package br.com.xti.java;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import br.com.xti.poo.Conta;

public class Arquivo3 {
	
	public void armazenarContas(ArrayList<Conta> contas) throws IOException {
		Path path = Paths.get("C:/xti/files/contas.txt");
		Charset utf8 = StandardCharsets.UTF_8;
		try(BufferedWriter writer = Files.newBufferedWriter(path, utf8)){
			for(Conta conta : contas) {
				writer.write(conta.getCliente() + ":" + conta.getSaldo() + "\n");
			}
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		
		ArrayList<Conta> contas = new ArrayList<>();
		
		contas.add(new Conta("Ricardo", 10500.50));
		contas.add(new Conta("João", 15000.70));
		contas.add(new Conta("Pedro", 12000.30));
		contas.add(new Conta("David", 18500.10));
		contas.add(new Conta("Vinicius", 7500.40));
		contas.add(new Conta("Marcelo", 23500.90));
		
		Arquivo3 operação = new Arquivo3();
		operação.armazenarContas(contas);
		

	}

}
