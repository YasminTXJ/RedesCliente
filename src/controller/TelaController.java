package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.Tela;

public class TelaController implements ActionListener {
	private Tela  view;
	
	public TelaController(Tela view) {
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== view.getBotEnviar()  && !view.getTexto().isEmpty()) {
			
		}
	}

}
