package server;

import java.net.*;
import java.io.IOException;

import java.net.Socket;

public class Server {

    static final String USAGE = "java Server [hostname] [port] ";
    static String filename = "words.txt";

    public static void main(String[] args) throws IOException {

        int port = 2222;
        String host = "localhost";
        boolean listening = true;
        if (args.length > 1) {
            try {
                port = Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
                System.err.println(USAGE);
                System.exit(0);
            }
            host=args[0];
        
        if (args[0].equalsIgnoreCase("-h") || args[0].equalsIgnoreCase("-help")) {
                   System.out.println(USAGE);
                   System.exit(1);
        }

        }

        try {
            
            InetAddress addr = InetAddress.getByName(host);
            ServerSocket serversocket = new ServerSocket(port, 1000, addr);

            while (listening) {   
                System.out.println("Listening to connections...");
                Socket clientsocket = serversocket.accept();
                
                Handler hangmanhandler = new Handler(clientsocket, filename);
                hangmanhandler.setPriority(hangmanhandler.getPriority() + 1);
                hangmanhandler.start();
            }
            serversocket.close(); 
        } catch (IOException e) {
            System.out.println(e);
            System.exit(0);
        }

    }
}
