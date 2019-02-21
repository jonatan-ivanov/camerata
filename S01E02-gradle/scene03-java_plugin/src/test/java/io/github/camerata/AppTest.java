package io.github.camerata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {
    @Test
    void appShouldGreetYouProperly() {
        assertThat(new App().getGreeting()).isEqualTo("Hello world! :)");
    }

    @Test
    void youShouldFeelLucky() {
        assertThat(new App().imFeelingLucky()).isNotEmpty();
    }
}
