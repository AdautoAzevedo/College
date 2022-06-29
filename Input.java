package apresentacao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Input extends JPanel implements ActionListener {
	private JLabel nome;
	private JTextField field;	
	private String[] arma = {"Espada", "Martelo", "Lança", "Espada", "Arco", "Atiradeira", "Bastão", "Chaco"};
	private JComboBox armas;
	
	public Input() {
		nome = new JLabel("Digite seu nome: ");
		nome.setBackground(Color.BLACK);
		field = new JTextField();
		field.addActionListener(this);
		armas = new JComboBox(arma);
		
		setLayout(new BorderLayout());
		add(nome, BorderLayout.NORTH);
		add(field, BorderLayout.CENTER);
		add(armas, BorderLayout.SOUTH);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String nome;
		nome = field.getText();
		System.out.println(nome);
	}
}