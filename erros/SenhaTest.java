package br.com.xti.erros;

public class SenhaTest {

	static void autenticar(String senha) throws SenhaInvalidException {
	if("123".equals(senha)) {
		System.out.println("Autenticado!");
	}else {
		throw new SenhaInvalidException("Senha Incorreta!");
	}
}
	
	public static void main(String[] args) {
		try {
			autenticar("123");
		}catch(SenhaInvalidException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		

	}

}
