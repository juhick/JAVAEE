package Experiment_06_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ForkJoinPool;

public class MyServer {
    static public void main(String[] args){
        try {
            ServerSocket server = new ServerSocket(1680);
            Socket socket = server.accept();

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );
            PrintWriter out = new PrintWriter(socket.getOutputStream());

//            BufferedReader sin = new BufferedReader(
//                    new InputStreamReader(System.in)
//            );

            String s;
            while(!(s = in.readLine()).equals("bye")){
                System.out.println("# Received from Client:   " + s);
                double r = Double.parseDouble(s);
                double area = 3.14 * r * r;
                String response = Double.toString(area);
                out.println("圆的半径为：" + r + "  圆的面积为：" + response);
                out.flush();
            }
            System.out.println("The connection is closing...");
            in.close();
            out.close();
            socket.close();
            server.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
