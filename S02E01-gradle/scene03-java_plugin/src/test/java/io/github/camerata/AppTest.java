package io.github.camerata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {
    @Test
    void appShouldHaveGreeting() {
        assertThat(new App().getGreeting()).isNotEmpty();
    }
}
