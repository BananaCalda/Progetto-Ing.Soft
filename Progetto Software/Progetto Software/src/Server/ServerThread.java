package Server;

import java.net.Socket;

public class ServerThread extends Thread{
    Socket socket;
    public ServerThread(Socket s){
        socket = s;
        this.start();
    }
    public void run(){

    }
}
