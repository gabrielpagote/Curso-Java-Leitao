package pacote;

import javax.swing.*;

public class classe {
 public static void main(String[] args) {
	JFrame jframe = new JFrame();
	String nome = "";

	do{
		nome = 	JOptionPane.showInputDialog(jframe, "Quem é o amor da sua vida?");
		if(!nome.equalsIgnoreCase("Juliana Moura")) {
		JOptionPane.showMessageDialog(null, "Você não tem medo do perigo não? Tente de novo...");
		}
	} while (!nome.equalsIgnoreCase("Juliana Moura"));
	
	JOptionPane.showMessageDialog(null, "Muito bem, é essa mesmo! <3");
}
}