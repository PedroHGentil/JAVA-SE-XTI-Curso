package br.com.xti.logica;
import javax.swing.JOptionPane;
/**
*Calcular o IMC
*IMC = pesoEmQuilogramas / (alturaEmMentros * alturaEmMetros)
*/
public class IMC {
	public static void main (String[] args){
		String peso = JOptionPane.showInputDialog("Qual seu peso em quilogramas?");
		String altura = JOptionPane.showInputDialog("Qual sua altura?");
		
		double pesoEmQuilogramas = Double.parseDouble(peso);
		double alturaEmMetros = Double.parseDouble(altura);
		double imc = pesoEmQuilogramas / (alturaEmMetros * alturaEmMetros);
		String msg = (imc>=20 && imc<=25) ? "Peso Ideal" : "Nao esta no peso ideal";
		msg = "IMC = " + imc + "\n" + msg;
		JOptionPane.showMessageDialog(null, msg);
		System.out.println("IMC = "+ imc);
		System.out.println(msg);
		
		
	}
	
}