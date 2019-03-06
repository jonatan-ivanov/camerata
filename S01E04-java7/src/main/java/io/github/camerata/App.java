package io.github.camerata;

public class App {

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }

    String getGreeting() {
        return "Hello world.";
    }
}
