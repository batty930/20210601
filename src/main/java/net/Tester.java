package net;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class Tester {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("ppt.cc", 23);


        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
