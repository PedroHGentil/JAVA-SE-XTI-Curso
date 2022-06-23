package br.com.xti.poo;

public class MatematicaTeste {

	public static void main(String[] args) {
		
		Matematica m = new Matematica();
		int m1 = m.maior(10, 20);
		//System.out.println(ma);
		
		double s1 = m.soma(10, 20);
		//System.out.println(so);
	
		int par = m.maior(2, 4);
		int impar = m.maior(3, 5);
		double s = m.soma(par, impar);
		//System.out.println(s);
		
		double b = m.raiz(276);
		System.out.println(b);	
	
		double total = m.somac(123, 123, 123);
		System.out.println("Total = " + total);
		
		System.out.println(m.media(5));
		System.out.println(m.media(5, 3));
		System.out.println(m.media(5, 3, 34, 56));
		System.out.println(m.media("50","30"));
		
			
		}
	
	
	
}

