package apresentacao;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import regrasNegocio.Jogo;

public class Tela extends JFrame implements ActionListener {
	
	JButton start;
	JLabel label = new JLabel();
	JLabel message = new JLabel();
	public Tela() {
		organizador();
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void organizador() {
		start = new JButton("Começar!");
		start.addActionListener(this);
		setLayout( new BorderLayout());
		Input input = new Input();
		Input input2 = new Input();
		message.setText("\tSeja bem vindo ao Senhor dos Cafés!");
		
		add(input, BorderLayout.EAST);
		add(input2, BorderLayout.WEST);
		add(message, BorderLayout.CENTER);
		add(start, BorderLayout.SOUTH);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Jogo j = new Jogo();
		j.iniciar();
		
	}
}
