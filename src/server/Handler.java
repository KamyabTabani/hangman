package server;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.io.IOException;
import java.net.Socket;

public class Handler extends Thread implements Serializable {

    private Socket clientSocket;
    protected String chosenword;
    Server2Client clientdata = new Server2Client();
    protected String Filename;
    Textfile file;
    
    Handler(Socket s, String filename) {
        
            file = new Textfile();
            Filename = filename;
            this.clientSocket = s;
            
            clientdata.score = 0;
            clientdata.FailAttempts = 10;
            clientdata.games = 0;
            clientdata.message = "";
            clientdata.info = "";

            try {
                chosenword = file.chooseword(filename, file.countlines(filename));
            } catch (IOException ex) {
                Logger.getLogger(Handler.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Chosenword= "+chosenword);
            
            clientdata.word = new StringBuffer(file.dashme(chosenword));
            
    }

    @Override
    public void run() {
        try {
            boolean running = true;
            Object clientObj;
            ObjectInputStream in = null;
            ObjectOutputStream out = null;
            
            try {
                out = new ObjectOutputStream(clientSocket.getOutputStream());
            } catch (IOException e) {
                System.out.println(e.toString());
            }
           
            try {
                in = new ObjectInputStream(clientSocket.getInputStream());
            } catch (IOException e) {
                System.out.println(e.toString());
                return;
            }
           
            while (running) {
                
                try {
                    clientObj = in.readObject();
                    
                } catch (ClassNotFoundException cnfe) {
                    System.out.println(cnfe.toString());
                    return;
                } catch (OptionalDataException ode) {
                    System.out.println(ode.toString());
                    return;
                } catch (IOException ioe) {
                    System.out.println(ioe.toString());
                    return;
                }
                Hangme hangme = new Hangme();
                if (clientObj instanceof Client2Server) {
                    if (((Client2Server) clientObj).getaction() == 1) {
                        hangme.calculate(chosenword, clientdata, (Client2Server) clientObj);
                    }
                    else if (((Client2Server) clientObj).getaction() == 2) {
                    
                        clientdata.FailAttempts = 10;
                        clientdata.message = "";
                        clientdata.info = "";
                    
                        chosenword = file.chooseword(Filename, file.countlines(Filename));
                        System.out.println(chosenword);
                        clientdata.word = new StringBuffer(file.dashme(chosenword));
                    }
                    else if (((Client2Server) clientObj).getaction() == 3) {
                        running=false;
                    }
                }
                
                try {
                    out.reset();
                    out.writeObject(clientdata);
                    out.flush();
                } catch (IOException e) {
                    System.out.println(e.toString());
                }

            }
            

            try {
                out.close();
                in.close();

            } catch (IOException ioe) {
                System.out.println(ioe.toString());
            }

            System.out.println("Connection Closed");
            clientSocket.close();
        } catch (IOException e) {
            System.err.println(e.toString());
        }
    }
}
