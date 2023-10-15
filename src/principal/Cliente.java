package principal;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;


import controller.TelaController;
import view.Tela;



public class Cliente {
	
	public static void main(String[] args)throws UnknownHostException, IOException{
		
		try {
			Socket cliente = new Socket("127.0.0.1", 12348);
			System.out.println("O cliente se conectou ao servidor!");
			
			Tela t = new Tela();
			TelaController contr = new TelaController(t,cliente);
			t.registerListener(contr);
			t.setVisible(true);
			
			
			
			
		}catch (Exception e) {
			System.out.println("Problema na criacao de conexao com o servidor");
		}
		
	
		
	
	}
}
