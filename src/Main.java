import java.io.IOException;

public class Main {
	public static void main(String[] args) {
	    try {
	        final String ip = "239.255.80.84";
	        final int port = 8082;
	        Client client = new Client(ip, port);
	        System.out.println("Je suis le client, je reçois");
	        client.printMessage();
	        client.close();
	    } catch (IOException ex) {
	        ex.printStackTrace();
	    }
	}
}
