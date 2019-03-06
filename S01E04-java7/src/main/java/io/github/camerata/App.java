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

    private static void brokenRead() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(getGreetingsAsStream()));
        String line = br.readLine();
        while (line != null) {
            System.out.println(line);
            line = br.readLine();
        }
    }

    private static InputStream getGreetingsAsStream() {
        return new ByteArrayInputStream(getGreetings().getBytes());
    }

    private static String getGreetings() {
        return "Hello world.\nHello darkness my old friend.";
    }
}
