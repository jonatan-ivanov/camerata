package io.github.camerata;

import lombok.extern.slf4j.Slf4j;

import java.util.Random;
import java.util.stream.Collectors;

@Slf4j
public class App {
    public static void main(String[] args) {
        log.info(new App().getGreeting());
    }

    String getGreeting() {
        return "Hello world! :)";
    }

    String imFeelingLucky() {
        return new Random().ints(0, 100)
            .limit(10)
            .boxed()
            .filter(number -> number % 2 == 0)
            .map(String::valueOf)
            .collect(Collectors.joining(", "));
    }

    @SuppressWarnings("unused")
    private void imFeelingUseless() {
    }
}
