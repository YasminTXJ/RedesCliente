package principal;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {
	
	public static void main(String[] args)throws UnknownHostException, IOException{
		
		try {
			Socket cliente = new Socket("127.0.0.1", 12348);
			System.out.println("O cliente se conectou ao servidor!");
			
			Scanner teclado = new Scanner(System.in);
			Scanner chegada = new Scanner(cliente.getInputStream());
			
			/*Declarando e criando um fluxo de dados*/
			PrintStream saida = new PrintStream(cliente.getOutputStream());
			
			String msg="";
			do {
				System.out.println("Informe a mesagem a ser enviada");
				msg = teclado.nextLine();
				saida.println(msg);
				//mandei a mensagem para o seridor
				String resposta = chegada.nextLine();
				System.out.println("A resposta para a mensage ("+msg+")" + "é" + resposta);
				System.out.println("-----------------------------------");
				
			}while(msg.length() != 0);
			
			
			cliente.close();
			
		}catch (Exception e) {
			System.out.println("Problema na criacao de conexao com o servidor");
		}
		
	
		
	
	}
}
