package edu.unlam.servidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	private int puerto;
	private int ip;
	
	public Server(int puerto, int ip) {
		this.puerto = puerto;
		this.ip = ip;
		
		
		
		try {
			ServerSocket servidor = new ServerSocket(puerto);
			System.out.println("SERVER INICIADO - Esperando conexiones de clientes ...");
			
			Socket cliente = servidor.accept();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
