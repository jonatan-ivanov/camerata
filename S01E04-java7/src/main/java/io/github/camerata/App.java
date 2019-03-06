package io.github.camerata;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        brokenRead();
    }
    
    static void brokenRead() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(getGreetingsAsStream()));
        String line = bufferedReader.readLine();
        while (line != null) {
            System.out.println(line);
            line = bufferedReader.readLine();
        }
    }

    static InputStream getGreetingsAsStream() {
        return new ByteArrayInputStream(getGreetings().getBytes());
    }

    static String getGreetings() {
        return "Hello world.\nHello darkness my old friend.";
    }
}
