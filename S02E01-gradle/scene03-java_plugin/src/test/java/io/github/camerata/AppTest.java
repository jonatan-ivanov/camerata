package io.github.camerata;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void appShouldHaveGreeting() {
        assertNotNull("app should have a greeting", new App().getGreeting());
    }
}
