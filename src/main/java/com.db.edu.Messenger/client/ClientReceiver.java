package com.db.edu.Messenger.client;

import com.db.edu.Messenger.client.clientProcessor.ClientConnector;
import com.db.edu.Messenger.exceptions.ClientConnectionException;

public class ClientReceiver {
    public static void main(String[] args) {
        try {
            ClientConnector clientConnector = new ClientConnector(8081);

            try {
                while (true) {
                    String message = clientConnector.receive();
                    clientConnector.print(message);
                }

            } catch (ClientConnectionException e) {
                System.out.println("Connection was closed");
                clientConnector.closeConnection();
            }

        } catch (ClientConnectionException e) {
            System.out.println(e.getMessage());
        }
    }
}