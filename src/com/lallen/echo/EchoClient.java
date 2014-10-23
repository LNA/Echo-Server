package com.lallen.echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by latoyaallen on 10/23/14.
 */
public class EchoClient {
    public static void main(String[] args) throws Exception {
        try {
            int portNumber = 4444;
            Socket echoSocket = new Socket("localhost", portNumber);
            PrintWriter out   = new PrintWriter(echoSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
        } catch (Exception e) {
            System.err.println("Error in EchoClient");
            System.exit(1);
        }

        //While loop implements the communication between the client and server.
        PrintWriter out     = new PrintWriter(System.out, true);
        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
        String fromServer;
        String fromUser;

        while ((fromServer = stdIn.readLine()) != null) {
            System.out.println("Echo from server: " + fromServer);
            if (fromServer.equals("Bye"))
                break;

            fromUser = stdIn.readLine();
            if (fromUser != null) {
                System.out.println("Client Says: " + fromUser);
                out.println(fromUser);
            }

        }


    }
}
