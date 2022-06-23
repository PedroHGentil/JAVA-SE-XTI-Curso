package br.com.xti.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo {

	public static void main(String[] args) throws IOException {
		
		Path path = Paths.get("C:/xti/files/texto.txt");
		System.out.println(path.toAbsolutePath()); //Destinatario
		System.out.println(path.getParent()); //Arquivo que precede o destinat�rio
		System.out.println(path.getRoot()); //Raiz do sistema
		System.out.println(path.getFileName()); //Retorna o nome do arquivo

		/* CRIA��O DE DIRET�RIOS */
		Files.createDirectories(path.getParent());
		
		/* ESCREVER E LER ARQUIVOS */
		byte[] bytes = "Meu Texto".getBytes();
		Files.write(path, bytes);
		
		byte[] retorno = Files.readAllBytes(path);
		System.out.println(new String(retorno));
	
	}

}
