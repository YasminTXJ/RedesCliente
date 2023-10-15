package view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class Tela extends JFrame {

	private JPanel contener;
	private JTextField texto;
	private JButton btnEnviar;
	

    public Tela() {
    	contener = new JPanel();
		contener.setBackground(new Color(143, 191, 231));
		contener.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contener);
		contener.setLayout(null);
		
		texto = new JTextField();
		texto.setBounds(10, 202, 727, 157);
		contener.add(texto);
		texto.setColumns(10);
		
		btnEnviar = new JButton("Enviar");
		btnEnviar.setBounds(628, 369, 85, 21);
		contener.add(btnEnviar);
      
    }
    public JButton getBotEnviar() {
		return btnEnviar;
	}
    public String getTexto() {
		return texto.getText();
	}


}
