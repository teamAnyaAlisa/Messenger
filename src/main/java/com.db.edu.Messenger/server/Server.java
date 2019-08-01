package com.db.edu.Messenger.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private static int port = 8080;
    private static ServerSocket serverSocket;

    public static void main(String[] args) {
        try {
            serverSocket = new ServerSocket(port);
        } catch (IOException e) {
            System.out.println("Can`t start server");
        }

        listenConnection();
    }
    public static void listenConnection() {
        while (true) {
            try {
                Socket client = serverSocket.accept();
                ClientLoggingSession clientLoggingSession = new ClientLoggingSession(client);
                clientLoggingSession.start();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void close() {

    }

}
