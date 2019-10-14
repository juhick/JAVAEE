package Experiment_06_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class MyClient {
    static public void main(String[] args){
        try{
            Socket socket = new Socket("127.0.0.1", 1680);

            PrintWriter out = new PrintWriter(socket.getOutputStream());
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );

            BufferedReader sin = new BufferedReader(
                    new InputStreamReader(System.in)
            );

            String s;
            do{
                s = sin.readLine();
                out.println(s);
                out.flush();

                if (!s.equals("bye")){
                    System.out.println("@ Server response:  " + in.readLine());
                }else{
                    System.out.println("The connection is closing...");
                }

            }while (!s.equals("bye"));

            out.close();
            in.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
