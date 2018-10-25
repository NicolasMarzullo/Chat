package edu.unlam.cliente;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Cliente {
	private int puerto;
	private String ip;
	
	public Cliente(int puerto, String ip) {

		this.puerto = puerto;
		this.ip = ip;
		
		try {
			Socket enlaceServer = new Socket(ip,puerto); //Creo un cliente y se conecta con el server
			DataOutputStream salidaCliente = new DataOutputStream(enlaceServer.getOutputStream());
			
			new GUI().setVisible(true);
			
			
		
			salidaCliente.writeUTF("holis");
			
			salidaCliente.close();
			enlaceServer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

	
	

}
