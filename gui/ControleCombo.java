package br.com.xti.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ControleCombo extends JFrame implements ItemListener {

	JComboBox<String> combo;
	JLabel label;
	ImageIcon[] imagens = {
			new ImageIcon(getClass().getResource("foto/a001.png")),
			new ImageIcon(getClass().getResource("foto/a002.png")),
			new ImageIcon(getClass().getResource("foto/a003.png")),
			new ImageIcon(getClass().getResource("foto/a004.png"))
	};
	
	
	public ControleCombo() {
		super("Album de Fotos");
	
		Container c = getContentPane();
		
		combo = new JComboBox<String>();
		combo.setFont(new Font("Serif", Font.PLAIN, 26));
		combo.addItem("Família");
		combo.addItem("Manga");
		combo.addItem("Banana");
		combo.addItem("Choro");
		combo.addItemListener(this);
		
		label = new JLabel(imagens[0]);
		
		c.add(BorderLayout.NORTH, combo);
		c.add(BorderLayout.CENTER, label);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,530);
		setVisible(true);
		
	
	}
	public static void main(String[] args) {
		new ControleCombo();
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED) {
			label.setIcon(imagens[combo.getSelectedIndex()]);
		}
		
	}

}
