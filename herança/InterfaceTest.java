package br.com.xti.heran�a;

public interface InterfaceTest {

	public static void area (AreaCalculavel o) {
		System.out.println(o.calculaArea());
	}
	
	public static void volume (VolumeCalculavel o) {
		System.out.println(o.calculaVolume());
	}
	
	public static void main(String[] args) {
		
		area(new Quadrado(2));
		volume(new Cubo(2));
		
		
		
		
	}

	
	
}
