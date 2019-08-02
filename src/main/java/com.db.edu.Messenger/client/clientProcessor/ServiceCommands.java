package com.db.edu.Messenger.client.clientProcessor;

public class ServiceCommands {
    private final String sender = "#sender";
    private final String receiver = "#receiver";
    private final String close = "#close";

    public String sender() { return sender; }

    public String receiver() { return receiver; }

    public String close() { return close; }
}