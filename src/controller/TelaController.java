package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;

import view.Tela;

public class TelaController implements ActionListener {
	private Tela  view;
	private Socket cliente;
	
	public TelaController(Tela view, Socket cliente) {
		this.view = view;
		this.cliente = cliente;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== view.getBotEnviar()  && !view.getMensagem().isEmpty()) {
			/*Declarando e criando um fluxo de dados*/
			PrintStream saida;
			try {
				saida = new PrintStream(cliente.getOutputStream());
				String msg = view.getMensagem();
				saida.println(msg);
			    
				//mandei a mensagem para o seridor
			} catch (IOException e1) {
				System.out.println("Problema na criacao de conexao com o servidor e enviar msg");
			}
			
		}
	}

}
