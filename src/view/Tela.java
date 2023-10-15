package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controller.TelaController;

import javax.swing.ImageIcon;
import javax.swing.JButton;


public class Tela extends JFrame {

	private JPanel contener;
	private JTextField mensagem;
	private JLabel bemvindo;
	private JButton botEnviar;

	


	public String getMensagem() {
		return mensagem.getText();
	}


	public void setMensagem(JTextField mensagem) {
		this.mensagem = mensagem;
	}


	public JButton getBotEnviar() {
		return botEnviar;
	}


	public void setBotEnviar(JButton botEnviar) {
		this.botEnviar = botEnviar;
	}


	public Tela() {
		setTitle("SGL ");
		setIconImage(Toolkit.getDefaultToolkit().getImage(".\\src\\imagens\\Icon.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 533);
		contener = new JPanel();
		contener.setBackground(new Color(143, 191, 231));
		contener.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contener);
		contener.setLayout(null);
		
		JLabel MsgLogin = new JLabel("Digite a mensagem");
		MsgLogin.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		MsgLogin.setBounds(253, 203, 200, 39);
		contener.add(MsgLogin);
		
		mensagem = new JTextField();
		mensagem.setBounds(253, 253, 380, 31);
		contener.add(mensagem);
		mensagem.setColumns(10);
		
		 botEnviar = new JButton("Enviar");
		botEnviar.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
		
	
		
		botEnviar.setBounds(375, 412, 111, 39);
		contener.add(botEnviar);
		
		bemvindo = new JLabel("Seja Bem vindo!");
		bemvindo.setFont(new Font("Arial Black", Font.PLAIN, 20));
		bemvindo.setBounds(329, 112, 233, 31);
		contener.add(bemvindo);
		
		setResizable(false);
		
	}
	public void registerListener(TelaController controller) {
		botEnviar.addActionListener(controller);
		
	}
	
}