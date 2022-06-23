package br.com.xti.logica;
public class Switch {
	public static void main(String[] args){
		char sexo = 'M';
				switch(sexo) {
				case 'M' :
				System.out.println("Macho");
				break;
				case 'F' :
				System.out.println("Femea");
				break;
				default:
				System.out.println("Outro");
				}
	}
}
// Break é utilizado se necessario