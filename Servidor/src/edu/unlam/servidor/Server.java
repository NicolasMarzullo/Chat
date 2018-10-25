package edu.unlam.servidor;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	private int puerto;

	public Server(int puerto) {
		this.puerto = puerto;

		try {
			ServerSocket servidor = new ServerSocket(puerto);
			System.out.println("Server ok. Waiting for clients");

			Socket clienteConectado = servidor.accept(); // Acepto a un cliente
			DataInputStream entradaServer = new DataInputStream(clienteConectado.getInputStream()); // creo una entrada

			System.out.println(entradaServer.readUTF()); // me quedo esperando que el cliente me mande un mensaje y lo imprimo
			
			
			clienteConectado.close();
			entradaServer.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
