package Server;

import java.net.*;
import java.io.*;
import java.util.*;

public class Server {
    public static int PORT=3000;

    public Server(){
        ServerSocket serverSocket=null;

        try
        {
            serverSocket = new ServerSocket(PORT);
            System.out.println("\nServer waiting for client on port " +  serverSocket.getLocalPort());

            // server infinite loop
            while(true)
            {
                Socket socket = serverSocket.accept();
                new ServerThread(socket);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
            try
            {
                serverSocket.close();
            }
            catch(Exception ex)
            {}

        }

    }


    public static void main(String[] args) throws IOException, InterruptedException
    {
        Server s=new Server();
    }

}

