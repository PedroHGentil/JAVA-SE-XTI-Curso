package br.com.xti.poo;

public class Matematica {
/**
 * 
 * @param um
 * @param dois
 * @return
 */
	int maior(int um, int dois) {
		if(um > dois) {
			return um;
		}else {
		return dois;
		}
	}
		
	double soma(double um, double dois) {
		double s = um + dois;
		return s;
		}
	
	
	double raiz(int numero) {
		double a = Math.sqrt(numero);
		int c = (int) a; 
		return c;
		}
	
	double somac(double ... numeros)//soma com infinito numeros
	{double total = 0;
		for(double n: numeros) { total+= n; }
	return total;
	}
	
	double media(int x) {
		System.out.print("media(int x) ");
		return x;
	}
	
	double media(int x, int y) {
		System.out.print("media(int x, int y) " );
		return (x + y) / 2;
	}
	
	double media(String x, String y) {
		System.out.print("media(String x, String y) ");
		int ix = Integer.parseInt(x);
		int iy = Integer.parseInt(y);
		return (ix+iy)/2;
	}
	
	double media(double ... numeros) {
		System.out.print("media(double ... numeros)");
		return this.somac(numeros)/numeros.length;
	}
}
