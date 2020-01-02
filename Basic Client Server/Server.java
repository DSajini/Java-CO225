import java.io.*;
import java.net.*;
public class Server{
	public void create(){
		
		try{
		ServerSocket chatServer = new ServerSocket(5000);
		while(true){
			Socket sock1 = chatServer.accept();
			
			PrintWriter writer = new PrintWriter(sock1.getOutputStream());
			writer.println("msg 1");
			
			writer.close();
		}
		}
		catch(IOException ex){
			ex.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		Server serverOne = new Server();
		serverOne.create();
	}
}