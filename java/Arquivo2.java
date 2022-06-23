package br.com.xti.java;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo2 {

	public static void main(String[] args) throws IOException {
		
		Path path = Paths .get("C:/xti/files/texto.txt");
		Charset utf8 = StandardCharsets.UTF_8;
		
		//ESCREVE
		try {BufferedWriter w = Files.newBufferedWriter(path, utf8);
		w.write("Texto"); // Escreve dentro do arquivo txt
		w.write("Texto");
		w.flush();        // Compila dentro do arquivo txt
		w.close();        // Fecha o arquivo txt
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Block finally é apicado autmoaticamente apartir do java 7
		
		//LEITURA
	/*try(BufferedReader r = Files.newBufferedReader(path, utf8)) {
			String line = null;
			while((line = reader.readLine())!= null) {
				System.out.println(line);
			} 
			}catch (IOException e){
				e.printStackTrace();*/
			}
		
	}


