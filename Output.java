package apresentacao;

import javax.swing.*;

public class Output extends JFrame {
	public Output(String msg) {
		JOptionPane.showMessageDialog(null, msg, "Resultados da Batalha",JOptionPane.DEFAULT_OPTION );
	}
}
