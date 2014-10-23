package com.lallen.echo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by latoyaallen on 10/23/14.
 */
public class EchoServer {
    public static void main(String[] args) throws Exception {
        int portNumber = 4444;
        System.out.println("Server started");
        ServerSocket serverSocket = new ServerSocket(portNumber);
        try {
            Socket clientSocket = serverSocket.accept();
            System.out.println("Accepted Connection");
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            String inputString;
            // Initiate conversation with client

            while ((inputString = in.readLine()) != null) {
                out.println(inputString);
            }
            System.out.println("Closing connection");
            out.close();
            in.close();
            clientSocket.close();

        } finally {
            serverSocket.close();

        }
    }
}
