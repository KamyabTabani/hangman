package client;

import server.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Handler extends javax.swing.JFrame implements Runnable,ClientInterface {
    private Client2Server clientinput;
    private boolean running;
    ObjectInputStream in = null;
    ObjectOutputStream out = null;
    
    public void setClientinput(Client2Server clientinput) {
        this.clientinput = clientinput;
    }
    private Socket clientSocket = null;
    

    Handler(String host, int port, Client2Server clientinput) throws UnknownHostException, IOException {
        this.clientinput = clientinput;
        this.clientSocket = new Socket(host, port);
        
        if (this.clientSocket == null) {
            System.out.println("socket null");
        }
        this.out = new ObjectOutputStream(this.clientSocket.getOutputStream());
        this.in = new ObjectInputStream(this.clientSocket.getInputStream());
       
    }

    @Override
    public void run() {
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);

        running = true;

        while (running) {
            if (clientinput.getaction() == 9) {
                try {
                    running = false;
                    out.close();
                    in.close();
                    clientSocket.close();
                } catch (IOException ex) {
                    Logger.getLogger(Handler.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
    }

    public void stop() {
        running = false;
    }

    @Override
    public Server2Client sendclientanswer(Client2Server clientanswer) {
        try {
            out.reset();
            out.writeObject(clientanswer);
            out.flush();
        } catch (IOException ex) {
            Logger.getLogger(Handler.class.getName()).log(Level.SEVERE, null, ex);
        }

        Server2Client a = new Server2Client();
        Object serverObj = new Object();
        try {
            serverObj = in.readObject();

        } catch (IOException ex) {
            Logger.getLogger(Handler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException cnfe) {
            System.out.println(cnfe.toString());
            return null;
        }
        
        if (serverObj instanceof Server2Client) {
            a = (Server2Client) serverObj;
            return a;
        }else
            System.out.println("Not instance");
        System.out.println("Returning nothing");
        return null;

    }

    @Override
    public void setEnvironment(final Server2Client serveranswer) {
    }

}
