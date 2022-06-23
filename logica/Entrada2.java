package br.com.xti.logica;
/**
*Introducao da classe de interface Grafica JOptionPane.
*/
import javax.swing.JOptionPane;
public class Entrada2 {
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Qual e o seu nome?");
		System.out.println(nome);
		JOptionPane.showMessageDialog(null, nome);
	}
}