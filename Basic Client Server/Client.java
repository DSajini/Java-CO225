import java.io.*;
import java.net.*;
public class Client{
	
	public void create(){
		try{
			Socket chat = new Socket("127.0.0.1",5000);
			InputStreamReader stream = new InputStreamReader(chat.getInputStream());
			BufferedReader reader = new BufferedReader(stream);
			
			String msg = reader.readLine();
			
			System.out.println(msg);
			
			reader.close();
		}
		catch(IOException ex){
			ex.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		Client clientOne = new Client();
		clientOne.create();
	}
}