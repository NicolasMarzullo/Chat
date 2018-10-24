package edu.unlam.cliente;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class Cliente {
	private int puerto;
	private String ip;
	
	public Cliente(int puerto, String ip) {

		this.puerto = puerto;
		this.ip = ip;
		
		try {
			Socket cliente = new Socket(ip,puerto);
			DataInputStream entrada = new DataInputStream(cliente.getInputStream());
			
			System.out.println(entrada.readUTF());
			
			entrada.close();
			cliente.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	

}
