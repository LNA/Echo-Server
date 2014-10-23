package com.lallen.echo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by latoyaallen on 10/23/14.
 */
public class EchoServer {
    private ServerSocket serverSocket;

    public EchoServer(ServerSocket serverSocket) {
        serverSocket = serverSocket;
    }

    public void run() throws Exception {
        System.out.println("I'm in run");
    }
}
