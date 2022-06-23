package br.com.xti.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ControleLabel extends JFrame {

	public ControleLabel() {
		super("Label");
		
		Container c = getContentPane();
		
		Font fonte = new Font("serif", Font.BOLD | Font.ITALIC, 28);
		JLabel label = new JLabel("Label Simples");
		label.setToolTipText("Meu ToolTip");
		label.setFont(fonte);
		label.setForeground(Color.BLUE);
		
		ImageIcon icon = new ImageIcon(getClass().getResource("foto/Screenshot_1.png"));
		JLabel imagem = new JLabel(icon);
		
		c.setLayout(new FlowLayout());
		c.add(label);
		c.add(imagem);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new ControleLabel();

	}

}
