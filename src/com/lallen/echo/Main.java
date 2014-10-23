package com.lallen.echo;

import java.net.ServerSocket;

/**
 * Created by latoyaallen on 10/14/14.
 * http://introcs.cs.princeton.edu/java/84network/EchoServer.java
 */
public class Main {
    public static void main(String[] args){
        try {
            int port = 4444;
            EchoServer server = new EchoServer(new ServerSocket(port));
            server.run();
        }
        catch (Exception e) {g
            System.out.println("Server Error in Main.");
        }
    }
}
