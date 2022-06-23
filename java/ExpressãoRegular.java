package br.com.xti.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressãoRegular {

	public static void main(String[] args) {
		
		boolean b = "Java".matches("java");
		System.out.println(b);
		
		/*MODIFICADORES
		 * (?i) Ignora Maiuscolo e minusculo
		 * (?x) Comentários
		 * (?m) Multilinhas
		 * (?s) Dottal
		*/
		
		b = "Java".matches("(?im)java");
		System.out.println(b);
		
		/*METACARACTERES
		 *  . qualquer caractere
		 * \d dígitos [0-9]
		 * \D não é dígitos [^0-9]
		 * \s espaços [ \t\n\x0B\f\r]
		 * \S não é espaços [^\s]
		 * \w Letra [a-zA-Z_0-9]
		 * \W não é letra 
		 * */

		b = "@".matches(".");
		b = "2".matches("\\d");
		b = "A".matches("\\w");
		b = " ".matches("\\s");
		
		b = "Pi".matches("..");
		b = "Pie".matches("...");
		b = "21".matches("\\d\\d");
		System.out.println(b);
		
		String cep = "\\d\\d\\d\\d\\d-\\d\\d\\d";
		b = "70294-070".matches(cep);
		
		/*QUANTIFICADORES
		 * X{n}    X, exatamente n vezes
		 * X{n,}   X, pelo menos n vezes
		 * X{n, m} X, pelo menos n mas não mais do que m vezes
		 * X?      X, 0 ou 1 vez
		 * X*      X, 0 ou + vezes
		 * X+      X, 1 ou + vezes
		*/
		
		b = "21".matches("\\d{2}");
		b = "123".matches("\\d{2,}");
		b = "123456".matches("\\d{2,5}");
		
		b = "70294-070".matches("\\d{5}-\\d{3}");
		b = "12/02/1980".matches("\\d{2}/\\d{2}/\\d{4}");
		System.out.println(b);
		
		/*METACARACTER DE FRONTEIRA
		 * ^ inicia
		 * $ finaliza
		 * | ou 
		 */
		b = "Pier21".matches("^Pier.*");
		b = "Pier21".matches(".*21$");
		b = "tem java aqui".matches(".*java.*");
		b = "tem java aqui".matches("^tem.*aqui$");
		b = "sim".matches("sem|não");
		
		/* AGRUPADORES
		 * [...]          Agrupamento
		 * [a-z]          Alcance
		 * [a-e][i-u]     União
		 * [a-z&&[aeiou]] Interseção
		 * [^abc]	      Exceção
		 * [a-z&&[^m-p]]  Subtração
		 * \x             Fuga literal 
		 */
		
		b = "A".matches("[a-z]");
		b = "3".matches("[0-9]");
		
		b = "true".matches("[tT]rue"); //True true
		b = "True".matches("[tT]rue | [yY]es"); //True true Yes yes
		b = "yes".matches("[tT]rue | [yY]es"); //True true Yes yes
		b = "Yes".matches("[tT]rue | [yY]es"); //True true Yes yes
		b = "Beatriz".matches("[A-Z][a-z]");
		b = "alho".matches("[^abc]lho");
		b = "crau".matches("cr[ae]u");
		
		//Validacao de E-mail
		b = "rh@xti.com.br".matches("^[a-zA-Z0-9_!#$%&'\\*+/=?{|}~^.-]+@[a-zA-Z0-9.-]+$");
		System.out.println(b);
		
		String doce = "Qual é o Doce mais doCe que o de batata doce ";
		
		Matcher matcher = Pattern.compile("(?i)doce").matcher(doce);
		while(matcher.find()) {System.out.println(matcher.group());}
		
		/*SUBSTITUIÇÕES*/
		String r = doce.replaceAll("(?i)doce", "DOCINHO");
		
		
		
		
		
		
		
	
		
	}

}
